import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-task-2',
  imports: [ReactiveFormsModule ,CommonModule],
  templateUrl: './task-2.html',
  styleUrl: './task-2.css'
})
export class Task2 {
  form : FormGroup = new FormGroup({
    name : new FormControl ('',[Validators.required]),
    email : new FormControl('',[Validators.required, Validators.email]),
    password : new FormControl('',[Validators.required,Validators.minLength(6)])
  })
  onLog(){
    this.form.reset();
  }
}
