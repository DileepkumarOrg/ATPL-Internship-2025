

// walking
// cleaning kitchen
// Take out the trash

// callBack Hell
function walkDog(callBack){
    setTimeout(() =>{
        console.log("You walk dog");
        callBack();
    },2000)
}

function cleanKitchen(callBack){
    setTimeout(() => {
        console.log("Cleaning kitchen");
        callBack();
    },1500)
}

function trash(callBack){
    setTimeout(() =>{
        console.log("Youe Take out the trash");
        callBack();
    },500)
}


walkDog(callBack =>{
    cleanKitchen(callBack =>{
        trash(()=> console.log("Completed all works"))
    });
});

// Promise

/* function walkDog(){
    return new Promise((resolve,reject) => {
        setTimeout(() => {
            resolve("You walk Dog..")
        }, 2000);
    });
}


function cleanKitchen(){
    return new Promise((resolve,reject) =>{
        setTimeout(() => {
            resolve("You Clean the kitchen");
        }, 1500);
    });
}


function trash(){
    return new Promise((resolve,reject) =>{
        setTimeout(() => {
            resolve("you trashed out");
        }, 500);
    } );
}


walkDog().then(value => {console.log(value); return cleanKitchen()})
        .then(value => {console.log(value); return trash()})
        .then(value => {console.log(value); return console.log("All tasks done")}); */




 