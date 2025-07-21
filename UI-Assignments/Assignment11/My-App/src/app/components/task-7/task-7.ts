import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-7',
  imports: [CommonModule,FormsModule],
  templateUrl: './task-7.html',
  styleUrl: './task-7.css'
})
export class Task7 {
  userRole :string='';
  userUI : boolean = false;
  userJava : boolean = false;
}
