import { CommonModule } from '@angular/common';
import { ChangeDetectionStrategy, Component, signal, WritableSignal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { sign } from 'crypto';
import { single } from 'rxjs';

@Component({
  selector: 'app-signal-component',
  imports: [CommonModule,FormsModule],
  templateUrl: './signal-component.html',
  styleUrl: './signal-component.css',
  changeDetection : ChangeDetectionStrategy.OnPush
})
export class SignalComponent {
  counter = signal(0);
  //counter : WritableSignal<number> = signal(0)
  onIncriment(){
    this.counter.update(value => value+1)
  }
  onDecriment(){
    this.counter.update(value => value-1);
  }

  count = signal(5);
  constructor(){

    setTimeout(() => {
      this.counter.set(30);
      console.log(this.count());
    }, 5000);
  }
}
