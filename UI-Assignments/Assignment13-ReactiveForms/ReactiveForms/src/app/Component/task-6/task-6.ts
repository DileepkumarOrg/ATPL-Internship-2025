import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { PasswordMatchValidator } from '../../validators/password-match.validator';

@Component({
  selector: 'app-task-6',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task-6.html',
  styleUrl: './task-6.css'
})
export class Task6 {
  passwordForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.passwordForm = this.fb.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', Validators.required]
      },
      { validators: PasswordMatchValidator }
    );
  }

  get password() {
    return this.passwordForm.get('password');
  }

  get confirmPassword() {
    return this.passwordForm.get('confirmPassword');
  }

  onSubmit() {
    if (this.passwordForm.valid) {
      alert('Passwords match and form submitted!');
      console.log(this.passwordForm.value);
    } else {
      this.passwordForm.markAllAsTouched();
    }
  }

}
