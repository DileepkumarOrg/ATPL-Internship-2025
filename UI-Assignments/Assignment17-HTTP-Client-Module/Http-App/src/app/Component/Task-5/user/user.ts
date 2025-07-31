import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../Services/reusable-api';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user',
  imports: [CommonModule],
  templateUrl: './user.html',
  styleUrl: './user.css'
})
export class User implements OnInit{
  users: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(): void {
    this.http.get<any[]>('http://localhost:4000/users').subscribe(data => {
      this.users = data;
    });
  }

  deleteUser(id: number): void {
    this.http.delete(`http://localhost:4000/users/${id}`).subscribe(() => {
      this.getUsers();
    });
  }
}
    