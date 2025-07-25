import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatDrawerContainer, MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { MatButtonModule } from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import {MatTableModule} from '@angular/material/table';
import { Task1 } from "../task-1/task-1";
import { Task4 } from '../task-4/task-4';

export interface intern {
  name: string;
  internNo: number;
  team: string;
}

const Intern_Data: intern[] = [
  {internNo: 1, name: 'Dileep',  team: 'UI'},
  {internNo: 2, name: 'Naveen',  team: 'UI'},
  {internNo: 3, name: 'Mahesh',  team: 'UI'},
  {internNo: 4, name: 'Divya', team: 'UI'}
];

@Component({
  selector: 'app-task-5',
  imports: [MatToolbarModule, MatTableModule, MatCardModule,MatIconModule,MatButtonModule, MatDrawerContainer, MatSidenavModule, MatListModule, Task1, Task4],
  templateUrl: './task-5.html',
  styleUrl: './task-5.css'
})
export class Task5 {
  

  displayedColumns: string[] = ['internNo', 'name', 'team'];
  dataSource = Intern_Data;
}

