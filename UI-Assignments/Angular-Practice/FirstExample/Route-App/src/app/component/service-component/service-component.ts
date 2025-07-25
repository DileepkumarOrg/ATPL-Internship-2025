import { Component, inject } from '@angular/core';
import { DemoService } from '../../Services/demo-service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-service-component',
  imports: [FormsModule,CommonModule],
  templateUrl: './service-component.html',
  styleUrl: './service-component.css',
})
export class ServiceComponent {
/*   weather = {
    city : 'Vizag',
    temp : 45,
    rain : false
  } */


    data:any; 
    constructor(private _data:DemoService){
      this.data = this._data.weather;
    }
  
}


