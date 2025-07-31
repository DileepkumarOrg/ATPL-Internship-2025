import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { DataService } from '../../../Services/data-service';

@Component({
  selector: 'app-add',
  imports: [CommonModule,ReactiveFormsModule ],
  templateUrl: './add.html',
  styleUrl: './add.css'
})
export class Add {
  form: FormGroup = new FormGroup({
    name: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required, Validators.email])
  });
  constructor(private addData : DataService) { }
  add(){
    const obj = this.form.value;
    this.addData.add(obj).subscribe(res=>{
      this.addData.getData();
      console.log(res)
    })
  }
}


