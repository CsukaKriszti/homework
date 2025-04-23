public class StringSmallExercises {
    public static void main(String[] args) {
        System.out.println(countSumOfBWords("dkfktnhfjdjBskrofBseiriB"));
        System.out.println(countSumOfTargetWords("dfjfhellohdbdbhellohellohchdhdhhellofhfhfhfh"));
    }

    public static int countSumOfBWords(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'B') {
                counter++;
            }
        }
        return counter;
    }

    public static int countSumOfTargetWords(String text) {
        int counter = 0;
        while (text.contains("hello")) {
            counter++;
            text = text.substring(text.indexOf("hello") + "hello".length());
        }
        return counter;
    }
}