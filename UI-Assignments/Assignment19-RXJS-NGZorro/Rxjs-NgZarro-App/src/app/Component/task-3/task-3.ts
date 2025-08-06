import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { concatMap, delay, from, of, Subject, switchMap } from 'rxjs';

@Component({
  selector: 'app-task-3',
  imports: [NzButtonModule,CommonModule],
  templateUrl: './task-3.html',
  styleUrl: './task-3.css'
})
export class Task3 {
  private reload$ = new Subject<void>();
  baseUrl = 'https://jsonplaceholder.typicode.com/users';
  userList: any[] = [];

  constructor(private http: HttpClient) {
      this.reload$
      .pipe(
        switchMap(() => {
          return this.http.get<any[]>(this.baseUrl);
        }),
        switchMap(users =>
          from(users).pipe(
            concatMap(user =>
              of(user).pipe(delay(1000))
            )
          )
        )
      )
      .subscribe(user => {
        console.log(user);
        this.userList.push(user); 
      });
  }

  onClick() {
    this.reload$.next();
  }
}
