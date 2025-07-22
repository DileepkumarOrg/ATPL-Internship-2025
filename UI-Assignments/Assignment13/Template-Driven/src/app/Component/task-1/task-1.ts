import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-1',
  imports: [FormsModule, CommonModule],
  templateUrl: './task-1.html',
  styleUrl: './task-1.css'
})
export class Task1 {
  userName :string = '';
  password : string =  '';
  buttonClick : boolean = false;
  onLogin(){
    console.log(`UserName : ${this.userName}, Password : ${this.password}`)
    this.buttonClick=true;
  }
  
}

