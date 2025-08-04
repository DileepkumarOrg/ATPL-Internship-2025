import { Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-local-storage',
  imports: [],
  templateUrl: './local-storage.html',
  styleUrl: './local-storage.css'
})
export class LocalStorage {
  isDark :boolean = true;
  @ViewChild("dark") buttonElement!: ElementRef<HTMLButtonElement>
  constructor(){
    var storedTheme  = localStorage.getItem('theme');
    if(storedTheme!==null){
      this.isDark = storedTheme === 'true';
    }
  }
  

  toggle(){
    console.log(this.isDark);
    if(this.buttonElement.nativeElement.classList.contains('dark-Mode')){
      this.buttonElement.nativeElement.classList.remove('dark-Mode')
    }
    else{
      this.buttonElement.nativeElement.classList.add('dark-Mode')
    }
    localStorage.setItem('theme',this.isDark.toString())
  }
  clear(){
    localStorage.clear();
  }
}

