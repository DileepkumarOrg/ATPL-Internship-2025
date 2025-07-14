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
console.log(person.name);
console.log(person.getAge());
console.log(person.getGender());

