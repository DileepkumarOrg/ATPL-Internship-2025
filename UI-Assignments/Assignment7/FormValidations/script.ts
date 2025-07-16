
const nameInput = document.getElementById("name") as HTMLInputElement;
const emailInput = document.getElementById("email") as HTMLInputElement;
const nameError = document.getElementById("nameError") as HTMLDivElement;
const mailError = document.getElementById("mailError") as HTMLDivElement;
const registerButton = document.getElementById("button") as HTMLButtonElement;

const emailPattern: RegExp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

registerButton.addEventListener("click", () => {
  let hasError = false;

  nameError.textContent = "";
  mailError.textContent = "";

  if (nameInput.value.trim() === "") {
    nameError.textContent = "Name is required.";
    hasError = true;
  }

  if (emailInput.value.trim() === "") {
    mailError.textContent = "Email is required.";
    hasError = true;
  } else if (!emailPattern.test(emailInput.value.trim())) {
    mailError.textContent = "Invalid email format.";
    hasError = true;
  }

  if (!hasError) {
    const registerSuccess = document.createAttribute("p") ;
    alert("Registration successful!");
    nameInput.value = "";
    emailInput.value = "";
  }
});
