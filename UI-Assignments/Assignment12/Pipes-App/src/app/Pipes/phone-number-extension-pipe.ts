import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'phoneNumberExtension'
})
export class PhoneNumberExtensionPipe implements PipeTransform {

  transform(value: number): string {
    if (value.toString().length == 10){
      return '+91'+value
    } return 'NA';
  }

}
