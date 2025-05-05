import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    //n is even --> n / 2
    //n is odd --> 3*n + 1
    // the last element is 1

    // 5 --> 16 8 4 2 1
    // 7 --> 22 --> 11 --> 34 --> 17 --> 52 --> 26 --> 13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1
    public static void main(String[] args) {
        System.out.println(generateCollatzSequence(7));
        System.out.println(generateCollatzSequenceDoWhile(5));
        System.out.println(generateCollatzSequenceWithRecursion(5, new ArrayList<>()));

    }

    public static List<Integer> generateCollatzSequence(int number) {
        List<Integer> collatzSequence = new ArrayList<>();
        while (number > 1) {
            collatzSequence.add(number);
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
        collatzSequence.add(1);
        return collatzSequence;
    }

    public static List<Integer> generateCollatzSequenceDoWhile(int number) {
        List<Integer> collatzSequence = new ArrayList<>();
        do {
            collatzSequence.add(number);
            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
        } while (number > 1);
        collatzSequence.add(1);
        return collatzSequence;
    }

    public static List<Integer> generateCollatzSequenceWithRecursion(int number) {
        return generateCollatzSequenceWithRecursion(number, new ArrayList<>());
    }

    private static List<Integer> generateCollatzSequenceWithRecursion(int number, List<Integer> numbers) {
        numbers.add(number);
        if (number == 1) {
            return numbers;
        }
        if (number % 2 == 0) {
            return generateCollatzSequenceWithRecursion(number / 2, numbers);
        } else {
            return generateCollatzSequenceWithRecursion(number * 3 + 1, numbers);
        }
    }
}
