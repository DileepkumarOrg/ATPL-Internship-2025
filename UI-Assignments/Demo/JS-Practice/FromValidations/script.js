
var data = [{}];
name1 = document.getElementById("nameInput");
email = document.getElementById("emailInput");
submit = document.getElementById("submit")
testPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

submit.addEventListener("click",event=>{
    const name = name1.value.trim();
    const emailId = email.value.trim();
    var isError = false;
    if (name==""){
        document.getElementById("nameError").innerHTML= "<p>Name is Required</p>";
        isError = true;
    }else document.getElementById("nameError").textContent="";
    if (emailId==""){
        document.getElementById("emailError").innerHTML = "<p> EMail ID is required</p>"
        isError = true;
    }
    else if( !testPattern.test(emailId)){
        document.getElementById("emailError").innerHTML = "<p>Incorrect Email ID</p>"
        isError = true;
    }else document.getElementById("nameError").textContent="";
    if(!isError){
        alert("Success")
        name1.value="";
        email.value="";
        form.reset();
    }
})
