package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        return scanner.nextBoolean();
    }

    public static int getInt(int min, int max) {
        System.out.printf("give a number between %s and %n", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            System.out.println("wrong input");
        } else {
            getInt(min, max);
        }
        return userNum;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("give a number between %s and %n", min, max);
        double userNumb = scanner.nextDouble();
        if (userNumb < min || userNumb > max) {
            System.out.println("wrong input");
        } else {
            getDouble(min, max);
        }
        return userNumb;

    }

}

