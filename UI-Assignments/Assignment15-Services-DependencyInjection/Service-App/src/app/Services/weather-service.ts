import { Injectable } from '@angular/core';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {
  data : object ={ 
    city: 'Vizag', 
    temperature: 28, 
    description: 'Partly cloudy' 
    } 
    getWeather(){
      return of(this.data)
    }
}
