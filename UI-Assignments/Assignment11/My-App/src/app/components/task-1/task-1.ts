import { Component } from '@angular/core';
import { AppToggleDirective } from '../../directives/app-toggle';

@Component({
  selector: 'app-task-1',
  imports: [AppToggleDirective],
  templateUrl: './task-1.html',
  styleUrl: './task-1.css'
})
export class Task1 {
  showTips =false;
}
