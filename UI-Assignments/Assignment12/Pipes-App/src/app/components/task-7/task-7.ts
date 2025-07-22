import { Component } from '@angular/core';
import { ReversePipe } from '../../Pipes/reverse-pipe';
import { PhoneNumberExtensionPipe } from '../../Pipes/phone-number-extension-pipe';

@Component({
  selector: 'app-task-7',
  imports: [ReversePipe,PhoneNumberExtensionPipe],
  templateUrl: './task-7.html',
  styleUrl: './task-7.css'
})
export class Task7 {

}

