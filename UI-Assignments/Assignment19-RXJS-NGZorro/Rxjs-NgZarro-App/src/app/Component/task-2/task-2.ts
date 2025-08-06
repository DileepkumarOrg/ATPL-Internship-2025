import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { map,take, timer } from 'rxjs';

@Component({
  selector: 'app-task-2',
  imports: [NzButtonModule,CommonModule],
  templateUrl: './task-2.html',
  styleUrl: './task-2.css'
})
export class Task2 {
  numbers : number[] = []
  onclick(){
    timer(1,1000).pipe(take(5),
      map((x)=>x*2)
    ).subscribe((num)=>this.numbers.push(num));
    console.log(this.numbers)
  }
}
