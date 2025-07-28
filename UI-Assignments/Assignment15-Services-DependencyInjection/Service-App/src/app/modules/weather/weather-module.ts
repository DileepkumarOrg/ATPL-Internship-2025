import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WeatherService } from '../../Services/weather-service';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ],
  providers:[WeatherService]
})
export class WeatherModule { }
