import java.util.Scanner;

class LargestNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of an Array : ");
        int lengthArray = s.nextInt();
        int array[] = new int[lengthArray];
        for (int j = 0; j<lengthArray; j++){
            System.out.printf("Enter array[%d] : ", j);
            array[j] = s.nextInt();
        }
        s.close();
        int max = 0;
        for (int i = 0; i < array.length ; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The largest element in the array. : " + max);
    }
}

