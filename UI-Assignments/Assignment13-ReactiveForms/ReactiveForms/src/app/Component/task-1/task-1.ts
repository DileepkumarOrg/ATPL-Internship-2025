import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-1',
  imports: [ReactiveFormsModule],
  templateUrl: './task-1.html',
  styleUrl: './task-1.css'
})
export class Task1 {
  form : FormGroup = new FormGroup({
    name : new FormControl(''),
    email : new FormControl(''),
    password : new FormControl('')
  })

  onLog(){
    console.log(this.form.value);
    
  }
}


