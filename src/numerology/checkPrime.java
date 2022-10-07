package numerology;

import java.util.Scanner;

public class checkPrime {

    public static Integer checkIfPrime(){


        Scanner scannyscan = new Scanner(System.in);
        System.out.println("enter a number to check if it is prime");
        int checkIfPrime = scannyscan.nextInt();
        int counter = 0;
        for(int i = 2; i<checkIfPrime; i++){
            if(checkIfPrime%i == 0){
                System.out.println(i+" is proof is not a prime");
                counter+=1;
                System.out.println(checkIfPrime+ " is not a prime number");

            }else{

            }

        }
        if(counter == 0){
            System.out.println(checkIfPrime + " is a prime number");
        }else{
            System.out.println(checkIfPrime+" is not a prime number");
        }
        return null;
    }

}
