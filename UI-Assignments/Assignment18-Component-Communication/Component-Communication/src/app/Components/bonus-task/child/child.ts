import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'bonus-child',
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css'
})
export class Child {
 @Input() childMessage: string='';
 @Output() parentMessage = new EventEmitter();
 send(){
  this.parentMessage.emit("Student Name Recieved Message from Child");
 }
}