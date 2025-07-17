import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Script } from 'vm';

@Component({
  selector: 'app-user-profile',
  imports: [FormsModule,CommonModule],
  templateUrl: './user-profile.html',
  styleUrl: './user-profile.css'
})
export class UserProfile {

  //Task 1
  userName = 'John Doe';
  userAge = 25;
  userImage = 'https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_640.png';
  //Task 2
  clickMessage = ''
  onClick(){
    this.clickMessage = `Button Clicked By the ${this.userName}`;
  }
  //Task 3
  message = ''
  //Task 4
  showDetails = true;
  skills = ['Angular','Type Script','HTML','CSS', 'Java Script']
  //Task 5
  isPremiumUser = true;
}


