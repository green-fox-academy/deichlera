import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class AverageOfEven {
    public static void main(String[] args) {

        //Write a Stream Expression to get the average value of the odd numbers from the following array:
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        long sum = 0;

        long count = numbers.stream().filter(n -> (n & 1) == 1).count();

        IntSummaryStatistics stats = numbers.stream().filter(n -> (n & 1) == 1).mapToInt((x) -> x).summaryStatistics();

        sum = stats.getSum();

        long average = sum / count;

        System.out.println(average);
    }
}
