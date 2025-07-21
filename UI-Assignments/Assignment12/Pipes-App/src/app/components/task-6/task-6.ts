import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task-6',
  imports: [CommonModule],
  templateUrl: './task-6.html',
  styleUrl: './task-6.css'
})
export class Task6 {
  headlines: string[] = [
    "Breaking: New AI Model Breaks All Benchmarks in Speed and Accuracy",
    "India Wins Historic Cricket Match in Super Over Thriller",
    "Scientists Discover Water Reserves Under the Surface of Mars",
    "New Electric Car Offers 1000km Range on a Single Charge",
    "Government Announces New Education Policy Focused on Innovation",
    "Global Markets Soar as Tech Stocks Reach Record Highs"
  ];
}

