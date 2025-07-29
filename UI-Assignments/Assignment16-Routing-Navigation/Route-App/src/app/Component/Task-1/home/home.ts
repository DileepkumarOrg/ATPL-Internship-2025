import { Component } from '@angular/core';
import { DashBoard } from "../dash-board/dash-board";

@Component({
  selector: 'app-home',
  imports: [DashBoard],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

}
