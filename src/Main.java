import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evenNumbers =
                EvenNumberFilter.filterEvenNumbers(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers List: " + evenNumbers);
    }
}