public class PooledvsNonPooled {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("By using == :");
        System.out.println("s1 == s2 :"+(s1 == s2));
        System.out.println("s1 == s3 :"+(s1 == s3));
        System.out.println("By using .equal() : ");
        System.out.println("s1.equal(s2) : "+(s1.equals(s2)));
        System.out.println("s1.equal(s3) : "+(s1.equals(s3)));
    }
}
/*
 * --> s1 == s2 is True , when ever we create a string by using literal(value) It stores in the String Constatnt Pool, 
 * If you giving same literal to the another variable it won't create another in String Constant pool, instead of creating new address the second variable is also refered to the First Variable.
 *  " == " is checked the referance address only it wont check the value or content
 * 
 * --> s1 == s3 is False, Beacause when you created a  String by using new keyword, the address should stored in Heap outside of the string constant pool. So the It should be false.
 * 
 * --> s1.equal(s2) & s1.equal(s3) : it compare the values only, so it is true.
 */