import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSelectModule} from '@angular/material/select';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
//import { MatDivider } from '@angular/material/divider';
@Component({
  selector: 'app-task-3',
  imports: [MatIconModule,MatListModule,MatButtonModule,MatToolbarModule,MatSidenavModule,MatSelectModule,MatFormFieldModule],
  templateUrl: './task-3.html',
  styleUrl: './task-3.css'
})
export class Task3 {
  
}
