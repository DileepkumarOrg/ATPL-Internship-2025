import { Component } from '@angular/core';
import { WeatherService } from '../../Services/weather-service';
import { response } from 'express';

@Component({
  selector: 'app-dashboard-component',
  imports: [],
  templateUrl: './dashboard-component.html',
  styleUrl: './dashboard-component.css'
})
export class DashboardComponent {
  data:any;
  constructor (private weatherData: WeatherService){
    this.weatherData.getWeather().subscribe((response)=>{
      this.data = response;
    })
  }
}
