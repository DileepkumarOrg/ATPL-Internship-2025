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
        s.close();

        for (int index = 0; index < arrayLength; index++) {
            if (visited[index]) continue;

            int count = 1;
            for (int jIndex = index + 1; jIndex < arrayLength; jIndex++) {
                if (array[index] == array[jIndex]) {
                    count++;
                    visited[jIndex] = true;
                }
            }
            System.out.println(array[index] + " occurs " + count + " times");
        }
    }
}

