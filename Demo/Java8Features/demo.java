public class demo {
    String name;
    double num;
    demo(String name, double num){
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        demo d = new demo("Dileep", null);
        System.out.println(d.name+d.num);
    }
}
