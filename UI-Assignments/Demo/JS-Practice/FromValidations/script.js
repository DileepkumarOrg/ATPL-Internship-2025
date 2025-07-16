
var data = [];
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
        var obj = {};
        obj.name=name;
        obj.emailId=emailId;
        data.push(obj);
        console.log(data)
        name1.value="";
        email.value="";
    }
})


display = document.getElementById("display");
display.addEventListener("click",event =>{
    const displayDiv = document.createElement("div");
    displayDiv.classList = "resultDiv";
    for (index = 0; index < data.length; index++){
        const h2tag = document.createElement("h2");
        h2tag.textContent = `Name : ${data[index].name} and email ID ${data[index].emailId}`
        displayDiv.appendChild(h2tag);
    }
    document.body.appendChild(displayDiv);
})


