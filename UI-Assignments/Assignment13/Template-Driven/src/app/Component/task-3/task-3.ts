import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-3',
  imports: [FormsModule,CommonModule],
  templateUrl: './task-3.html',
  styleUrl: './task-3.css'
})
export class Task3 {
  fullName: string = '';
  feedback: string = '';
  comment: string = '';
  submitted: boolean = false;

  onSubmit() {
    this.submitted = true;
  }
}

