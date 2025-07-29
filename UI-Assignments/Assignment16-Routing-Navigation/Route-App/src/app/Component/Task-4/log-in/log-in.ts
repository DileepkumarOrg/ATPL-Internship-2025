import { Component } from '@angular/core';
import { Authentication } from '../../../Service/authentication';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-log-in',
  imports: [FormsModule,RouterLink,CommonModule],
  templateUrl: './log-in.html',
  styleUrl: './log-in.css'
})
export class LogIn {
  username = '';
  password = '';
  constructor(private authService: Authentication){
  }
  login(){
    this.authService.login(this.username,this.password);
  }
}
