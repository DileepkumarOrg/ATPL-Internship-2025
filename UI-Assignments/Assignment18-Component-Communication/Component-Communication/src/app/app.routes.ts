import { Routes } from '@angular/router';
import { Parent } from './Components/Task1/parent/parent';
import { Child } from './Components/Task1/child/child';
import { LocalStorage } from './Components/local-storage/local-storage';
import { SessionStorage } from './Components/session-storage/session-storage';
import { BonusTask } from './Components/bonus-task/bonus-task';

export const routes: Routes = [
    {path:'',redirectTo:'Parent',pathMatch:'full'},
    {path:'Parent',component:Parent},
    {path:'Child',component:Child},
    {path:'LocalStorage',component:LocalStorage},
    {path:'SessionStorage',component:SessionStorage},
    {path:'bonus',component:BonusTask}
];
