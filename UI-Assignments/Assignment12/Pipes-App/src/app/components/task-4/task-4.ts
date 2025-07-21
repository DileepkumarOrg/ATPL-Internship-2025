import { CommonModule, CurrencyPipe } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task-4',
  imports: [CommonModule,CurrencyPipe],
  templateUrl: './task-4.html',
  styleUrl: './task-4.css'
})
export class Task4 {
  prices1= [10, 50, 60, 80, 70,30, 40, 20 ];
  prices = [10, 50, 60, 80, 70,30, 40, 20 ];
  sortedPrices = this.prices.sort((a, b) => a - b);

}
