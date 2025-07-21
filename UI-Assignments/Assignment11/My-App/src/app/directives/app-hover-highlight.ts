import {Directive, ElementRef, HostListener, inject} from '@angular/core';
@Directive({
  selector: '[appAppHoverHighlight]',
})
export class HighlightDirective {
  private el = inject(ElementRef);
  @HostListener('mouseenter') onMouseEnter() {
    this.el.nativeElement.style.backgroundColor = "yellow";
    this.el.nativeElement.style.color = "black";
  }
  @HostListener('mouseleave') onMouseLeave() {
    this.el.nativeElement.style.backgroundColor = "";
    this.el.nativeElement.style.color = "white";
  }
}

