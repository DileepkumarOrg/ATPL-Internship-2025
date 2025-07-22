import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-2',
  imports: [FormsModule,CommonModule],
  templateUrl: './task-2.html',
  styleUrl: './task-2.css'
})
export class Task2 {
  userName :string = '';
  email : string = '';
  password : string =  '';

}
