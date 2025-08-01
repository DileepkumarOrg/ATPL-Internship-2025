import { Component } from '@angular/core';

@Component({
  selector: 'app-local-storage',
  imports: [],
  templateUrl: './local-storage.html',
  styleUrl: './local-storage.css'
})
export class LocalStorage {
  isDark :boolean = true;
  constructor(){
    var storedTheme  = localStorage.getItem('theme');
    if(storedTheme!==null){
      this.isDark = storedTheme === 'true';
    }
  }
  toggle(){
    console.log(this.isDark);
    localStorage.setItem('theme',this.isDark.toString())
  }
  clear(){
    localStorage.clear();
  }
}

