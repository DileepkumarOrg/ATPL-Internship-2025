function updateTime() {
    const now = new Date();
    const timeString = now.toLocaleTimeString(); 
    document.getElementById("demo").innerHTML = timeString;
}

function startClock() {
    updateTime(); 
    setInterval(updateTime, 1000);
}


function lightMode(){
    if (window.getComputedStyle(document.body).backgroundColor == "rgb(0, 0, 0)"){
        document.getElementById("button-div").style.backgroundColor = "white";
        document.getElementById("container").style.backgroundColor = "white";
        document.getElementById("main-body").style.backgroundColor = "white";
        document.getElementById("demo").style.color = "black";
        document.querySelector("button").style.color = "black";
        document.querySelector("button").style.backgroundColor = "white";
        document.querySelector("button").innerText = "Dark Mode";
        document.querySelector("button").style.borderColor = "black";
    }
    else{
        document.getElementById("button-div").style.backgroundColor = "black";
        document.getElementById("container").style.backgroundColor = "black";
        document.getElementById("main-body").style.backgroundColor = "black";
        document.getElementById("demo").style.color = "white";
        document.querySelector("button").style.color = "white";
        document.querySelector("button").style.backgroundColor = "black";
        document.querySelector("button").innerText = "Light Mode";
        document.querySelector("button").style.borderColor = "white";
    }
}