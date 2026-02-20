import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ComplaintsService {
  constructor(private http: HttpClient) {}

  getComplaints() {
    return this.http.get('http://localhost:8080/complaints');
  }

  getComplaintById(id: number) {
    return this.http.get(`http://localhost:8080/complaints/${id}`);
  }

  createComplaint(complaint: any) {
    return this.http.post('http://localhost:8080/complaints', complaint);
  }

  updateComplaint(id: number, complaint: any) {
    return this.http.put(`http://localhost:8080/complaints/${id}`, complaint);
  }

  deleteComplaint(id: number) {
    return this.http.delete(`http://localhost:8080/complaints/${id}`);
  }

  getCategories() {
    return this.http.get('http://localhost:8080/categories');
  }

  getCategoryById(id: number) {
    return this.http.get(`http://localhost:8080/categories/${id}`);
  }

  createCategory(category: any) {
    return this.http.post('http://localhost:8080/categories', category);
  }

  updateCategory(id: number, category: any) {
    return this.http.put(`http://localhost:8080/categories/${id}`, category);
  }

  deleteCategory(id: number) {
    return this.http.delete(`http://localhost:8080/categories/${id}`);
  }

  getUsers() {
    return this.http.get('http://localhost:8080/users');
  }

  getUserById(id: number) {
    return this.http.get(`http://localhost:8080/users/${id}`);
  }

  createUser(user: any) {
    return this.http.post('http://localhost:8080/users', user);
  }

  updateUser(id: number, user: any) {
    return this.http.put(`http://localhost:8080/users/${id}`, user);
  }

  deleteUser(id: number) {
    return this.http.delete(`http://localhost:8080/users/${id}`);
  }

  getStatuses() {
    return this.http.get('http://localhost:8080/statuses');
  }

  getStatusById(id: number) {
    return this.http.get(`http://localhost:8080/statuses/${id}`);
  }

  createStatus(status: any) {
    return this.http.post('http://localhost:8080/statuses', status);
  }

  updateStatus(id: number, status: any) {
    return this.http.put(`http://localhost:8080/statuses/${id}`, status);
  }

  deleteStatus(id: number) {
    return this.http.delete(`http://localhost:8080/statuses/${id}`);
  }

}
