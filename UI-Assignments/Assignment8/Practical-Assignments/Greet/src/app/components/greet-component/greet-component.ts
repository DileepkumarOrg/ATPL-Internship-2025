import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
 
@Component({
  selector: 'app-greet-component',
  imports: [FormsModule],
  templateUrl: './greet-component.html',
  styleUrl: './greet-component.css'
})
export class GreetComponent {
   name: string = '';
   age: number = 0;

  submit() {
    if(this.name!="" && this.age >0){
    window.alert(`Hello ${this.name}, you are ${this.age} years old`);
    }
  else{
    window.alert("Enter Details..!")
  }
  }

}
