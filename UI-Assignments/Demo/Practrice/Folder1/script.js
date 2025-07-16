/* 
function hello(callback){
    console.log("Hello")
    callback()
}
function greet(){
    console.log("Good Morning");
}

hello(greet);
 */


// Callback function for Multiplication on console and DOM.

/* function multiply(callback , num1,num2){
    res= num1-num2;
    callback(res);
}

function dispcons(result){
    console.log(result);
}

function todispDOM(result){
    document.getElementById("h1").textContent = result;
}

multiply(todispDOM,10,6)

multiply(dispcons,6,2); */




/* function add(callback, num1, num2){
    let res = num1 + num2;
    callback(res);
}

function dispConsole(res){
    console.log(res)
}

add(toDispDOM, 4,6);

function toDispDOM(res){
    document.getElementById("h1").textContent = res;
} */



///////// for each 

/* fruits = ['apple','banana','Orange','Coconut']

fruits.forEach(upperCase);
fruits.forEach(disp);
fruits.forEach(lowerCase)
fruits.forEach(disp);



function upperCase(element,index,array){
    array[index] = element.toUpperCase();
    
}

function lowerCase(element,index,array){
    array[index] = element.toLowerCase();
}


function disp(element){
    console.log(element);
}


numbers = [1,2,3,6,5,4];

numbers.forEach(disp);
numbers.forEach(multipleBy3);
numbers.forEach(disp);

function disp(element){
    console.log(element)
}

function multipleBy3(element,index,array){
    array[index] = element*3;
}


nums = [1,2,3,6,5,4,7,8,9];

nums.forEach(disp);
nums.forEach(square);
nums.forEach(disp)

function disp(element){
    console.log(element);
}

function square(element,index,array){
    array[index] = element**2;
}
 */



///////// map()
/* 
const numbers = [1,2,3,4,5,6];
const squares = numbers.map(sq); */
/* function sq(element,index,array){
    array[index] = element**2;
} */
/* function sq(element){
    return Math.pow(element,2);
}
console.log(squares) */

////// SetTimeout and setTimeINteravl

/* function add(num1, num2, disp){
    res = num1+num2;
    disp(res);
}
function multiply(num1, num2, disp){
    res = num1 * num2;
    disp(res)
}

function disp(result){
    console.log(result);
}

setTimeout (function() {
    add(2,3,disp);
},2000)

setTimeout (function(){
    multiply(2,3,disp)
},4000)

i = 0;
setInterval (function(){
    console.log(i);
    i++;
},2000); */

//// Arrow Functions

//Normal Add function
/* function add(num1,num2){
    return num1+num2;
}

console.log(add(4,6));

// Arrow add function

const sum = (num1,num2)=>{
    return num1+num2;
}

const sum2 = (num1,num2) => (num1+num2);
console.log(sum(1,2),sum2(1,2))

// Normal
function greet(name) {
    console.log(name);
}

greet("Sunder");

//arrow

const greet2 = (name) => name;

console.log(greet2("Dileep")); */
/* console.log("Wait for 2 sec")
const time = setTimeout(callBack =>{
    console.log("2 sec done")
},2000)
let cont = 0;
const interval = setInterval(callBack => {
    console.log(cont+"Iterate");
    cont++;
},2000) */


function task1(){
    setTimeout(() => {
       console.log("Task1 is completed")     
    }, 2000);
}

function task2(){
    setTimeout(()=>{
        console.log("Task2 is completed")
    },4000);
}

function task3(){
    console.log("Task3 is completed")
}

function task4(){
    console.log("Task4 is completed")
}

task1();
task2();
task3();
task4();
