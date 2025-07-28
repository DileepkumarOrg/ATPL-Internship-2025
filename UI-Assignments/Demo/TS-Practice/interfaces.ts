interface InterFace{
    name :string;
    email : string;
    roll : number,
    getFullname():void;
}

interface InterFace2 extends  InterFace{
    address : string;
}

class Main implements InterFace2{
    name = "Hello";
    email = "Hello";
    roll = 25;
    address = 'JHvjh';
    Extra  = 65632;
    getFullname(){
        console.log(this.name);
    }
}

var person = new Main();
console.log(person.name,  person.Extra);
person.getFullname();


