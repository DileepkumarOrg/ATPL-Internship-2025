import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-attribute-directive-component',
  imports: [CommonModule,FormsModule],
  templateUrl: './attribute-directive-component.html',
  styleUrl: './attribute-directive-component.css'
})
export class AttributeDirectiveComponent {
  className = 'highlight';
  dynamicClass = 'bordered';
  classesArray = ['highlight', 'bordered'];

  isActive = false;
  isDisabled = true;
  isHighlighted = true;

  isError = false;

  isHighlighted1 = true;
  isActive1 = true;
  click : boolean = false;
  clicked(){
    this.click = !this.click;
  }

  redOrGreen = 'error'
  changeColor( k : string){
    this.redOrGreen = k;
  }


  //CheckBox
  checked :boolean = false;

  //Input Text
  inputText : string ="";




  //ng Style
  textColor : string ='';
  bgcolor : string = 'yellow';

  updateColor(color : string){
    this.textColor = color;
  }

  //CheckBox
  ngStyleChecked : boolean = false

  //Input Box
  inputColor : string = "";
}

