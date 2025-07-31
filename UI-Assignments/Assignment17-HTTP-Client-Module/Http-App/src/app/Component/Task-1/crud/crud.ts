import { Component, OnChanges, OnInit } from '@angular/core';
import { DataService } from '../../../Services/data-service';
import { InterfaceUserData } from '../../../Interface/interface-user-data';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-crud',
  imports: [CommonModule,RouterLink],
  templateUrl: './crud.html',
  styleUrl: './crud.css'
})
export class Crud implements OnInit , OnChanges{
  demoData : InterfaceUserData[]=[];
  constructor(private user : DataService){}
  ngOnInit(){
    this.getAllData();
  }
  ngOnChanges(){
    this.getAllData();
  }
  getAllData(){
    this.user.getData().subscribe(res =>{
      this.demoData = res;
    })
  }

  delete(id:number){
    this.user.delete(id).subscribe(()=>{
      this.getAllData();
    });
    this.getAllData();
  }
}
