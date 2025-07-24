import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatInputModule } from "@angular/material/input";

@Component({
  selector: 'app-dialog',
  imports: [ReactiveFormsModule, CommonModule, MatInputModule],
  templateUrl: './dialog.html',
  styleUrl: './dialog.css'
})
export class Dialog {
  form : FormGroup = new FormGroup({
    name : new FormControl('',[Validators.required]),
    email : new FormControl('',[Validators.required,Validators.email]),
    phone : new FormControl('',[Validators.required, Validators.minLength(6)])
  })

  save(){
    this.form.reset();
  }
}
