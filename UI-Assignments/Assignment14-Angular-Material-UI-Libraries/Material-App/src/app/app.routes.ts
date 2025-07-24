import { Routes } from '@angular/router';
import { Task1 } from './Component/task-1/task-1';
import { Task2 } from './Component/task-2/task-2';
import { Task3 } from './Component/task-3/task-3';
import { Task4 } from './Component/task-4/task-4';
import { Task5 } from './Component/task-5/task-5';

export const routes: Routes = [
    {path:'',redirectTo:'task1',pathMatch:'full'},
    {path:'task1',component:Task1},
    {path:'task2',component:Task2},
    {path:'task3',component:Task3},
    {path:'task4',component:Task4},
    {path:'task5',component:Task5}
];
