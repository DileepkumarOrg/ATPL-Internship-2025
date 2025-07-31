import { Injectable } from '@angular/core';
import { delay, Observable, of, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserProfileService {
  constructor() {}

  getUserProfile(): Observable<any> {
    const shouldFail = Math.random() < 0.5;
    console.log(shouldFail);
    
    if (shouldFail) {
      return throwError(() => new Error('Failed to fetch user data')).pipe(delay(1000));
    }

    const userData = {
      name: 'Dileep',
      age: 22
    };

    return of(userData).pipe(delay(1000));
  }
}
