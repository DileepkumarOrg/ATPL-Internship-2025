import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-product-list-component',
  imports: [CommonModule,RouterLink],
  templateUrl: './product-list-component.html',
  styleUrl: './product-list-component.css'
})


export class ProductListComponent {
  products = [
      { id: 1, name: 'Mobile' },
      {id : 2, name : 'Laptop'},
      {id:3, name: 'Mouse'}
    ];

    constructor(private route : Router){}
    showData(id:number){
      this.route.navigate(['/product',id])
    }


  }



