import { Injectable } from '@angular/core';
import { Observable,of } from 'rxjs';
import { LoggerService } from './logger-service';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {
  constructor(private log: LoggerService) {}
  data : object ={ 
    city: 'Vizag', 
    temperature: 28, 
    description: 'Partly cloudy' 
    } 
    getWeatherDetails() : Observable <any> {
    console.log(this.log.detailsFetched());
    return of(this.data);
  }
}
