import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customImpurePipe'
})
export class CustomImpurePipePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
