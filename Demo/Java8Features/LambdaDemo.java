package Demo.Java8Features;



public class LambdaDemo {
    static String[] arr = {"Dileep", "Sandeep", "Naveen", "Mahesh","Kumar"};
    static ArrayList< String> al = new ArrayList<>(Arrays.asList(arr));

    public static void main(String[] args) {
        Comparator com = new Comparator<String>() {
            public int compare(String s1, String s2){
                System.out.println(s1.compareTo(s2));
                // return s1.compareTo(s2);
                return Character.compare(s1.charAt(1), s2.charAt(1));      
            }
        };
        System.out.println(al);
        Collections.sort(al,com);
        System.out.println(al);
    }
}
