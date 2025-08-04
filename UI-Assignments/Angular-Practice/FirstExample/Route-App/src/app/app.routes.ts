import { Routes } from '@angular/router';
import { UserComponent } from './component/user-component/user-component';
import { AboutComponent } from './component/about-component/about-component';
import { MenuComponent } from './component/menu-component/menu-component';
import { PageNotFoundComponent } from './component/page-not-found-component/page-not-found-component';
import { BuiltInPipesComponent } from './component/built-in-pipes-component/built-in-pipes-component';
import { TemplateForm } from './component/template-form/template-form';
import { ReactiveForm } from './component/reactive-form/reactive-form';
import { ServiceComponent } from './component/service-component/service-component';
import { Crud } from './component/crud/crud';
import { Parent } from './component/Component-Communication/parent/parent';

export const routes: Routes = [
    {path:'',redirectTo:'user',pathMatch:'full'},
    {path:'user',component:UserComponent},
    {path:'about',component:AboutComponent},
    {path:'menu',component:MenuComponent},
    {path:'built-in-pipes',component:BuiltInPipesComponent},
    {path:'template-form',component:TemplateForm},
    {path:'reactive-form',component:ReactiveForm},
    {path:'service-component',component:ServiceComponent},
    {path:'crud',component:Crud},
    {path:'component-communication',component:Parent},
    {path:'**',component:PageNotFoundComponent}
    
];


