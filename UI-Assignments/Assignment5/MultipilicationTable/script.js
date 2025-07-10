

function table() {
    let num = parseInt(document.getElementById("input").value);
    let output = "";

    if (isNaN(num)) {
        output = "Please enter a number.";
    } else {
        for (let i = 1; i <= 10; i++) {
            output += `${num}  X  ${i} =   ${num * i}\n`;
        }
    }

    document.querySelector(".result").innerText = output;
}
