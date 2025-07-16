
var inputList = document.getElementById("inputList");
var addButton = document.getElementById("addButton");
var addListDiv = document.getElementById("addList-div");

addButton.addEventListener("click", event => {
    if (inputList.value.trim() != ""){
        const listItem = document.createElement("div");
        const addElementList = document.createElement("p");
        const addDeleteButton = document.createElement("button");

        addElementList.textContent = inputList.value;
        addDeleteButton.textContent = "Delete";
        addDeleteButton.classList.add("deleteButtons");
        listItem.classList.add("createdDiv")
        listItem.appendChild(addElementList);
        listItem.appendChild(addDeleteButton);
        addListDiv.appendChild(listItem);

        addDeleteButton.addEventListener("click", () => {
            listItem.remove();
        });
        inputList.value=""
    }
    else{
        alert("Enter list")
    }
});
































