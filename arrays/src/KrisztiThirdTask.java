public class KrisztiThirdTask {
    public static void main(String[] args) {
        boolean[][][] array = {
                {
                        {false, false, true},
                        {false, false, true},
                        {true, true, false}
                },
                {
                        {true, false, true},
                        {false, true, false}
                }
        };
        System.out.println(countFalseValue(array));
    }

    public static int countFalseValue(boolean[][][] arrayThreeD) {
        int counter = 0;
        for (boolean[][] arrayTwoD : arrayThreeD) {
            for (boolean[] array : arrayTwoD) {
                for (boolean value : array) {
                    if (!value) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}