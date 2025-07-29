import { inject } from '@angular/core';
import { CanActivateFn } from '@angular/router';
import { Authentication } from '../Service/authentication';

export const authGuardGuard: CanActivateFn = () => {
  const isLog = inject(Authentication).isLogged;
  return isLog;
};

