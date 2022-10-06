package numerology;

import java.util.Scanner;

public class checkPrime {

    public static Integer checkIfPrime(){


        Scanner scannyscan = new Scanner(System.in);
        System.out.println("enter a number to check if it is prime");
        int checkIfPrime = scannyscan.nextInt();
        for(int i = 2; i<checkIfPrime; i++){
            if(checkIfPrime%i == 0){
                System.out.println(i+" is proof this is not a prime");
            }else{

            }
        }

        return null;
    }

}
