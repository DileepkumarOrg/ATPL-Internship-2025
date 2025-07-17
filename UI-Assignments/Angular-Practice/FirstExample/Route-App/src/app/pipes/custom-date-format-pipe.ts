import { Pipe, PipeTransform } from '@angular/core';
import { DatePipe } from '@angular/common';

@Pipe({
  name: 'customDateFormat'
})
export class CustomDateFormatPipe implements PipeTransform {
  private DatePipe = new DatePipe('en-US');
  transform(value: any, ...args: any[]): any {
    return this.DatePipe.transform(value,"M-y-d");
  }

}
