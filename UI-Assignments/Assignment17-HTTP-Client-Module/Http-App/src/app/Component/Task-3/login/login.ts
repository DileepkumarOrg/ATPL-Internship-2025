import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
  username = '';
  password = '';

  constructor(private router: Router) {}

  login() {
    const fakeToken = 'fake-jwt-token-12345';
    localStorage.setItem('authToken', fakeToken);
    this.router.navigate(['/add']);
  }
}


