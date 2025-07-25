import { Component } from '@angular/core';
import { WeatherService } from '../../Services/weather-service';

@Component({
  selector: 'app-dashboard-component',
  imports: [],
  templateUrl: './dashboard-component.html',
  styleUrl: './dashboard-component.css'
})
export class DashboardComponent {
  data:any;
  constructor (private dummy: WeatherService){
    this.data = this.dummy.data;
    // console.log(this.data.getWeather);
  }
}
