import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Child } from '../child/child';

@Component({
  selector: 'app-parent',
  imports: [CommonModule, FormsModule, Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css'
})
export class Parent {
  studentNames:string[] = ["Dileep","Naveen","Mahesh","Gnani"];
  student :string = '';
  parentMessage = '';
  receiveFromChild(message:string){
    this.parentMessage = message;
  }
}
