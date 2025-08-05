import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzInputModule } from 'ng-zorro-antd/input';

@Component({
  selector: 'app-task-1',
  imports: [FormsModule, NzButtonModule, NzInputModule, NzIconModule],
  templateUrl: './task-1.html',
  styleUrl: './task-1.css'
})
export class Task1 {


}

