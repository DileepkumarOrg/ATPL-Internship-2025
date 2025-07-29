import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';

@Component({
  selector: 'app-product-detail-component',
  imports: [RouterLink],
  templateUrl: './product-detail-component.html',
  styleUrl: './product-detail-component.css'
})
export class ProductDetailComponent implements OnInit {
  userId: string | null = '';

  constructor(private route: ActivatedRoute) {}

  ngOnInit():void {
    this.userId = this.route.snapshot.paramMap.get('id');
  }

}

