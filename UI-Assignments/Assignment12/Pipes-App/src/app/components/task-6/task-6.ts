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
    'Breaking News: Major Earthquake Hits City',
    'Sports Update: Local Team Wins Championship',
    'Weather Alert: Severe Storms Expected This Weekend',
    'Technology: New Smartphone Model Released',
    'Health: Tips for Staying Fit During Winter'
  ];
}

