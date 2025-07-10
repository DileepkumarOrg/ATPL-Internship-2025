function grades(){
    let maths = parseInt(document.getElementById("maths").value);
    if (maths<40){
        return document.querySelector("#result").innerHTML = `<h2 style="color:red">Result : Fail 😭😭</h2>`;
    }
    let science = parseInt(document.getElementById("science").value);
    if (science<40){
        return document.querySelector("#result").innerHTML = `<h2 style="color:red">Result : Fail 😭😭</h2>`;
    }
    let Physics = parseInt(document.getElementById("Physics").value);
    if (Physics<40){
        return document.querySelector("#result").innerHTML = `<h2 style="color:red">Result : Fail 😭😭</h2>`;
    }
    let chemistry = parseInt(document.getElementById("Chemistry").value);
    if (chemistry<40){
        return document.querySelector("#result").innerHTML = `<h2 style="color:red">Result : Fail 😭😭</h2>`;
    }
    let Social = parseInt(document.getElementById("Social").value);
    if (Social<40){
        return document.querySelector("#result").innerHTML = `<h2 style="color:red">Result : Fail 😭😭</h2>`;
    }
    graded((maths+science+Physics+chemistry+Social)/5);

}



function graded(marks){
    switch(true){
        case (marks>90):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "A+"  🤞</h2>`;
            break;
        case (marks>80):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "A"  🤩</h2>`;
            break;
        case (marks>70):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "B" 😃</h2>`;
            break;
        case (marks>60):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "C" 🥱</h2>`;
            break;
        case (marks>50):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "D" ☹️</h2>`;
            break;
        case (marks>40):
            document.querySelector("#result").innerHTML = `<h2 style="color:green">Result : Grade "E" 🫨</h2>`;
            break;
        
    }
}
