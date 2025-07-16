/* const para = document.getElementById("para");
const submitBtn = document.getElementById("submitButton");
submitBtn.addEventListener(("click"),() =>{
    return new Promise((resolve,reject) => {
        const result = false;
        if (result == true){
            setTimeout(() => {
                resolve("You walk Dog..")
                console.log("Hello People");
                para.textContent = "Hello World";
            }, 2000);
        }
        else{
            setTimeout(() => {
                reject("Rejected")
                console.log("Rejected")
            }, 2000);

        }
    });
    })
 */



/*     setTimeout(() => {
        console.log("Hello People");
    }, 2000);
    para.textContent = "Hello World"; */


/* function walkDog(){
    return new Promise((resolve,reject) => {
        setTimeout(() => {
            resolve("You walk Dog..")
        }, 1000);
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


/* function walkDog() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = false; 
            if (success) {
                resolve("You walked the dog.");
            } else {
                reject("Failed to walk the dog.");
            }
        }, 1000);
    });
}

function cleanKitchen() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true; 
            if (success) {
                resolve("You cleaned the kitchen.");
            } else {
                reject("Failed to clean the kitchen.");
            }
        }, 1500);
    });
}

function trash() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true; 
            if (success) {
                resolve("You took out the trash.");
            } else {
                reject("Failed to take out the trash.");
            }
        }, 500);
    });
}

walkDog()
    .then(value => {
        console.log(value);
        return cleanKitchen();
    })
    .then(value => {
        console.log(value);
        return trash();
    })
    .then(value => {
        console.log(value);
        console.log("All tasks done.");
    })
    .catch(error => {
        console.error("Error is ", error);
    }); */

    

function walkDog() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true;
            if (success) {
                resolve("You walked the dog.");
            } else {
                reject("Failed to walk the dog.");
            }
        }, 1000);
    });
}

function cleanKitchen() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true;
            if (success) {
                resolve("You cleaned the kitchen.");
            } else {
                reject("Failed to clean the kitchen.");
            }
        }, 1500);
    });
}


function trash() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true;
            if (success) {
                resolve("You took out the trash.");
            } else {
                reject("Failed to take out the trash.");
            }
        }, 500);
    });
}


async function performTasks() {
    try {
        const dogResult = await walkDog();
        console.log(dogResult);

        const kitchenResult = await cleanKitchen();
        console.log(kitchenResult);

        const trashResult = await trash();
        console.log(trashResult);

        console.log("All tasks done.");
    } catch (error) {
        console.error("Error is", error);
    }
}

// By uising Promise.then
const perfom = walkDog().then(value =>{console.log(value); return cleanKitchen()})
                        .then(value=>{console.log(value); return trash()})
                        .then(value=>{console.log(value); console.log("all tasks done")})
                        .catch(error => {
        console.error("Error is ", error);
    });


// By using Async and await
 async function perform(){
    try{
        const dogWork = await walkDog()
        console.log(dogWork)
        const kitchenWork = await cleanKitchen();
        console.log(kitchenWork);
        const trash = await trash();
        console.log(trash);
    }
    catch(error){
        console.error(error)
    }
}


// To call async function EventListner is used
const btn = document.getElementById("submitButton");
btn.addEventListener("click", () => {
    setTimeout(() => {
        performTasks();
    }, 1000);
}); 



