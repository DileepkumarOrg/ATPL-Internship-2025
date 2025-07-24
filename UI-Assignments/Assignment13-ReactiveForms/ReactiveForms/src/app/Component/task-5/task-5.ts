import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-task-5',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task-5.html',
  styleUrl: './task-5.css'
})
export class Task5 {
  form: FormGroup;
  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      name : ['',[Validators.required]],
      phones: this.fb.array([
        this.fb.group({
          number: ['', [Validators.required,Validators.min(6000000000),Validators.max(9999999999)]]
        })
      ])
    });
  }

  get phoneForms() {
    return this.form.get('phones') as FormArray;
  }

  addPhone() {
    const phone = this.fb.group({
      number: ['', Validators.required]
    });
    this.phoneForms.push(phone);
  }

  removePhone(i: number) {
    this.phoneForms.removeAt(i);
  }

  submit() {
    if (this.form.valid) {
      console.log('Submitted Phone Numbers:', this.form.value.phones);
    } 
  }

}


