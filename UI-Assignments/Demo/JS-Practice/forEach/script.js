
let buttons = document.querySelectorAll(".buttons");

buttons.forEach(button =>{
    button.addEventListener("click",event=>{
        button.parentElement.remove();
        buttons = document.querySelectorAll(".buttons")
        console.log(buttons)
    })
})



buttons.forEach(button =>{
    button.addEventListener("mouseover",event =>{
    button.style.backgroundColor="tomato";
    button.style.padding="11px";
    })
})

buttons.forEach(button =>{
    button.addEventListener("mouseout",event=>{
        button.style.backgroundColor="lightgreen";
        button.style.color = "white";
        button.style.padding = "10px";
    })
})

/* function btn1(){
    return new Promise((resolve,reject)=>{
       let btno1 = document.getElementById("button1");
        setTimeout(() => {
            btno1.remove()
        }, 5000);
    })
}

function btn2(){
    return new Promise((resolve,reject)=>{
        let btno2 = document.getElementById("button2");
        setTimeout(() => {
            btno2.remove();
        }, 10000);
    })
}

btn1().then(btn2())

 */


const btn1 = new Promise((resolve,reject) =>{
    resolve("Hello")
})
console.log(btn1)

