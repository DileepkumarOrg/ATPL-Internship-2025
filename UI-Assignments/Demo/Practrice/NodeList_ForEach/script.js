//const container = document.getElementById("container");

/* function changeColor(){
    container.style.backgroundColor = "red";
} */

//container.addEventListener("click", changeColor);

/* container.addEventListener("click", changeColor =>{
    container.style.backgroundColor = "yellow";
})

container.addEventListener("mouseover",changeColor =>{
    container.style.backgroundColor = "tomato";
})

container.addEventListener("mouseout",changeColor=>{
    container.style.backgroundColor="purple";
})

container.addEventListener("mousemove") */


let buttons = document.querySelectorAll(".myButtons");


buttons.forEach(button =>{
    button.addEventListener("click",event =>{
    button.style.backgroundColor="tomato";
    })
})

buttons.forEach(button =>
    button.addEventListener("mouseover",event =>{
        button.style.backgroundColor="green";
    })
)

const newButton = document.createElement("button");

newButton.classList = "myButtons";
newButton.textContent = "Button5";
document.body.appendChild(newButton);
console.log(buttons);

buttons = document.querySelectorAll(".myButtons")
console.log(buttons);


buttons.forEach(button =>{
    button.addEventListener("click",event=>{
        button.remove();
        console.log(buttons);
        buttons = document.querySelectorAll(".myButtons");
        console.log(buttons)
    })
})