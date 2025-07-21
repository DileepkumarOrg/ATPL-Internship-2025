import { Component, ViewChild, ElementRef, AfterViewInit, HostListener, ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-task-5',
  standalone: true,
  imports: [],
  templateUrl: './task-5.html',
  styleUrl: './task-5.css'
})
export class Task5 {
  @ViewChild('myElement') myElementRef!: ElementRef<HTMLDivElement>;

  myElementWidth!: number;
  myElementHeight!: number;

  constructor(private cdr: ChangeDetectorRef) {}



  @HostListener('window:resize', ['$event'])
  onWindowResize(event: Event) {
    if (this.myElementRef) {
      const el = this.myElementRef.nativeElement;
      this.myElementWidth = el.offsetWidth;
      this.myElementHeight = el.offsetHeight;
    }
  }
}