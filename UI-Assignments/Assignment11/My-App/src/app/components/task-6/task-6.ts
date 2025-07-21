  import { CommonModule } from '@angular/common';
  import { Component } from '@angular/core';

  @Component({
    selector: 'app-task-6',
    imports: [CommonModule],
    templateUrl: './task-6.html',
    styleUrl: './task-6.css'
  })
  export class Task6 {
    num: number = 10;

    ngOnInit() {
      this.startCountdown();
    }

    startCountdown() {
      this.num = 10;
      this.countdownStep();
    }

    countdownStep() {
      if (this.num > 0) {
        setTimeout(() => {
          this.num--;
          this.countdownStep(); 
        }, 1000);
      }
    }
  }
  