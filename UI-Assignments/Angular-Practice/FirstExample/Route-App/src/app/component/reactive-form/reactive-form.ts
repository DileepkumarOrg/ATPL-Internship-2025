import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';


@Component({
  selector: 'app-reactive-form',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './reactive-form.html',
  styleUrl: './reactive-form.css'
})
export class ReactiveForm {
  reactiveForm : FormGroup;

  //Form Group : : 

  /* constructor(){
    this.reactiveForm = new FormGroup({
      firstName : new FormControl(""),
      lastName : new FormControl(""),
      email : new FormControl(""),
      password : new FormControl(),
      isChecked : new FormControl(),
      //Nested Form Group
      address : new FormGroup({
        city : new FormControl(""),
        village : new FormControl("")
      })
    })
  } */


  //Form Builder && Form Array : :

  constructor(private fb:FormBuilder){
    this.reactiveForm = this.fb.group({
      firstName : ['',[Validators.required]],
      lastName : ['',[Validators.required,Validators.minLength(4)]],
      email : ['', Validators.required,Validators.minLength(10)],
      password : [''],
      isChecked : [''],
      //Nested Form Group by using form builder
      address : this.fb.group({
        city:[''],
        village:['']
      }),

      //Form Array
      skills : this.fb.array([])
    })
  }

  //Getter Method for skills form Array
  get skills() : FormArray{
    return this.reactiveForm.get('skills') as FormArray
  }
 
  // Form Group Instance
  newSkill() : FormGroup{
    return this.fb.group({
      skill : ''
    })
  }
 

  addSkill(){
    this.skills.push(this.newSkill());
  }


  deleteSkill(i:number){
    this.skills.removeAt(i);
  }

  onSubmit(){
    console.log(this.reactiveForm.value)
  }
}
