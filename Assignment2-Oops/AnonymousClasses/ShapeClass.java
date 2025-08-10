abstract class Shape {
    abstract void draw();
}

public class ShapeClass {
    public static void main(String[] args) {
        Shape myShape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing method ");
            }
        };
        myShape.draw();
    }
}