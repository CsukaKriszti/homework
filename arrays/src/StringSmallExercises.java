public class StringSmallExercises {
    public static void main(String[] args) {
        System.out.println(countSumOfBWords("dkfktnhfjdjBskrofBseiriB"));
        System.out.println(countSumOfTargetWords("dfjfhellohdbdbhellohellohchdhdhhellofhfhfhfh", "hello"));
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

    public static int countSumOfTargetWords(String text, String targetWord) {
        int counter = 0;
        while (text.contains(targetWord)) {
            counter++;
            text = text.substring(text.indexOf(targetWord) + targetWord.length());
        }
        return counter;
    }
}