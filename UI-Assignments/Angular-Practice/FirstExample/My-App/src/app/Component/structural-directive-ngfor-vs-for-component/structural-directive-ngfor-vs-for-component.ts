import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive-ngfor-vs-for-component',
  imports: [CommonModule],
  templateUrl: './structural-directive-ngfor-vs-for-component.html',
  styleUrl: './structural-directive-ngfor-vs-for-component.css'
})
export class StructuralDirectiveNgforVsForComponent {
employees : any[] =[
    {employeeName :"Dileep", employeeID : 101, employeeGmail:"dileep@gmail.com"},
    {employeeName :"Naveen", employeeID : 102, employeeGmail:"navven@gmail.com"},
    {employeeName :"Mahesh", employeeID : 103, employeeGmail:"mahesh@gmail.com"}
  ]

  company : string[] = [
    "Aaslin" , "TCS", "CoForge"
  ]
}
