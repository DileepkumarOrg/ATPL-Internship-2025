import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-employee-dash-board',
  imports: [RouterLink,RouterLinkActive],
  templateUrl: './employee-dash-board.html',
  styleUrl: './employee-dash-board.css'
})
export class EmployeeDashBoard {
}
