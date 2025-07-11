var textArea = document.getElementById("input");
var charCounter = document.getElementById("output");
function updateCharacterCount() {
    var count = textArea.value.length;
    charCounter.textContent = "Characters: ".concat(count);
}
textArea.addEventListener("input", updateCharacterCount);
