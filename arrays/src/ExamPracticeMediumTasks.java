public class ExamPracticeMediumTasks {
    public static void main(String[] args) {
        boolean[][][][] array4D = {{{{true, true}, {true, true}}, {{true, true}, {true, true}}},
                {{{true, true}, {false, true}}, {{true, true}, {true, true}}}};
        System.out.println(areAllValuesTrue(array4D));
        int[] numbers = {1, 6, 3, 5, 8, 9};
        System.out.println(multiplyByIndexAndSum(numbers));
        int[] numbers2 = {1, 2, 3, 4};
        System.out.println(calculateStrangePatternSum(numbers2));
        System.out.println(calculateSpecialPatternSum(numbers2));
    }

    public static boolean areAllValuesTrue(boolean[][][][] array4D) {
        for (boolean[][][] array3D : array4D) {
            for (boolean[][] array2D : array3D) {
                for (boolean[] array : array2D) {
                    for (boolean item : array) {
                        if (!item) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int multiplyByIndexAndSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;
        }
        return sum;
    }

    public static int calculateStrangePatternSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 4 == 0) {
                sum += numbers[i];
            } else if (i % 4 == 1) {
                sum += numbers[i] * 2;
            } else if (i % 4 == 2) {
                sum -= numbers[i];
            } else {
                sum -= numbers[i] * 2;
            }
        }
        return sum;
    }

    public static int calculateSpecialPatternSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (i % 2 != 0) ? numbers[i] * 2 : -numbers[i];
        }
        return sum;
    }
}