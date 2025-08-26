console.log(5);

function add(a,b){
    return a+b;
}

console.log(add(4,5));


const addition = (a,b)=>{
    return a+b;
}

console.log(addition(3,5));


const person = {name : "Dileep", age : 21, team : "UI"};
person["key"] = "value";
console.log(person);

const personKeys = Object.keys(person);
console.log(personKeys);

for(let i in person){
    console.log(i);
}

const arr = [2,5,6,4,8,7,3];
console.log(arr);
for(let i in arr){
    console.log(i);
}

arr[5] =11;

console.log(arr.length);

/* for(let i of arr){
    console.log(i);
}

for(let i of arr){
    console.log(i)
}

let count = 0;
do{
    console.log(count);
    count++;

}while(count > 5);
 */


(function(){
    console.log("Hello");
})();

(function(a,b){
    console.log(a+b);
})(4,5);

const sum = (a,b) => a+b;


console.log(sum(4,1));

let num1 = "10";
let num2 = 10;
console.log(num1===num2);



let marks = 60;

switch(true){
    case (marks>35):
        console.log("pass");
        break;
    case (marks < 35):
        console.log("Fail");
        break;
    default:
        console.log("Enter valid");
}

const persons = {name : "Dileep", age : 21, team : "UI"};

for( let i of Object.keys(persons)){
    console.log(i,":", person[i]);
}
