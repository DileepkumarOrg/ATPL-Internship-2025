import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reverse'
})
export class ReversePipe implements PipeTransform {

  transform(value : string): string {
    let reversedString : string ='';
    for (let index = value.length-1; index >= 0; index--){
      reversedString += value[index];
    }
    return reversedString;
  }

}
