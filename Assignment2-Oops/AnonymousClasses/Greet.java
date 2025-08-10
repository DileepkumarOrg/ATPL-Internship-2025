public interface Greet {
    void sayHello();

    public static void main(String[] args) {
        Greet obj = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hii Good Morning");
            }
        };

        obj.sayHello(); 
    }
}

