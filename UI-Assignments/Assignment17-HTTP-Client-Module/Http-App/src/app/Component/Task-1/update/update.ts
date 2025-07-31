import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { DataService } from '../../../Services/data-service';

@Component({
  selector: 'app-update',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule,RouterLink],
  templateUrl: './update.html',
  styleUrl: './update.css'
})
export class Update implements OnInit {
  data: any;
  form!: FormGroup;

  constructor(private dataService: DataService, private route: ActivatedRoute) {}

  userData!: {
    userId: number;
  };

  ngOnInit(): void {
    this.userData = {
      userId: this.route.snapshot.params['id']
    };

    this.dataService.getUserDataByID(this.userData.userId).subscribe(res => {
      this.data = res;

      this.form = new FormGroup({
        name: new FormControl(this.data.name, [Validators.required]),
        email: new FormControl(this.data.email, [Validators.required, Validators.email])
      });
    });
  }

  submit(): void {
    if (this.form.valid) {
      this.dataService.update(this.userData.userId, this.form.value).subscribe();

    }
  }
}
