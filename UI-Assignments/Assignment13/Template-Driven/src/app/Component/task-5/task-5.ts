import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-5',
  imports: [FormsModule,CommonModule],
  templateUrl: './task-5.html',
  styleUrl: './task-5.css'
})
export class Task5 {
    userName :string = '';
  email : string = '';
  password : string =  '';

}
