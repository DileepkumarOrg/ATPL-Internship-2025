import java.util.*;
class First {
    public static boolean isPrime(int num){
            if (num < 2) {
                return false;
            }
            else{
                for (int i =2 ; i < Math.round(Math.pow(num, 0.5)+1); i++){
                    if (num%i == 0) {
                        return false;
                    }
                } return true;
            }
        }
    public static void main(String[] args) {
        int c = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = s1.nextInt();
        for(int j = 1; j < num; j++){
            System.out.print(j+" ");
            System.out.println(isPrime(j));
            if (isPrime(j)) {
                c++;
            }
        }
        s1.close();
        System.out.println("Count of Prime Numbers " + c);
    }
}

