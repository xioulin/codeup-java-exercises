import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {



    public static void main(String[] args){


        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n",pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer:");
//        int entInteger = scanner.nextInt();
//        System.out.println("Congratulations, you have selected the integer:"+entInteger);
//
//        scanner.nextLine();
//        System.out.println("Please enter exactly three words");
//        String firstWordInput= scanner.nextLine();
//        String secondWordInput= scanner.nextLine();
//        String thirdordInput= scanner.nextLine();
//        System.out.format(firstWordInput,secondWordInput,thirdordInput);

//        System.out.println("enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

//        System.out.println("Please enter the room length");
//        int

        System.out.println("Enter length of room");
        String lengthRoom = scanner.nextLine();
        int length = Integer.parseInt(lengthRoom, 10);
        System.out.print("The length is: "+length);
        scanner.nextLine();
        System.out.println("Enter width of room");
        int width = scanner.nextInt();
        System.out.println("The width of the room is: "+width);
        int perimeter = 2* (length+width);
        System.out.println("the perimeter of hte room is " +perimeter);
        int area = length*width;
        System.out.println("The area of the room is "+area);


    }

}
