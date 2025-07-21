class Parent{
    firstName : string;
    lastName : string;

    getFullName() :string{
        return "Hello"
    }
    
    constructor(fName:string,lName:string){
        this.firstName = fName;
        this.lastName = lName;
        const full  = this.getFullName()
    }    
}

const p1 = new Parent("Dileep","Kumar")
console.log(p1.firstName);
console.log(p1.lastName);
console.log(p1.getFullName);




/* class Parent {
    firstName: string;
    lastName: string;
    full: string;

    constructor(firstName: string, lastName: string) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.full = this.getFullName();
    }

    getFullName(): string {
        return `Hello, ${this.firstName} ${this.lastName}`;
    }
}

// Create an instance and print full name
const parent1 = new Parent("John", "Doe");
console.log(parent1.full); // Outputs: Hello, John Doe */