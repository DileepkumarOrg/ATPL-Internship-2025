import { CommonModule, DatePipe } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task-2',
  imports: [DatePipe,CommonModule],
  templateUrl: './task-2.html',
  styleUrl: './task-2.css'
})
export class Task2 {
  employeeDetails = [
    { name: 'John Doe', joiningDate: new Date('2025-01-15') },
    { name: 'Jane Smith', joiningDate: new Date('2025-03-22') },
    { name: 'Alice Johnson', joiningDate: new Date('2025-07-30') },
    { name: 'Bob Brown', joiningDate: new Date('2025-11-05') }
  ];
}


