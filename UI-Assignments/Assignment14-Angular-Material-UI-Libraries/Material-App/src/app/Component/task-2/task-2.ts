import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-task-2',
  imports: [ReactiveFormsModule,CommonModule,MatInputModule,MatButtonModule],
  templateUrl: './task-2.html',
  styleUrl: './task-2.css'
})
export class Task2 {
  form : FormGroup = new FormGroup({
    email : new FormControl('',[Validators.required,Validators.email]),
    password : new FormControl('',[Validators.required,Validators.minLength(6)])
  })

  save(){
    console.log(this.form.value);
  }
}
