import { Routes } from '@angular/router';
import { Crud } from './Component/Task-1/crud/crud';
import { Add } from './Component/Task-1/add/add';
import { Update } from './Component/Task-1/update/update';

export const routes: Routes = [
    {path:'',redirectTo:'crud',pathMatch:'full'},
    {path:'crud',component:Crud},
    {path:'add',component:Add},
    {path:'update',component:Update}
];
