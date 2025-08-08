import java.util.Scanner;

class LargestNumber{
    public static void main(String[] args) {
        int max = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of an numbersArray : ");
        int lengthArray = s.nextInt();
        int numbersArray[] = new int[lengthArray];
        for (int index = 0; index<lengthArray; index++){
            System.out.printf("Enter numbersArray[%d] : ", index);
            numbersArray[index] = s.nextInt();
            if(max < numbersArray[index]){
                max = numbersArray[index];
            }
        }
        s.close();
        System.out.println("The largest element in the numbersArray : " + max);
    }
}