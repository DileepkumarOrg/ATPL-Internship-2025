import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployeeDashBoard } from "./components/employee-dash-board/employee-dash-board";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, EmployeeDashBoard],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Employee');
}
