import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { of } from 'rxjs';
import { MobileNumberFormatPipe } from "../../pipes/mobile-number-format-pipe";
import { CustomDateFormatPipe } from '../../pipes/custom-date-format-pipe';
import { CustomPurePipePipe } from '../../pipes/custom-pure-pipe-pipe';

@Component({
  selector: 'app-built-in-pipes-component',
  imports: [CommonModule, MobileNumberFormatPipe, CustomDateFormatPipe,CustomPurePipePipe],
  templateUrl: './built-in-pipes-component.html',
  styleUrl: './built-in-pipes-component.css'
})
export class BuiltInPipesComponent {
  text : string = 'In built pIpEs'
  personalInfo : object = {
    'name' : 'Dileep',
    'Age' : 22
  }

  currentDate : Date = new Date();

  items = of (['Banana','Apple','Anything'])
}


