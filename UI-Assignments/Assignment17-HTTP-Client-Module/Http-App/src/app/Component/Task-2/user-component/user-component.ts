import { Component } from '@angular/core';
import { UserProfileService } from '../../../Services/user-profile-service';
import { catchError, of, retry } from 'rxjs';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-component',
  imports: [CommonModule],
  templateUrl: './user-component.html',
  styleUrl: './user-component.css'
})
export class UserComponent {
  userProfile: any = null;
  errorMessage: string = '';

  constructor(private userService: UserProfileService, private snackBar: MatSnackBar) {}

  fetch(): void {
    this.userService.getUserProfile()
      .pipe(
        retry(2),
        catchError(error => {
          this.snackBar.open('Error fetching profile.', 'Close', {
            duration: 3000
          });

          this.errorMessage = error.message;

          const fallbackData = {
            name: 'NA',
            age: 'N/A'
          };

          return of(fallbackData);
        })
      )
      .subscribe(data => {
        this.userProfile = data;
      });
  }
}
