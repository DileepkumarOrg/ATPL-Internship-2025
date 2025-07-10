const users = [
    { name: "John", age: 25 },
    { name: "Rita", age: 22 },
    { name: "Sam", age: 30 },
];

for (let i=0; i<users.length; i++){
    let container = document.createElement("div");
    let para1 = document.createElement("p");
    let para2 = document.createElement("p");
    para1.innerText = users[i].name;
    para2.innerText = `Age  : ${users[i].age}`;
    container.appendChild(para1);
    container.appendChild(para2);
    document.querySelector("section").appendChild(container);
}