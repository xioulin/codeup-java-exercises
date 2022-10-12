import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        //while loop practice
//        int i = 5;
//        while (i <= 15){
//            i++;
//            System.out.print(i-1+" ");
//        }
//       // do while loop practice, start from 0 and count to 100 by twos.
//        i=0;
//        do{
//            i+=2;
//            System.out.println(i);
//        }while(i <100);
////        //do while loop, start from 100 go down by 5s to -10.
//        i=100;
//        do{
//            i -=5;
//            System.out.println(i);
//        }while(i>-9);
        //print out a number getting squared each time starting with two
//        long j=2;
//        do{
//            j = j*j;
//            System.out.println(j);
//        }while(j<=10000);
//        // refactor the above using for loops, starting with print out from 5 to 15
//        for(i=5; i<=15; i++){
//            System.out.print(i+" ");
//        }
//        //print out from 0 to 100 by twos
//        for(i=0;i<=100;i+=2){
//            System.out.println(i);
//        }
//        //print out from 100 down to -10 by 5s
//        for(i=100;i>-11;i-=5){
//            System.out.println(i);
//        }
//        for(j=2;j<100000;j= j*j){
//            System.out.println(j);
//        }


//the fizz buzz exercise. every multiple of three prints out Fizz, every mult of 5 prints Buzz, if both, prints FizzBuzz
//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Table of Powers program
//        boolean continueProgram;
//        Scanner scannery = new Scanner(System.in);
//        do {
//            System.out.print("What number would you like to go up to?: ");
//            int userInt = scannery.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------   -------   ------");
//            for (int z = 1; z <= userInt; z++) {
//                System.out.println(z + "      |   " + z * z + "     |   " + z * z * z);
//            }
//            System.out.println("Would you like to continue? y/n");
//            Scanner scanny = new Scanner(System.in);
//            String contUser = scanny.nextLine();
//            if(contUser.equals("y")){
//                continueProgram = true;
//            }else{
//                continueProgram = false;
//                System.out.println("program terminated, goodbye");
//            }
//        }while(continueProgram);


        Scanner scannernavia = new Scanner(System.in);
        Boolean keepGoing;
        do {
            System.out.println("do you wish to continue? enter y if yes");
            String continuing = scannernavia.nextLine();
            if(continuing.equals("y")){
                keepGoing=true;
            }else{
                keepGoing=false;
            }
            System.out.println("Please enter a number from 0 to 100: ");
            int userInt = scannernavia.nextInt();
            for(int z=0;z<userInt;z++){
                if (userInt < 0 || userInt > 100) {
                    System.out.println("out of range, try again");
                } else if (userInt < 100 && userInt >= 88) {
                    System.out.println("A");
                } else if (userInt < 88 && userInt >= 80) {
                    System.out.println("B");
                } else if (userInt < 80 && userInt >= 67) {
                    System.out.println("C");
                } else if (userInt < 67 && userInt >= 60) {
                    System.out.println("D");
                } else if (userInt < 60 && userInt >= 0) {
                    System.out.println("F, you have failed");
                }
                System.out.println("do you wish to continue? enter y if yes");




            }



        }while(keepGoing);


    }



}
