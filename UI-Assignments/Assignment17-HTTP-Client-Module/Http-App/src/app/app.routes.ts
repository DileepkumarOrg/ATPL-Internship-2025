import { Routes } from '@angular/router';
import { Crud } from './Component/Task-1/crud/crud';
import { Add } from './Component/Task-1/add/add';
import { Update } from './Component/Task-1/update/update';
import { UserComponent } from './Component/Task-2/user-component/user-component';
import { Login } from './Component/Task-3/login/login';
import { User } from './Component/Task-5/user/user';
import { Product } from './Component/Task-5/product/product';

export const routes: Routes = [
    {path:'',redirectTo:'crud',pathMatch:'full'},
    {path:'crud',component:Crud},
    {path:'add',component:Add},
    {path:'update/:id',component:Update},
    {path : 'user-component',component:UserComponent},
    {path: 'login',component:Login},
    {path:'user',component:User},
    {path:'product',component:Product}
];
