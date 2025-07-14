import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { User } from "./user/user";
import { DataBindingComp } from "./data-binding-comp/data-binding-comp";
import { DirectiveComponent } from "./directive-component/directive-component";
import { StructureDirectiveComponent } from "./structure-directive-component/structure-directive-component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, /* User, DataBindingComp  DirectiveComponent*/ StructureDirectiveComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('My-App');
}
