var nameInput = document.getElementById("name");
var emailInput = document.getElementById("email");
var nameError = document.getElementById("nameError");
var mailError = document.getElementById("mailError");
var registerButton = document.getElementById("button");
var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
registerButton.addEventListener("click", function () {
    var hasError = false;
    nameError.textContent = "";
    mailError.textContent = "";
    if (nameInput.value.trim() === "") {
        nameError.textContent = "Name is required.";
        hasError = true;
    }
    if (emailInput.value.trim() === "") {
        mailError.textContent = "Email is required.";
        hasError = true;
    }
    else if (!emailPattern.test(emailInput.value.trim())) {
        mailError.textContent = "Invalid email format.";
        hasError = true;
    }
    if (!hasError) {
        var registerSuccess = document.createAttribute("p");
        alert("Registration successful!");
        nameInput.value = "";
        emailInput.value = "";
    }
});
