public class Palindrome {
    public static void main(String[] args) {
        int num = 54;
        int a[] = {4,5,6,3};
        System.out.println(a.length);
        String s = String.valueOf(num);
        s = new StringBuilder(s).reverse().toString();
        num = Integer.valueOf(s);
        System.out.println(num + " " + Integer.valueOf(num).getClass().getSimpleName());
    }
}
