import { Routes } from '@angular/router';
import { Complaints } from './Components/complaints/complaints';

export const routes: Routes = [
    {path: "", redirectTo: "complaints", pathMatch: "full" },
    {path: "complaints", component: Complaints}
];
