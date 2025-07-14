import { CommonModule } from '@angular/common';
import { Component, input } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-structure-directive-component',
  imports: [CommonModule,FormsModule],
  templateUrl: './structure-directive-component.html',
  styleUrl: './structure-directive-component.css'
})
export class StructureDirectiveComponent {
  //1st div
  isChecked:boolean = false;
  isButtonClicked : boolean = true;

  onClick(){
    this.isChecked = !this.isChecked;
  }
  //2nd div
  isClicked :boolean = true;
  show(){
    this.isButtonClicked = true;
  }
  hide(){
    this.isButtonClicked = false;
  }
  //3rd div
  input1 : string ="";
  input2 :string = "";

}


