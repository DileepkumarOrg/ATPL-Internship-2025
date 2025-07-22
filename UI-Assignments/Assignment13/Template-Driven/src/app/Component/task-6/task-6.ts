import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-6',
  imports: [FormsModule,CommonModule],
  templateUrl: './task-6.html',
  styleUrl: './task-6.css'
})
export class Task6 {
  userName :string = '';
  email : string = '';
  password : string =  '';

}
