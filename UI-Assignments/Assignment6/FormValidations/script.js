register = document.getElementById("registrationForm");
register.addEventListener("submit", function(event) {
  event.preventDefault();
	clearErrors();

	const name = document.getElementById("name").value.trim();
	const email = document.getElementById("email").value.trim();
	const password = document.getElementById("password").value;
	const confirmPassword = document.getElementById("confirmPassword").value;

	let isContainErrors;

	if (name == "") {
		Errors("nameError", "Name is required.");
		isContainErrors = true;
	}

	if (email == "") {
		Errors("emailError", "Email is required.");
		isContainErrors = true;
	} else if (!validateEmail(email)) {
		Errors("emailError", "Invalid email format.");
		isContainErrors = true;
	}

	if (password == "") {
		Errors("passwordError", "Password is required.");
		isContainErrors = true;
	} else if (password.length < 6) {
		Errors("passwordError", "Password must be at least 6 characters.");
		isContainErrors = true;
	}

	if (confirmPassword == "") {
		Errors("confirmPasswordError", "Please confirm your password.");
		isContainErrors = true;
	} else if (password !== confirmPassword) {
		Errors("confirmPasswordError", "Passwords do not match.");
		isContainErrors = true;
	}

	if (!isContainErrors) {
		alert("Registration successful!");
		register.reset();

	}
});

function Errors(elementId, message) {
	document.getElementById(elementId).textContent = message;
}

function clearErrors() {
	Errors("nameError", "");
	Errors("emailError", "");
	Errors("passwordError", "");
	Errors("confirmPasswordError", "");
}

function validateEmail(email) {
	const specialCharacters = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	return specialCharacters.test(email.toLowerCase());
}
