import { Routes } from '@angular/router';
import { EmployeeDashBoard } from './components/employee-dash-board/employee-dash-board';
import { EmployeeForm } from './components/employee-form/employee-form';
import { EmployeeTable } from './components/employee-table/employee-table';
export const routes: Routes = [
    {path: "", component: EmployeeDashBoard},
    {path: "EmployeeForm", component: EmployeeForm},
    {path: "EmployeeTable", component: EmployeeTable}
];
