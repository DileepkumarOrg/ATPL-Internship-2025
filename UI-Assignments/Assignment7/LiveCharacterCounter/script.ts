
const textArea = document.getElementById("input") as HTMLTextAreaElement;
const charCounter = document.getElementById("output") as HTMLDivElement;

function updateCharacterCount(): void {
  const count = textArea.value.length;
  charCounter.textContent = `Characters: ${count}`;
}

textArea.addEventListener("input", updateCharacterCount);