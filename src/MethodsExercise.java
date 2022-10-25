import java.util.Scanner;

public class MethodsExercise {


    public static void main(String[] args) {
//        System.out.println(Addition(1, 2));
//        System.out.println(Subtraction(1, 2));
//        System.out.println(Multiplication(1, 2));
//        System.out.println(Division(1, 2));
//        System.out.println(Modulus(6,5));

//        System.out.println(getInteger(2,16));
//
//        factorialize();
//        rollTwoDice();
        HighLow();

    }

    public static int Addition(int numb1, int numb2) {
        return (numb1 + numb2);
    }

    public static int Subtraction(int numb1, int numb2) {
        return (numb1 - numb2);
    }

    public static int Multiplication(int numb1, int numb2) {
        return (numb1 * numb2);
    }

    public static int Division(int numb1, int numb2) {
        return (numb1 / numb2);
    }

    public static int Modulus(int numb1, int numb2) {
        return (numb1 % numb2);
    }

    public static String getInteger(int min, int max) {
        System.out.println("enter num from " + min + " to " + max);
        Scanner scanny = new Scanner(System.in);
        int userInput = scanny.nextInt();
        if (userInput <= 1 || userInput >= 10) {
            System.out.println("try again");
        }
        return userInput + "does fall within the range of";
    }

    public static void factorialize() {
        boolean keepGoing;
        do {
            System.out.println("Enter an integer from 1 to ten");
            Scanner scanndery = new Scanner(System.in);
            Integer factNum = scanndery.nextInt();
            if (factNum > 10 || factNum < 1) {
                System.out.println("you entered the wrong number");
            }
            System.out.println("This is the factorial for the number you entered:");
            System.out.print(factNum + "! = ");
            for (int i = factNum; i > 1; i--) {

                System.out.print(i + "x");
            }
            System.out.println("1");
            int factorial = 1;
            for (int i = 1; i < factNum; i++) {

                factorial *= i;
            }
            long factorial1 = factorial;
            System.out.println("this is what it equals: " + factorial1);

            System.out.println("do you wish to continue? enter y if yes");
            Scanner scannder = new Scanner(System.in);
            String answerInput = scannder.nextLine();
            if (answerInput.equals("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
                System.out.println("program has ended");
            }

//            return num+"";
        } while (keepGoing);

//        boolean keepGoing;
//        do {
//        System.out.println("enter number to factorialize ");
//        Scanner scan = new Scanner(System.in);
//        int userInput = scan.nextInt();
//        System.out.println("you want to factorialize "+userInput+" do you wish to continue y?");
//        String kepTrucking = scan.nextLine();
//        if(kepTrucking.equals("y")){
//            keepGoing = true;
//        }else{
//            keepGoing = false;
//        }
//            long fact= userInput;
//            for (int i = 1; i <userInput>; i++) {
//                System.out.println(i);
//            }
//        }while(keepGoing);

    }
    public static int getRandomInteger(int min, int max) {
        return (int) (Math.floor((Math.random() * (max - min))) + min);
    }
    public static void rollTwoDice() {
        Boolean keepRolling;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("how many sides do you want on your dice");
            int sidesDice = scan.nextInt();

            int dice1 =getRandomInteger(1,sidesDice);
            int dice2 =getRandomInteger(1,sidesDice);
            System.out.println("dice1 has rolled: "+dice1);
            System.out.println("dice2 has rolled: "+dice2);
            System.out.println("do you want to roll the dice? enter y if yes");
            String rollDice = scan.next();
            if(rollDice.equalsIgnoreCase("y")) {
                keepRolling = true;
            } else {
                keepRolling = false;
                System.out.println("goodbye");
            }
        } while(keepRolling);
    }

    public static void HighLow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from 1 to 100");
        int userInput = sc.nextInt();
        int guessNumber = getRandomInteger(1,100);
        if (userInput < 1 || userInput > 100) {
            System.out.println("wrong range");
        } else {
            if (userInput == guessNumber) {
                System.out.println("you are correct");
                System.out.println("the correct number was "+guessNumber);
            } else if (userInput > guessNumber) {
                System.out.println("too high ");
                System.out.println("the correct number was "+guessNumber);

            } else if (userInput < guessNumber) {
                System.out.println("too low ");
                System.out.println("the correct number was "+guessNumber);

            }
        }
    }


}