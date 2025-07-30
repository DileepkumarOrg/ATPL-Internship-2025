import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing-module';
import { Admin } from '../../Component/Task-5/admin/admin';


@NgModule({
  declarations: [Admin],
  imports: [
    CommonModule,
    AdminRoutingModule
  ]
})
export class AdminModule { }
