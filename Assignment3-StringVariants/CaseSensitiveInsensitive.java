public class CaseSensitiveInsensitive {
    public static void main(String[] args) {
        String input1 = "Java";
        String input2 = "java";
        System.out.println("input1.equals(input2) :"+input1.equals(input2));
        System.out.println("input1.equalsIgnoreCase(input2) :"+input1.equalsIgnoreCase(input2));
        System.out.println("input1.compareTo(input2) :"+input1.compareTo(input2));

    }
}
