import { Component } from '@angular/core';
import { RouterLink,Router } from '@angular/router';

@Component({
  selector: 'app-user-component',
  imports: [],
  templateUrl: './user-component.html',
  styleUrl: './user-component.css'
})
export class UserComponent {
  constructor (private router :Router){}
  login(){
    //this.router.navigateByUrl("menu");
    this.router.navigate(['menu']);
  }
}
