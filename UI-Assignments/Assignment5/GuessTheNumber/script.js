var randomNumber;
let count = 0;
function start(){
    randomNumber = parseInt(Math.random()*100);
    count=0
    document.querySelector(".result").innerText = "Enter Number and Click Check";

}

function check(){
    const inputNumber = parseInt(document.getElementById("input").value);
    count++;
    if (isNaN(inputNumber)){
        document.querySelector(".result").innerText = "Enter number then click on Check"
    }
    else if (randomNumber > inputNumber){
        document.querySelector(".result").innerText = "too low";
    }
    else if(randomNumber < inputNumber){
        document.querySelector(".result").innerText = "too high";
    }
    else{
        document.querySelector(".result").innerText = "Correct 🎊🎆🎇 \nNumber of Attempts : "+ count;
    }
}

