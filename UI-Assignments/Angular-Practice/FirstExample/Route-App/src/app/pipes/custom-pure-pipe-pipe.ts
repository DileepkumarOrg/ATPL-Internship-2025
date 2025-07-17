import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPurePipe'
})
export class CustomPurePipePipe implements PipeTransform {

  transform(value: any): any {
    return value * value;
  }

}
