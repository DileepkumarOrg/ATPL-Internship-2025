let listOfAllTasks=[];
 function addTask() {
    const taskList = document.getElementById("task-list");
    const newTask = document.createElement("div");
    newTask.className = "task";

    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.className = "task-checkbox";

    const taskText = document.createElement("span");
    taskText.textContent = document.getElementById("newTaskAdding").value.trim();

    if (document.getElementById("newTaskAdding").value != ""){
      listOfAllTasks.push(document.getElementById("newTaskAdding").value);
      taskText.className = "task-text";
      newTask.appendChild(checkbox);
      newTask.appendChild(taskText);
      taskList.appendChild(newTask);
    }
    else{
      window.alert("Enter Task then click on Add...!")
    }
    document.getElementById("newTaskAdding").value = "";
}

function deleteSelectedTask() {
    const checkboxes = document.querySelectorAll(".task-checkbox");
    checkboxes.forEach(checkbox => {
        if (checkbox.checked) {
            checkbox.parentElement.remove();
        }
    });
}

function doneSelectedTasks() {
    const checkboxes = document.querySelectorAll(".task-checkbox");
    checkboxes.forEach(checkbox => {
        if (checkbox.checked) {
            const taskBox = checkbox.parentElement;
            taskBox.style.backgroundColor = "lightgreen";
            taskBox.style.color = "gray";
        }
    });
}

function notDoneSelectedTasks(){
  const checkboxes = document.querySelectorAll(".task-checkbox");
  checkboxes.forEach(checkboxe =>{
    if (checkboxe.checked){
      const taskBox = checkboxe.parentElement;
      taskBox.style.backgroundColor="tomato";
    }
  })
}



function displayAllTasks(){
  let allTasks = document.getElementById("allTasks");
  allTasks.innerHTML = "<h3>All Tasks:</h3>";
  listOfAllTasks.forEach((element,index) =>{
    let task = document.createElement("p");
    task.innerText = `${index+1}. ${element}`
    allTasks.appendChild(task);

  })
}



let buttons = document.querySelectorAll(".buttons");

buttons.forEach(button =>{
  button.addEventListener(".buttons-hover",event =>{
    event.target.button.classList.toggle(".buttons-hover");
  })
});


/* buttons.forEach(button => {
  button.addEventListener("mouseenter", () => {
    button.classList.add("buttons-hover");
  });

  button.addEventListener("mouseleave", () => {
    button.classList.remove("buttons-hover");
  });
}); */