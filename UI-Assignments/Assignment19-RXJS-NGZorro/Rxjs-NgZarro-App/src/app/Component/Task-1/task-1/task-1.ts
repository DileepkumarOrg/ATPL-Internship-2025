import { Component, ElementRef, ViewChild, AfterViewInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzInputModule } from 'ng-zorro-antd/input';
import { fromEvent } from 'rxjs';
import { debounceTime,map } from 'rxjs/operators';

@Component({
  selector: 'app-task-1',
  standalone: true,
  imports: [FormsModule, NzButtonModule, NzInputModule, NzIconModule],
  templateUrl: './task-1.html',
  styleUrl: './task-1.css'
})
export class Task1 implements AfterViewInit {
  @ViewChild('searchInput') searchInput!: ElementRef<HTMLInputElement>;

  ngAfterViewInit() {
    fromEvent(this.searchInput.nativeElement, 'input').pipe(
      map((event:Event) => ( event.target as HTMLInputElement).value),
      debounceTime(300)
    ).subscribe((value: string) => 
      {
        if(value.trim()!=''){
          console.log('Search Term:', value.trim());
        }
    });
  }
}
