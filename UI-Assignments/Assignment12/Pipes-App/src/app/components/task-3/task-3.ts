import { LowerCasePipe, TitleCasePipe, UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task-3',
  imports: [UpperCasePipe,LowerCasePipe,TitleCasePipe],
  templateUrl: './task-3.html',
  styleUrl: './task-3.css'
})
export class Task3 {
  userName: string = 'Routhu DiLeep kumar';
}

