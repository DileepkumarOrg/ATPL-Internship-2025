import java.util.Scanner;

public class FrequencyElement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Length of Array: ");
        int arrayLength = s.nextInt();
        int[] array = new int[arrayLength];
        boolean[] visited = new boolean[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Enter array[%d]: ", i);
            array[i] = s.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(array[i] + " occurs " + count + " times");
        }
    }
}