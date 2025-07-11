var inputValue = document.getElementById("inputValue");
var printButton = document.getElementById("submitButton");
var outputValue = document.getElementById("output-element");
function formatValue(value) {
    if (typeof value === "string") {
        return value.toUpperCase();
    }
    else if (typeof value === "number") {
        return value * 2;
    }
    return value;
}
printButton.addEventListener("click", function () {
    var rawInput = inputValue.value.trim();
    if (rawInput == "") {
        outputValue.textContent = "Enter something to Submit";
        outputValue.style.color = "red";
    }
    else {
        var numericValue = Number(rawInput);
        var isNumber = !isNaN(numericValue) && rawInput !== "";
        var formatted = formatValue(isNumber ? numericValue : rawInput);
        outputValue.textContent = "Output: ".concat(formatted);
        outputValue.style.color = "black";
    }
});
