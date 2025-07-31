import { Component, OnChanges, OnInit, signal } from '@angular/core';
import { DataService } from '../../../Services/data-service';
import { InterfaceUserData } from '../../../Interface/interface-user-data';
import { CommonModule } from '@angular/common';
import { Router, RouterLink } from '@angular/router'; 
   


@Component({
  selector: 'app-crud',
  imports: [CommonModule,RouterLink],
  templateUrl: './crud.html',
  styleUrl: './crud.css',
     
})
export class Crud implements OnInit , OnChanges{
  demo=signal<InterfaceUserData[]>([]);
  demoData : InterfaceUserData[]=[];
  constructor(private user : DataService ,private route : Router){}
  ngOnInit(){
    this.getAllData();
  }
  ngOnChanges(){
    this.getAllData();
  }
  getAllData(){
    this.user.getData().subscribe(res =>{
      this.demo.set(res)
      this.demoData = res;
    })
  }

  delete(id:number){
    this.user.delete(id).subscribe(()=>{
      this.getAllData();
    });
     
  }

  
  update(id:number){
    this.user.getUserDataByID(id).subscribe(() =>{
      this.route.navigate(['/update',id])
    })
  }
}


