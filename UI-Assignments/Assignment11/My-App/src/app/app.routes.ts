import { Routes } from '@angular/router';
import { Task1 } from './components/task-1/task-1';
import { Task2 } from './components/task-2/task-2';
import { Task3 } from './components/task-3/task-3';
import { Task4 } from './components/task-4/task-4';
import { Task5 } from './components/task-5/task-5';
import { Task6 } from './components/task-6/task-6';
import { Task7 } from './components/task-7/task-7';

export const routes: Routes = [
    {path:'',redirectTo:'task1',pathMatch:'full'},
    {path:'task1',component:Task1},
    {path:'task2',component:Task2},
    {path:'task3',component:Task3},
    {path:'task4',component:Task4},
    {path:'task5',component:Task5},
    {path:'task6',component:Task6},
    {path:'task7',component:Task7},
];
