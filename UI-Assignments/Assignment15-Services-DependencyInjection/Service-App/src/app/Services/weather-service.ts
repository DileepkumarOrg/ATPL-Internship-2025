import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {
  data : object ={ 
    city: 'Vizag', 
    temperature: 28, 
    description: 'Partly cloudy' 
    } 
    getWeather(): Observable<any> {
    return of(this.data);
  }
}
