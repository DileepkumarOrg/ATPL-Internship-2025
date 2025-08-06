import { Routes } from '@angular/router';
import { Task1 } from './Component/Task-1/task-1/task-1';
import { Task2 } from './Component/task-2/task-2';
import { Task3 } from './Component/task-3/task-3';
import { ModalDialog } from './Component/modal-dialog/modal-dialog';
import { MergeMap } from './Component/merge-map/merge-map';

export const routes: Routes = [
    {path:'',redirectTo:'task1',pathMatch:'full'},
    {path:'task1',component:Task1},
    {path:'task2',component:Task2},
    {path:'task3',component:Task3},
    {path:'task5',component:ModalDialog},
    {path:'task6',component:MergeMap}
];
