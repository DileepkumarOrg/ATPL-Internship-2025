function addition() {
    let num1 = document.getElementById("firstNumber").value;
    let num2 = document.getElementById("secondNumber").value;
    let result = parseInt(num1) + parseInt(num2);
    disp(result);
}


function Subtraction() {
    let num1 = document.getElementById("firstNumber").value;
    let num2 = document.getElementById("secondNumber").value;
    let result = parseInt(num1) - parseInt(num2);
    disp(result);
}


function multiplication() {
    let num1 = document.getElementById("firstNumber").value;
    let num2 = document.getElementById("secondNumber").value;
    let result = parseInt(num1) * parseInt(num2);
    disp(result);
}


function division() {
    let num1 = document.getElementById("firstNumber").value;
    let num2 = document.getElementById("secondNumber").value;
    let result = parseInt(num1) / parseInt(num2);
    disp(result);
}

function disp(result){
    if (isNaN(result)){
        window.alert("Enter numbers man");
    }
    else{
        document.querySelector(".result h2").innerText = "Result : " + result;
    }
}