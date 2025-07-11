var temperatureCelcius = document.getElementById("temperatureInput");
var convertButton = document.getElementById("convertButton");
var outputDiv = document.getElementById("output-div");
var resetButton = document.getElementById("resetButton");
convertButton.addEventListener("click", function () {
    if (isNaN(parseInt(temperatureCelcius.value))) {
        outputDiv.innerHTML = "<span>Enter Temperature...! </span>";
        outputDiv.appendChild(outputDiv);
    }
    else {
        var temperaturFahrenheit = (parseInt(temperatureCelcius.value) * 9 / 5) + 32;
        var temperatureKelvin = (parseInt(temperatureCelcius.value) + 273.15);
        outputDiv.innerHTML = "<p>Temperature in Hahrenheit is  ".concat(temperaturFahrenheit, " and  in Kelvin is ").concat(temperatureKelvin, " </p>");
        outputDiv.appendChild(outputDiv);
    }
});
resetButton.addEventListener("click", function () {
    outputDiv.innerHTML = "";
    temperatureCelcius.value = "";
});
