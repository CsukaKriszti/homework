import java.util.ArrayList;
import java.util.List;

// 0,1,3,6,2,7,13,20,12,21,11,22,10,23
// Ha az eredmény pozitív és még nem szerepel a sorozatban, akkor a listához csatolom.
// Ha az eredmény negatív vagy már szerepel, akkor hozzáadom az aktuális lépés számát.

public class RecamansSequence {
    public static void main(String[] args) {
        System.out.println(fillListWithRecamansNumber(100));
        List<Integer> recamansNumbers = new ArrayList<>();
        System.out.println(fillListWithRecamansNumberRecursive(100, 0, 0, recamansNumbers));

    }

    public static List<Integer> fillListWithRecamansNumber(int size) {
        List<Integer> recamansNumbers = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (number - i > 0 && !(recamansNumbers.contains(number - i))) {
                number -= i;
                recamansNumbers.add(number);
            } else {
                number += i;
                recamansNumbers.add(number);
            }
        }
        return recamansNumbers;
    }

    public static List<Integer> fillListWithRecamansNumberRecursive(int size, int index, int number, List<Integer> recamansNumbers) {
        if (recamansNumbers.size() == size) {
            return recamansNumbers;
        }
        if (number - index > 0 && !(recamansNumbers.contains(number - index))) {
            number -= index;
            recamansNumbers.add(number);
        } else {
            number += index;
            recamansNumbers.add(number);
        }
        return fillListWithRecamansNumberRecursive(size, index + 1, number, recamansNumbers);
    }

}