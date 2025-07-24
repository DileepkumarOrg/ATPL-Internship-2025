import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-bonus',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './bonus.html',
  styleUrl: './bonus.css'
})
export class Bonus {
  form : FormGroup = new FormGroup({
    firstName : new FormControl('',[Validators.required]),
    lastName : new FormControl('',[Validators.required]),
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



