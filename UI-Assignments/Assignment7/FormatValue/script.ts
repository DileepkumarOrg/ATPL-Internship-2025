

var inputValue = document.getElementById("inputValue") as HTMLInputElement;
const printButton = document.getElementById("submitButton") as HTMLButtonElement;
const outputValue = document.getElementById("output-element") as HTMLHeadingElement;






function formatValue(value: string | number): string | number {
  if (typeof value === "string") {
    return value.toUpperCase();
  } else if (typeof value === "number") {
    return value * 2;
  }
  return value;
}

printButton.addEventListener("click", () => {
  const rawInput = inputValue.value.trim();
  if (rawInput ==""){
    outputValue.textContent = "Enter something to Submit";
    outputValue.style.color = "red";
  }
  else{

    const numericValue = Number(rawInput);
    const isNumber = !isNaN(numericValue) && rawInput !== "";

    const formatted = formatValue(isNumber ? numericValue : rawInput);
    outputValue.textContent = `Output: ${formatted}`;
    outputValue.style.color = "black";
  }
});

