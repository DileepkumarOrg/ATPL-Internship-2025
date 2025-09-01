import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(nums);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(num -> num%2==0);
        Stream<Integer> s3 = s2.map(num -> num*num);
        s3.forEach(num-> System.out.println(num));
        int result = nums.stream()
                    .filter(num -> num%2 == 0)
                    .map(num -> num*num)
                    .reduce(1,(num1, num2) -> num1+num2);
                System.out.println(result);
    }
}
