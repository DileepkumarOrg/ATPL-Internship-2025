import { Component } from '@angular/core';
import { CrudService } from '../../Services/crud-service';
import { InterfaceUserData } from '../../Interface/interface-user-data';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-crud',
  imports: [CommonModule],
  templateUrl: './crud.html',
  styleUrl: './crud.css'
})
export class Crud{
  apiData : InterfaceUserData[]=[];
  constructor(private userData : CrudService){}

  ngOnInit(){
    this.getAllData();
  }
  getAllData(){
    this.userData.getData().subscribe(res =>{
      this.apiData = Array.isArray(res) ? res : [res];
    })
  }
}
