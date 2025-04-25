import java.util.ArrayList;
import java.util.List;

public class RecamansSequenceCleanUp {
    public static void main(String[] args) {
        System.out.println(fillListWithRecamansNumberRecursive(100));

    }

    public static List<Integer> fillListWithRecamansNumberRecursive(int size) {
        return fillListWithRecamansNumberRecursive(size, 0, 0, new ArrayList<Integer>());
    }

    private static List<Integer> fillListWithRecamansNumberRecursive(int size, int index, int recamanValue, List<Integer> recamansNumbers) {
        if (recamansNumbers.size() == size) {
            return recamansNumbers;
        }
        if (recamanValue - index > 0 && !(recamansNumbers.contains(recamanValue - index))) {
            recamanValue -= index;
            recamansNumbers.add(recamanValue);
        } else {
            recamanValue += index;
            recamansNumbers.add(recamanValue);
        }
        return fillListWithRecamansNumberRecursive(size, index + 1, recamanValue, recamansNumbers);
    }
}