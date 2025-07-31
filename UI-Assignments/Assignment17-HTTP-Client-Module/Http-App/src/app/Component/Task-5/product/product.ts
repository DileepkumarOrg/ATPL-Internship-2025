import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../Services/reusable-api';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-product',
  imports: [CommonModule,FormsModule,RouterLink],
  templateUrl: './product.html',
  styleUrl: './product.css'
})
export class Product implements OnInit {
  products: any[] = [];

  newProduct = {
    name: '',
    price: null,
    description: ''
  };

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.http.get<any[]>('http://localhost:4000/products').subscribe(data => {
      this.products = data;
    });
  }

  addProduct(product: any): void {
    this.http.post('http://localhost:4000/products', product).subscribe(() => {
      this.getProducts();
      this.newProduct = { name: '', price: null, description: '' }; 
    });
  }

  deleteProduct(id: number): void {
    this.http.delete(`http://localhost:4000/products/${id}`).subscribe(() => {
      this.getProducts();
    });
  }
}