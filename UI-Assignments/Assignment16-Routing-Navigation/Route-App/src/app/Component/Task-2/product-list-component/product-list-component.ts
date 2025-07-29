import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-product-list-component',
  imports: [CommonModule],
  templateUrl: './product-list-component.html',
  styleUrl: './product-list-component.css'
})


export class ProductListComponent {
  products = [
      { id: 1, name: 'Mobile' }
    ];
  }
