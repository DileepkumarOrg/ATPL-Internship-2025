import { Component } from '@angular/core';
import { Authentication } from '../../../Service/authentication';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-admin-component',
  imports: [RouterLink],
  templateUrl: './admin-component.html',
  styleUrl: './admin-component.css'
})
export class AdminComponent {
  constructor(private authService : Authentication){}
  logout(){
    this.authService.logout();
  }
}
