const userName = document.getElementById("name");
const userMail = document.getElementById("email");
const userPassword = document.getElementById("password");
const registerButton = document.getElementById("registerButton");

registerButton.addEventListener("click", event=>{
    if(userName.value.trim() == ""){
        document.getElementById("nameError").textContent=" Name is required"
        
    }
})