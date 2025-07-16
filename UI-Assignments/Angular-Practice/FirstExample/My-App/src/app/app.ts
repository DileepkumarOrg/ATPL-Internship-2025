import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
<<<<<<< HEAD
import { User } from "./user/user";
import { DataBindingComp } from "./data-binding-comp/data-binding-comp";
import { DirectiveComponent } from "./directive-component/directive-component";
import { StructureDirectiveComponent } from "./structure-directive-component/structure-directive-component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, /* User, DataBindingComp  DirectiveComponent*/ StructureDirectiveComponent],
=======
import { StructuralDirectiveNgforVsForComponent } from "./Component/structural-directive-ngfor-vs-for-component/structural-directive-ngfor-vs-for-component";
import { StructuralDirectiveNgswitchVsSwitchComponent } from "./Component/structural-directive-ngswitch-vs-switch-component/structural-directive-ngswitch-vs-switch-component";
import { AttributeDirectiveComponent } from "./Component/attribute-directive-component/attribute-directive-component";
import { SignalComponent } from "./Component/signal-component/signal-component";
import { NavBarComponent } from "./Component/nav-bar-component/nav-bar-component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, /* StructuralDirectiveNgforVsForComponent, */ /* StructuralDirectiveNgswitchVsSwitchComponent, */ /* AttributeDirectiveComponent,*/  SignalComponent /*, NavBarComponent */],
>>>>>>> 543ff572aece11947e480e7528e6089861ff524b
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('My-App');
}
