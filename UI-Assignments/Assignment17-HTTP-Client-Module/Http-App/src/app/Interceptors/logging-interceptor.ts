import { tap } from 'rxjs/operators';
import { HttpInterceptorFn, HttpResponse } from '@angular/common/http';

export const loggingInterceptor: HttpInterceptorFn = (request, next) => {
  const timestamp = new Date().toISOString();

  console.groupCollapsed(`  Outgoing Request @ ${timestamp}`);
  console.log(' Method:', request.method);
  console.log(' URL:', request.urlWithParams);
  console.log(' Headers:', request.headers);
  console.log(' Body:', request.body);
  console.groupEnd();

  return next(request).pipe(
    tap({
      next: (res) => {
        if (res instanceof HttpResponse) {
          console.groupCollapsed(`  Incoming Response`);
          console.log(' Status Code:', res.status);
          console.log(' Response Body:', res.body);
          console.groupEnd();
        }
      },
      error: (error) => {
        console.groupCollapsed(`  Request Failed`);
        console.error(' Status:', error.status);
        console.error(' Message:', error.message);
        console.groupEnd();
      }
    })
  );
};

