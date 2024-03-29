import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(677, 838, 935, 593, 294, 12, 64, 87, 5, 0);

        printSumOfEvenNumbers(list);
        printDoubledNumbers(list);
        printMaxNumber(list);
        printOddNumbers(list);
        printAverage(list);
    }

    public static void printSumOfEvenNumbers(List<Integer> list) {
        int sumEvenNumbers = list.stream()
                .filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Сума парних чисел: " + sumEvenNumbers);
    }

    public static void printDoubledNumbers(List<Integer> list) {
        list.stream().map(n -> n * 2).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    public static void printMaxNumber(List<Integer> list) {
        int max = list.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Максимальне число: " + max);
    }

    public static void printOddNumbers(List<Integer> list) {
        String oddNumbers = list.stream().filter(n -> n % 2 != 0).map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("Непарні числа: " + oddNumbers);
    }

    public static void printAverage(List<Integer> list) {
        double average = list.stream().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println("Середнє арифметичне: " + average);
    }
}