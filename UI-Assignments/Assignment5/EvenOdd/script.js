function evenOdd(){
    let num = Number(document.getElementById("number").value);
    if (num%2==0){
        window.alert("Even Number...!")
    }

    else if (num%2==1){
        window.alert("Odd Number..!")
    }

    else{
        window.alert("Enter numbers only...!")
    }
}