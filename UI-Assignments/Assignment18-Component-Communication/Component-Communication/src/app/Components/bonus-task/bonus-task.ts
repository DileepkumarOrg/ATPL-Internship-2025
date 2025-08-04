import { Component, OnInit } from '@angular/core';
import { Child } from "./child/child";
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-bonus-task',
  imports: [Child,FormsModule,CommonModule],
  templateUrl: './bonus-task.html',
  styleUrl: './bonus-task.css'
})
export class BonusTask implements OnInit{
  studentNames:string[] = ["Dileep","Naveen","Mahesh","Gnani"];
  student :string = '';
  
  parentMessage = '';
  receiveFromChild(message:string){
    this.parentMessage = message;
  }
  saveLocal(name : string){
    localStorage.setItem("last Selected Name",name);
  }
  ngOnInit(): void {
    this.student = localStorage.getItem('last Selected Name')??'';
  }
}
