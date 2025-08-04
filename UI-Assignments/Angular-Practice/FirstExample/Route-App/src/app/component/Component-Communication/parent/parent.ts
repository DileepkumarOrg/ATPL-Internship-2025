import { Component} from '@angular/core';
import { Child } from "../child/child";

@Component({
  selector: 'app-parent',
  imports: [Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css'
})
export class Parent {
  parentMessage : string = 'This is Parent Message to Child';
  childMessage : string = '';
  recivedMesage(event : any){
    this.childMessage = event;
  }
}
