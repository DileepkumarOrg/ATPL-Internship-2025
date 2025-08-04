import { Component, OnInit } from '@angular/core';
import { EmployeeServices } from '../../Services/employee-services';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-employee-table',
  imports: [CommonModule,RouterLink],
  templateUrl: './employee-table.html',
  styleUrl: './employee-table.css'
})
export class EmployeeTable implements OnInit{
  EmployeeDetails : any[] =[];
  constructor(private data: EmployeeServices){}
  ngOnInit(): void {
   this.EmployeeDetails = this.data.data;
   console.log(this.EmployeeDetails)
  }
  
}
