import { Component, signal } from '@angular/core';
import { RouterOutlet,RouterLink, RouterLinkActive } from '@angular/router';



/* import { NavComponent } from "./component/nav-component/nav-component";
import { UserComponent } from "./component/user-component/user-component";
import { AboutComponent } from "./component/about-component/about-component";
import { MenuComponent } from "./component/menu-component/menu-component"; */

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLink, RouterLinkActive      /* , NavComponent, UserComponent, AboutComponent, MenuComponent */       ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Route-App');
}


