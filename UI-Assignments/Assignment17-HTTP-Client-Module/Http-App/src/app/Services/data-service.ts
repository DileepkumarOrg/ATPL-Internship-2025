import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { InterfaceUserData } from '../Interface/interface-user-data';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  url : string = "http://localhost:3000/users";
  constructor (private http : HttpClient){}
  getData(){
    return this.http.get<InterfaceUserData[]>(this.url);
  }
}
