import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServices {
  data: object[] = [];
  
  addEmployee (obj: object){
    this.data.push(obj)
  }
}
