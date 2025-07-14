import { Interpolation } from '@angular/compiler';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-data-binding-comp',
  imports: [FormsModule],
  templateUrl: './data-binding-comp.html',
  styleUrl: './data-binding-comp.css'
})
export class DataBindingComp {
  Interpolation: string = "InterpolationProperty";
  property : string = "PropertyBinding"
  random : string = ""
  onsave(){
    window.alert("Data Saved")
  }
  onchange(){
    window.alert("Country Changed")
  }

}
