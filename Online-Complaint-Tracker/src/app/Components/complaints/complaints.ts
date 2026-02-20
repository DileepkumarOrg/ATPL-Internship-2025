import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ComplaintsService } from '../../Services/complaints-service';

@Component({
  selector: 'app-complaints',
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './complaints.html',
  styleUrl: './complaints.css',
})
export class Complaints implements OnInit {
  complaints: any[] = [];
  constructor(private compService: ComplaintsService) {}

  ngOnInit(): void {
    this.getComplaints();
  }
  getComplaints() {
    this.compService.getComplaints().subscribe(
      (data: any) => {
        this.complaints = data;
      },
      (error: any) => {
        console.error('Error fetching complaints:', error);
      }
    );
  }
}
