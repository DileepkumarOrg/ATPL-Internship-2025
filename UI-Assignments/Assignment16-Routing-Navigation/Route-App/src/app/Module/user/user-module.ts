import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { User } from '../../Component/Task-5/user/user';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [User],
  imports: [
    CommonModule,
    RouterModule.forChild([
      { path: '', component: User }
    ])

  ]
})
export class UserModule { }
