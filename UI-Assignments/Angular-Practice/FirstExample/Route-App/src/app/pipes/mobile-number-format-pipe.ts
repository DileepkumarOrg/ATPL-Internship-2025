import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mobileNumberFormat'
})
export class MobileNumberFormatPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    if (value =="" || value == undefined || value == null || value.toString().trim().length != 10){
      return "NA";
    }else return value ? '+91 '+value: value ;
  }

}
