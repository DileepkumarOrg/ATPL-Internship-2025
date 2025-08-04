
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { EmployeeServices } from '../../Services/employee-services';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-employee-form',
  imports: [FormsModule,RouterLink],
  templateUrl: './employee-form.html',
  styleUrl: './employee-form.css'
})
export class EmployeeForm {
  data : object={}
  constructor(private emp_service : EmployeeServices){}
  newData = {
    id: '',
    name: '',
    email: '',
    department: ''
  };  
  submitForm() {
    this.emp_service.addEmployee(this.newData);
  }

}


