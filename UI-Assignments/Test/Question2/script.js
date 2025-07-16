const username = document.getElementById("nameInput");
const age = document.getElementById("ageInput");
const generateButton = document.getElementById("generateButton");
const nameOutput = document.getElementById("nameOutput");
const ageOutput = document.getElementById("ageOutput");



    generateButton.addEventListener("click",event=>{
        if (username.value.trim()!="" && parseInt(age.value)>0){
            nameOutput.textContent = username.value;
            ageOutput.textContent = age.value;
        }else{
        alert("Enter Name and Age properly ");
        }   
    } )  
