import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
//import { RouterOutlet } from "../../../../../node_modules/@angular/router/router_module.d";

@Component({
  selector: 'app-dashboard1',
  imports: [RouterLink, RouterLinkActive, RouterOutlet],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css'
})
export class Dashboard {

}
