import java.util.Scanner;

public class ApplyStringMethods {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Input : ");
        String input = scannerObj.nextLine();
        scannerObj.close();
        System.out.println("trim()           : "+ input.trim());
        System.out.println("toLowerCase()    : "+ input.toLowerCase());
        System.out.println("toUpperCase()    : "+ input.toUpperCase());
        System.out.println("replace('a','b') : "+ input.replace("a","b"));
        System.out.println("subString()      : "+input.substring(5,7));
        System.out.println("indexOf('')      : "+input.indexOf("va"));

    }
}
