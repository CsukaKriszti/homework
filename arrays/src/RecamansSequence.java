import java.util.ArrayList;
import java.util.List;

// 0,1,36,2,7,13,20,12,21,11,22,10,23
// Ha az eredmény pozitív és még nem szerepel a sorozatban, akkor a listához csatolom.
// Ha az eredmény negatív vagy már szerepel, akkor hozzáadom az aktuális lépés számát.

public class RecamansSequence {
    public static void main(String[] args) {
        List<Integer> recamansNumbers = new ArrayList<>();
        int number = 0;
        for(int i = 0; i < 100; i++){
            if(number - i > 0 && !(recamansNumbers.contains(number - i))){
                number -= i;
                recamansNumbers.add(number);
            }else{
                number += i;
                recamansNumbers.add(number);
            }
        }
        System.out.println(recamansNumbers);
    }
}



