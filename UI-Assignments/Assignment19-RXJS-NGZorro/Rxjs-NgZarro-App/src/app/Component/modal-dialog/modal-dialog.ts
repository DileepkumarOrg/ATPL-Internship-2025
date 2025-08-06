import { Component } from '@angular/core';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzModalModule } from 'ng-zorro-antd/modal';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-modal-dialog',
  standalone: true,
  imports: [NzButtonModule, NzModalModule],
  templateUrl: './modal-dialog.html',
  styleUrl: './modal-dialog.css'
})
export class ModalDialog {
  isVisible = false;

  modalEvents$ = new Subject<string>();

  constructor() {

    this.modalEvents$.subscribe(event => {
      console.log('Modal Event:', event);
    });
  }

  showModal(): void {
    this.isVisible = true;
    this.modalEvents$.next('Modal Opened');
  }

  handleOk(): void {
    this.isVisible = false;
    this.modalEvents$.next('OK Clicked - Modal Closed');
  }

  handleCancel(): void {
    this.isVisible = false;
    this.modalEvents$.next('Cancel Clicked - Modal Closed');
  }
}

