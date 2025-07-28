class Parent{
    add(a: number,b: number): number{
        return a+b;
    }
}
 
class Child extends Parent{
    add(a:number, b:number): number {
        return a-b;
    }
}

let dil = new Child();
console.log(dil.add(10,6));
