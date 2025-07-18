import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPurePipe'
})
export class customPurePipe implements PipeTransform {

  transform(value: any): any {
    return value * value;
  }

}
