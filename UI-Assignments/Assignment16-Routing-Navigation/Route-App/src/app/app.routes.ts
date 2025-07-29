import { Routes } from '@angular/router';
import { Home } from './Component/Task-1/home/home';
import { About } from './Component/Task-1/about/about';
import { Contact } from './Component/Task-1/contact/contact';
import { ProductDetailComponent } from './Component/Task-2/product-detail-component/product-detail-component';
import { DashBoard } from './Component/Task-1/dash-board/dash-board';
import { Profile } from './Component/Task-3/dashboard/profile/profile';
import { Settings } from './Component/Task-3/dashboard/settings/settings';
import { Activity } from './Component/Task-3/dashboard/activity/activity';
import { Dashboard } from './Component/Task-3/dashboard/dashboard';
import { PageNotFoundComponent } from './Component/Task-6/page-not-found-component/page-not-found-component';

export const routes: Routes = [
  //{path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home',component:Home},
  {path:'about',component:About},
  {path:'contact',component:Contact},
  {path: 'user/:id', component: ProductDetailComponent},
  {path: 'dashboard', component: Dashboard,
    children: [
      { path: '', redirectTo: 'profile', pathMatch: 'full' },
      { path: 'profile', component: Profile },
      { path: 'settings', component: Settings },
      { path: 'activity', component: Activity }
    ]
  },
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  {path:'**',component:PageNotFoundComponent}
    
];

