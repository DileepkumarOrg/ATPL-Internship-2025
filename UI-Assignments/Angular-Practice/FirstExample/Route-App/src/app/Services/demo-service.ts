import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {
  weather = {
    city : 'vizag',
    temp : 45,
    rain : false
  }
}
