import { CommonModule, TitleCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { last } from 'rxjs';

@Component({
  selector: 'app-task-5',
  imports: [CommonModule,FormsModule,TitleCasePipe],
  templateUrl: './task-5.html',
  styleUrl: './task-5.css'
})
export class Task5 {
  userType: string = '';

  users = [
    { name: 'Dileep', status: 'active' ,lastLogin: new Date('2025-07-15T10:00:00')  },
    { name: 'Mahesh', status: 'active',  lastLogin: new Date('2025-07-14T11:00:00') },
    { name: 'Naveen', status: 'active',lastLogin: new Date('2025-07-16T12:00:00') },
    { name: 'Suresh', status: 'inactive',lastLogin: new Date('2025-07-16T13:00:00') },
    { name: 'Anjali', status: 'active',lastLogin: new Date('2025-07-17T08:00:00') },
    { name: 'Divya', status: 'active',lastLogin: new Date('2025-07-18T07:00:00') },
    { name: 'Ravi', status: 'inactive',lastLogin: new Date('2025-07-19T06:00:00') },
    { name: 'Priya', status: 'active',lastLogin: new Date('2025-07-20T05:00:00') }
  ];
}


