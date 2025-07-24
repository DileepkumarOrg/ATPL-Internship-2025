import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-task-4',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task-4.html',
  styleUrl: './task-4.css'
})
export class Task4 {
  form : FormGroup = new FormGroup({
    name : new FormControl('',[Validators.required]),
    email : new FormControl('',[Validators.required,Validators.email]),
    address  : new FormGroup({
      street : new FormControl('',[Validators.required]),
      city : new FormControl('',[Validators.required]),
      zip : new FormControl( '',[Validators.required,Validators.minLength(6),Validators.maxLength(6)])
    }) 
  })
  reset(){
    this.form.reset();
  }

  onLog(){
    console.log(this.form.value)
  }
}
