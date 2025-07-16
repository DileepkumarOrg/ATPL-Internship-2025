/*const nameInput = document.getElementById("name") as HTMLInputElement;
 const userName = nameInput.value.trim();
const emailInput = document.getElementById("email") as HTMLInputElement;
const userEmail = emailInput.value.trim();
const registerButton = document.getElementById("button") as HTMLButtonElement;
var errorDiv = document.querySelector("error");
errorDiv
registerButton.addEventListener("click", ()=>{
  const errorMessage = document.createElement("p");
  if (userEmail == "" || userName ==""){
    errorMessage.textContent = "Input never empty";
    errorMessage.appendChild(errorDiv);
  }
}) */
/* const nameInput = document.getElementById("name") as HTMLInputElement;
const emailInput = document.getElementById("email") as HTMLInputElement;
const registerButton = document.getElementById("button") as HTMLButtonElement;
const errorDiv = document.querySelector(".error") as HTMLDivElement; // Assuming it's a class

registerButton.addEventListener("click", () => {
  const userName = nameInput.value.trim();
  const userEmail = emailInput.value.trim();

  errorDiv.innerHTML = "";

  if (userEmail === "" || userName === "") {
    const errorMessage = document.createElement("p");
    errorMessage.textContent = "Input never empty";
    errorDiv.appendChild(errorMessage);
  }
});
 */
var nameInput = document.getElementById("name");
var emailInput = document.getElementById("email");
var registerButton = document.getElementById("button");
var nameErrorDiv = document.getElementById("name-error");
var emailErrorDiv = document.getElementById("email-error");
registerButton.addEventListener("click", function () {
    var userName = nameInput.value.trim();
    var userEmail = emailInput.value.trim();
    // Clear previous errors
    nameErrorDiv.innerHTML = "";
    emailErrorDiv.innerHTML = "";
    if (userName === "") {
        var nameError = document.createElement("p");
        nameError.textContent = "Name cannot be empty";
        nameErrorDiv.appendChild(nameError);
    }
    if (userEmail === "") {
        var emailError = document.createElement("p");
        emailError.textContent = "Email cannot be empty";
        emailErrorDiv.appendChild(emailError);
    }
});
