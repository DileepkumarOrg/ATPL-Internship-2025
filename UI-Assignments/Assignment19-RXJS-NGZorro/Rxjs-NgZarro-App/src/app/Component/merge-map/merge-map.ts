import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzListModule } from 'ng-zorro-antd/list';
import { Subject, of } from 'rxjs';
import { delay, mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-product-stream',
  standalone: true,
  imports: [CommonModule, NzListModule],
  templateUrl: './merge-map.html',
  styleUrl: './merge-map.css'
})
export class MergeMap implements OnInit {
  products: any[] = [
    { item: 'Laptop', cost: 65000, description: 'I7 16GB' },
    { item: 'Phone', cost: 50000, description: '8GB 512 GB' },
    { item: 'Tablet', cost: 4000, description: 'Some' },
    { item: 'Monitor', cost: 10000, description: 'I7 16GB' }
  ];

  private clickProduct$ = new Subject<any>();

  constructor() {
    this.clickProduct$
      .pipe(
        mergeMap(product => this.fetchProductDetails(product).pipe(
          delay(500)
        ))
      )
      .subscribe(({ product, detail }) => {
        product.detail = detail;
      });
  }

  ngOnInit(): void {}

  onProductClick(product: any): void {
    this.clickProduct$.next(product);
  }

  fetchProductDetails(product: any) {
    return of({
      product,
      detail: `Details of ${product.item}: ${product.cost}, ${product.description}`
    });
  }
}
