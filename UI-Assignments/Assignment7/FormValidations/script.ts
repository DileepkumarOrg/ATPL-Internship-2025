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

const nameInput = document.getElementById("name") as HTMLInputElement;
const emailInput = document.getElementById("email") as HTMLInputElement;
const registerButton = document.getElementById("button") as HTMLButtonElement;

const nameErrorDiv = document.getElementById("name-error") as HTMLDivElement;
const emailErrorDiv = document.getElementById("email-error") as HTMLDivElement;

registerButton.addEventListener("click", () => {
  const userName = nameInput.value.trim();
  const userEmail = emailInput.value.trim();

  nameErrorDiv.innerHTML = "";
  emailErrorDiv.innerHTML = "";

  if (userName === "") {
    const nameError = document.createElement("p");
    nameError.textContent = "Name cannot be empty";
    nameErrorDiv.appendChild(nameError);
  }

  if (userEmail === "") {
    const emailError = document.createElement("p");
    emailError.textContent = "Email cannot be empty";
    emailErrorDiv.appendChild(emailError);
  }
});