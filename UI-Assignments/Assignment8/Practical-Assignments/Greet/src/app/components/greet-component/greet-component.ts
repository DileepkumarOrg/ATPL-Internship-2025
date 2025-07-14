import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
 
@Component({
  selector: 'app-greet-component',
  imports: [FormsModule],
  templateUrl: './greet-component.html',
  styleUrl: './greet-component.css'
})
export class GreetComponent {
  name : string=""
  age :number = 0;
display(){
  window.alert(`Hello, ${this.name} you are ${this.age} years old`)
}

}
