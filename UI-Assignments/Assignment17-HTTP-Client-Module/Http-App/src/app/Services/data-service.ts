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

  delete(id:number){
    return this.http.delete(`${this.url}/${id}`);
  }

  add(obj:object){
    return this.http.post(this.url,obj);
  }

  getUserDataByID(id:number){
    return this.http.get(`${this.url}/${id}`);
  }

  update(id:number,data:object){
    return this.http.put(`${this.url}/${id}`,data);
  }
}
