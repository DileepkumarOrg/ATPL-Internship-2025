document.getElementById("getWeatherBtn").addEventListener("click", () => {
    const city = document.getElementById("cityInput").value.trim();
    if (city === "") {
        alert("Please enter a city name.");
        return;
    }
    getWeather(city);
});

function getWeather(city) {
    const apiKey = "82a9e6885e5ff2e53e626e05cafd191a"; 
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${encodeURIComponent(city)}&units=metric&appid=${apiKey}`;

    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw new Error("City not found");
            }
            return response.json();
        })
        .then(data => {
            displayWeather(data);
        })
        .catch(error => {
            document.getElementById("weatherResult").innerHTML = `<p style="color:red;">${error.message}</p>`;
        });
}

function displayWeather(data) {
    const temp = data.main.temp;
    const humidity = data.main.humidity;
    const description = data.weather[0].description;
    const cityName = data.name;
    const country = data.sys.country;

    document.getElementById("weatherResult").innerHTML = `
        <h3>${cityName}, ${country}</h3>
        <p><strong>Temperature:</strong> ${temp} °C</p>
        <p><strong>Humidity:</strong> ${humidity}%</p>
        <p><strong>Description:</strong> ${description}</p>
    `;
}
