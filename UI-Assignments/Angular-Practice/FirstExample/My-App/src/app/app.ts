import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StructuralDirectiveNgforVsForComponent } from "./Component/structural-directive-ngfor-vs-for-component/structural-directive-ngfor-vs-for-component";
import { StructuralDirectiveNgswitchVsSwitchComponent } from "./Component/structural-directive-ngswitch-vs-switch-component/structural-directive-ngswitch-vs-switch-component";
import { AttributeDirectiveComponent } from "./Component/attribute-directive-component/attribute-directive-component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, /* StructuralDirectiveNgforVsForComponent, */ /* StructuralDirectiveNgswitchVsSwitchComponent, */ AttributeDirectiveComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('My-App');
}
