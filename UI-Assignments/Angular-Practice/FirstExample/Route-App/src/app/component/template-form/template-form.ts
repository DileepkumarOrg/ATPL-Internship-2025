import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-template-form',
  imports: [FormsModule,CommonModule],
  templateUrl: './template-form.html',
  styleUrl: './template-form.css'
})
export class TemplateForm {
  userObj : any = {
    firstName: '',
    lastName : '',
    isAgree : false
  }
  onSubmit(){
    debugger;
    const formValue = this.userObj;
  }
}
