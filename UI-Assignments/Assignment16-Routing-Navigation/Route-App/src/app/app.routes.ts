import { Routes } from '@angular/router';
import { Home } from './Component/Task-1/home/home';
import { About } from './Component/Task-1/about/about';
import { Contact } from './Component/Task-1/contact/contact';
import { DashBoard } from './Component/Task-1/dash-board/dash-board';

export const routes: Routes = [
  {
    path: 'dashboard',
    component: DashBoard,
    children: [
      { path: '', redirectTo: 'home', pathMatch: 'full' }, 
      { path: 'home', component: Home },
      { path: 'about', component: About },
      { path: 'contact', component: Contact }
    ]
  }
];

