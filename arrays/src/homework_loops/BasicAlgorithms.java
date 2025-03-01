package homework_loops;

public class BasicAlgorithms {
    public static void main(String[] args) {

        int[] numbers = {11, -12, 16, 93, 23, 101, -65, 204, 8, 78};

        System.out.println("1. Print the largest element of the array.");
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
        System.out.println();

        System.out.println("2. Print the smallest element of the array.");
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
        System.out.println();


        System.out.println("3. Count how many elements are greater than 100.");
        int counter = 0;
        for (int number : numbers) {
            if (number > 100) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("4. Count how many elements are between -50 and 78.");
        counter = 0;
        for (int number : numbers) {
            if (number > -50 && number < 78) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("5. Count how many elements are divisible by 2.");
        counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("6. Count how many elements are not divisible by 3.");
        counter = 0;
        for (int number : numbers) {
            if (number % 3 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("7. Count how many times the number 73 can be found in that array.");
        counter = 0;
        for (int number : numbers) {
            if (number == 73) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("8. Check if the number 100 can be found in that array.");
        boolean isNumberInArray = false;
        for (int number : numbers) {
            if (number == 100) {
                isNumberInArray = true;
                break;
            }
        }
        System.out.println(isNumberInArray);
        System.out.println();

        System.out.println("9. Check if any number greater than 100 can be found in that array.");
        boolean isNumberGreater = false;
        for (int number : numbers) {
            if (number > 100) {
                isNumberGreater = true;
                break;
            }
        }
        System.out.println(isNumberGreater);
        System.out.println();

        System.out.println("10. Print the index of the first occurrence of 7 in the array, if 7 is not present, print -1.");
        isNumberInArray = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                System.out.println(i);
                isNumberInArray = true;
                break;
            }
        }
        if (!isNumberInArray) {
            System.out.println("-1");
        }
        System.out.println();

        System.out.println("11. Calculate the sum of the elements in the array.");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("12. Calculate the product of the elements in the array.");
        sum = 1;
        for (int number : numbers) {
            sum *= number;
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("13. Calculate the following sum:n1+n2+n3-n4+n5+n6+n7-n8...");
        int strangeSum = 0;
        counter = 1;
        for (int number : numbers) {
            if (counter % 4 == 0) {
                strangeSum -= number;
            } else {
                strangeSum += number;
            }
            counter++;
        }
        System.out.println(strangeSum);

    }
}
