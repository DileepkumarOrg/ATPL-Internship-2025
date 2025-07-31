import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService<T> {
  constructor(private http: HttpClient) {}

  private baseUrl = 'http://localhost:4000/users'; 

  getAll(dataStr: string): Observable<T[]> {
    return this.http.get<T[]>(`${this.baseUrl}/${dataStr}`);
  }

  getById(dataStr: string, id: number): Observable<T> {
    return this.http.get<T>(`${this.baseUrl}/${dataStr}/${id}`);
  }

  create(dataStr: string, data: T): Observable<T> {
    return this.http.post<T>(`${this.baseUrl}/${dataStr}`, data);
  }

  update(dataStr: string, id: number, data: T): Observable<T> {
    return this.http.put<T>(`${this.baseUrl}/${dataStr}/${id}`, data);
  }

  delete(dataStr: string, id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${dataStr}/${id}`);
  }
}
