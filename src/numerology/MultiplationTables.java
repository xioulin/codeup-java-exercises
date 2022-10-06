package numerology;

import java.util.Scanner;

public class MultiplationTables {

    public static void main(String[] args) {

        Scanner scanScan = new Scanner(System.in);
        int userInteger;
        int userInt1;
        System.out.println("what number would you like mult tables for?");
        userInteger = scanScan.nextInt();
        System.out.println("how many multiplation lines do you want");
        userInt1 = scanScan.nextInt();
        for(int i =1; i<=userInt1; i++){
            System.out.println(userInteger+" times "+i+" is equal to "+i*userInteger);
        }
    }
}
