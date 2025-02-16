

import java.util.Scanner;

public class NameCard {



    public static void main(String[] args) {

        String name = "Arany Áron";
        byte age = 24;
        String email = "aron.arany@gmail.com";
        String phone = "+36301231223";
        String facebook = "facebook.com/aron.arany/";
        byte totalSize = 34;
        String line = "--------------------------------------------------";
        System.out.println();
        System.out.println(line);
        System.out.format("* Name         %-" + totalSize + "s*\n%s\n", name, line);
        System.out.format("* Age          %-" + totalSize + "d*\n%s\n", age, line);
        System.out.format("* Email        %-" + totalSize + "s*\n%s\n", email, line);
        System.out.format("* Phone        %-" + totalSize + "s*\n%s\n", phone, line);
        System.out.format("* Facebook     %-" + totalSize + "s*\n%s\n", facebook, line);
        System.out.println();

        //Konzolról bekérve:


        String[] nameCardDetails = readDataFromConsole();
        printFormattedNameCardDetails(nameCardDetails);
    }
    public static int findMaxStringLengthValuePlusAddTwo(String[] nameCardDetails) {
        int max = 0;
	        for (String detail : nameCardDetails) {
	            if (detail.length() > max) {
	                max = detail.length();
	            }
	        }
        return max+2;
	    }
    public static String[] readDataFromConsole() {
        String[] nameCardDetails = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        nameCardDetails[0] = scanner.nextLine();
        boolean isNumber = false;
        byte ageFromConsole = 0;
        do {
            try {
                isNumber = true;
                System.out.print("Please enter your age: ");
                ageFromConsole = Byte.parseByte(scanner.nextLine());
                if (ageFromConsole < 0 || ageFromConsole >= 120)
                    System.out.println("A kora nem lehet több 120 évnél és nem lehet kevesebb 0-nál!");

            } catch (NumberFormatException e) {
                System.out.println("Kérem számot adjon meg!");
                isNumber = false;
            }
        } while (ageFromConsole < 0 || ageFromConsole >= 120 || !isNumber);
        nameCardDetails[1] = String.valueOf(ageFromConsole);
        System.out.print("Please enter your email address: ");
        nameCardDetails[2] = scanner.nextLine();
        System.out.print("Please enter your phone number: ");
        nameCardDetails[3] = scanner.nextLine();
        System.out.print("Please enter your Facebook profile: ");
        nameCardDetails[4] = scanner.nextLine();
        System.out.println();

        return nameCardDetails;
    }

    public static void printFormattedNameCardDetails(String[] nameCardDetails) {
        String[] label = {"Name", "Age", "Email", "Phone", "Facebook"};
        int longestWordFromConsoleLength = findMaxStringLengthValuePlusAddTwo(nameCardDetails);
        String dividingLine = ".".repeat( longestWordFromConsoleLength+ 22);

        for (int i = 0; i < nameCardDetails.length; i++) {

            System.out.printf(" * %-15s %-" + longestWordFromConsoleLength + "s *\n%s\n", label[i], nameCardDetails[i],
                    dividingLine);
        }

    }
}

