

const temperatureCelcius = document.getElementById("temperatureInput") as HTMLInputElement;
const convertButton = document.getElementById("convertButton") as HTMLButtonElement;
const outputDiv = document.getElementById("output-div") as HTMLDivElement;
const resetButton = document.getElementById("resetButton") as HTMLButtonElement;

convertButton.addEventListener("click",() =>{
  if (isNaN(parseInt(temperatureCelcius.value))){
    outputDiv.innerHTML = "<span>Enter Temperature...! </span>"
    outputDiv.appendChild(outputDiv);
  }

  else{
    const temperaturFahrenheit = (parseInt(temperatureCelcius.value) * 9/5)+32;
    const temperatureKelvin = (parseInt(temperatureCelcius.value)+273.15);
    outputDiv.innerHTML = `<p>Temperature in Fahrenheit is  ${temperaturFahrenheit} and  in Kelvin is ${temperatureKelvin} </p>`;
    outputDiv.appendChild(outputDiv);
  }

})

resetButton.addEventListener("click", () =>{
  outputDiv.innerHTML="";
  temperatureCelcius.value="";
})

