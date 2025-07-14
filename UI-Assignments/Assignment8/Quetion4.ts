class Person {
    public name: string;
    private age: number;
    protected gender: string;

    constructor(name: string, age: number, gender: string) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public getAge(): number {
        return this.age;
    }

    public getGender(): string {
    return this.gender;
    }

}
const person = new Person("Charan",30,"male");
console.log(person.getAge());
console.log(person.getGender());




/* class Person {
  public name: string;
  private age: number;
  protected gender: string;

  constructor(name: string, age: number, gender: string) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public getAge(): number {
    return this.age;
  }

  // Optional: Add a getter for gender if you want outside access
  public getGender(): string {
    return this.gender;
  }
}

// Create an instance
const person = new Person("Alex", 30, "Male");

// Access permitted properties
console.log(person.name);         // OK
console.log(person.getAge());    // OK
console.log(person.getGender()); // OK */


