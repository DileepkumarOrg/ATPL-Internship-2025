import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive-component',
  imports: [CommonModule],
  templateUrl: './attribute-directive-component.html',
  styleUrl: './attribute-directive-component.css'
})
export class AttributeDirectiveComponent {
  className = 'highlight';
  dynamicClass = 'bordered';
  classesArray = ['highlight', 'bordered'];

  isActive = true;
  isDisabled = false;
  isHighlighted = true;

  isError = true;

  isHighlighted1 = true;
  isActive1 = true;

}
