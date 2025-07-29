import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Authentication {
  isLogged = false;
  login(username:string, password :string){
    if (username == "admin" && password == 'password'){
      this.isLogged = true;
    }
  }
  logout(){
    this.isLogged =false;
  }
}
