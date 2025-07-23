
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-bonush-challenge',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './bonush-challenge.html',
  styleUrls: ['./bonush-challenge.css']
})
export class BonushChallenge {
  isDisplay: boolean = false;

  studentData: any[] = [];

  obj = {
    fullName: '',
    email: '',
    gender: '',
    course: '',
    comments: ''
  };

  register(form: NgForm) {
    if (form.valid) {
      this.studentData.push({ ...this.obj });
      form.reset();
      this.isDisplay = false;
    }
  }

  resetForm(form: NgForm) {
    form.reset();
    this.isDisplay = false;
  }

  display() {
    this.isDisplay = true;
  }
}