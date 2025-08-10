
abstract class Shape {
    abstract double area();
}

class Triangel extends Shape{
    double height, base;
    Triangel(int height, int base){
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape{
    double side;
    Square(int side){
        this.side = side;
    }

    @Override
    double area(){
        return side*side;
    }
}

public class Area {
    public static void main(String[] args) {
        Shape triangleObj = new Triangel(4,5);
        Shape squareObj = new Square(5);
        System.out.println(triangleObj.area());
        System.out.println(squareObj.area());
    }
     
}