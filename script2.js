
// callBack HELL
function task1(callback) {
    setTimeout(() => {
        console.log("Task1 is done");
        callback();
    }, 2000);
}



function task2( callBack){
    setTimeout(() => {
        console.log("Task2 is completed");
        callBack();
    }, 2000);
}

function task3(){
    setTimeout(() => {
        console.log("Task3 is completed");
    }, 2000);
}

task1 (callback =>{
    task2(callback =>{
        task3(callback => console.log("All tasks done"))
    });
})



// promises

function task1(){
    return new Promise((resolve,reject) =>{
        setTimeout(() => {
            resolve("Task1 is done")
        }, 2000);
    })
}


function task2(){
    return new Promise((resolve,reject) =>{
        setTimeout(() => {
            reject("Task2 is done")
        }, 2000);
    })
}


function task3(){
    return new Promise((resolve,reject) =>{
        setTimeout(() => {
            resolve("task3 is done");
        }, 2000);
    })
}


task1().then(value => {console.log(value); return task2()})
        .then(value => {console.log(value); return task3()})
        .then(value =>{console.log(value); console.log("All tasks doone")});