import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-task-3',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task-3.html',
  styleUrl: './task-3.css'
})
export class Task3 {
  form : FormGroup = new FormGroup({
    name : new FormControl('',[Validators.required]),
    email : new FormControl('',[Validators.required,Validators.email]),
    password : new FormControl('',[Validators.required,Validators.minLength(6)])
  })

  reset(){
    this.form.reset();
  }
}






