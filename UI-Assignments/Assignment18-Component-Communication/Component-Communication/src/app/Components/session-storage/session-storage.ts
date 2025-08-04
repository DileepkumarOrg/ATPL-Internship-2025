import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { HostListener } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-session-storage',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './session-storage.html',
  styleUrl: './session-storage.css'
})
export class SessionStorage{
  loginForm = new FormGroup({
    username : new FormControl('',[Validators.required]),
    password : new FormControl('',[Validators.required])
  })
  isLogged : boolean =false;
  welcomeMessage : string = '';
  login(){
    if (this.loginForm.valid){
      const uname = this.loginForm.value.username?? '';
      sessionStorage.setItem('username',uname.toString());
      const upassword = this.loginForm.value.password?? '';
      sessionStorage.setItem('password',upassword.toString());
      this.isLogged = true;
      this.welcomeMessage = "Hello  " + sessionStorage.getItem("username");
      this.loginForm.reset();
    }
  }
  logout(){
    sessionStorage.clear();
    this.welcomeMessage = '';
    
  }
      

    @HostListener('window:unload', ['$event'])
    unloadHandler(event: Event) {
      window.sessionStorage.clear(); 
    }


}

