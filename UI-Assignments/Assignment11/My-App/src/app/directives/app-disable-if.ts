import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appAppDisableIf]'
})
export class AppDisableIf {

  constructor(e :ElementRef) { 
  console.log(e);
}
  
}

