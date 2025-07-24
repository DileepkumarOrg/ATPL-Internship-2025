
import { Component, inject } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import { Dialog } from '../dialog/dialog';

@Component({
  selector: 'app-task-4',
  imports: [MatButtonModule],
  templateUrl: './task-4.html',
  styleUrl: './task-4.css'
})
export class Task4 {
  title='Contact Form';
  readonly dialog = inject(MatDialog);
  openDialog():void{
    this.dialog.open(Dialog);
  }
}
