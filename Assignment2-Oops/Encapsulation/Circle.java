
public class Circle {
    private float radious;
    public void setRadious(float radious) {
        this.radious = radious;
    }
    public float area(){
        return (float) (3.14*radious*radious);
    }
    public float circumstance(){
        return (float) (2*3.14*radious);
    }
}

class Radious extends Circle{
    

    public static void main(String[] args) {
        Radious circle = new Radious();
        circle.setRadious(5.2f);
        //circle.radious;
        System.out.println("Area : "+circle.area());
        System.out.println("Circumstance : "+circle.circumstance());
    }
}