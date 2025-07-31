import { HttpInterceptorFn } from '@angular/common/http';
const publicRoutes = ['/api/login', '/api/register'];


export const authInterceptorInterceptor: HttpInterceptorFn = (req, next) => {
  const token = localStorage.getItem('authToken');

  if (publicRoutes.some(route => req.url.includes(route))) {
    return next(req);
  }

  if (token) {
    const cloned = req.clone({
      setHeaders: {
        Authorization: `Bearer ${token}`
      }
    });
    return next(cloned);
  }

  return next(req);
};

