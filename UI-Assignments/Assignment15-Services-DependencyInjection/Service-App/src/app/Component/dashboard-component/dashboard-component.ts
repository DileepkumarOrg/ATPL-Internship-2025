import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../../Services/weather-service';
import { CommonModule } from '@angular/common';
import { catchError, of } from 'rxjs';

@Component({
  selector: 'app-dashboard-component',
  imports: [CommonModule],
  templateUrl: './dashboard-component.html',
  styleUrl: './dashboard-component.css'
})
export class DashboardComponent implements OnInit
{
  constructor (private _data: WeatherService){
  }
  weather:any;
  errMessage:string='';
  ngOnInit(): void {
  this._data.getWeatherDetails()
  .pipe(
    catchError(()=>{
       this.errMessage="failed to fetch data";
       return of(null);
    })
  )
  .subscribe((dat: any)=>{
    this.weather=dat;
  });
}
}
