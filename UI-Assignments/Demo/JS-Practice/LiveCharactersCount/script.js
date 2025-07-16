const input = document.getElementById("input");
const head = document.getElementById("head");

input.addEventListener("input",(event)=>{
    let num = input.value.length;
    head.textContent = `Characters : ${num}`;
})

