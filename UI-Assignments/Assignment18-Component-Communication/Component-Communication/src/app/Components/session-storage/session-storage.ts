import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { HostListener } from '@angular/core';
import { RouterLink } from '@angular/router';
@Component({
  selector: 'app-session-storage',
  imports: [ReactiveFormsModule, RouterLink],
  templateUrl: './session-storage.html',
  styleUrl: './session-storage.css'
})
export class SessionStorage{
  loginForm = new FormGroup({
    username : new FormControl('',[Validators.required]),
    password : new FormControl('',[Validators.required])
  })


  login(){
    if (this.loginForm.valid){
      const uname = this.loginForm.value.username?? '';
      sessionStorage.setItem('username',uname.toString());
      const upassword = this.loginForm.value.password?? '';
      sessionStorage.setItem('password',upassword.toString());
    }
    setTimeout(() => {
      sessionStorage.clear();
    }, 5000);
  }

      

    @HostListener('window:unload', ['$event'])
    unloadHandler(event: Event) {
      window.sessionStorage.clear(); 
    }


}

