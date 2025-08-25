public class WrapperClass {
    public static void main(String[] args) {
        int num = 5;
        double db = 2.5;
        char ch = 'A';
        boolean b = true;

        Integer numObj = num;
        Double dbObj = db;
        Character chObj = ch;
        Boolean bObj = b;

        System.out.println("Class of intObj : "+numObj.getClass().getName());
        System.out.println("Class of doubleObj : "+dbObj.getClass().getName());
        System.out.println("Class of charactorObj : "+chObj.getClass().getName());
        System.out.println("Class of booleanObj : "+bObj.getClass().getName());
    }
}
