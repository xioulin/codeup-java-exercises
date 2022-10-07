import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MethodsExercise {


    public static void main(String[] args) {


        System.out.println(Addition(1, 2));
//        System.out.println(Subtraction(1, 2));
//        System.out.println(Multiplication(1, 2));
//        System.out.println(Division(1, 1));
//        System.out.println(Modulus(14, 8));
//        System.out.println(getInteger(1,10));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("how many sides for dice");
//
//        int sides = scanner
//        HighLow(100);
    }

    public static int Addition(int numb1, int numb2) {
        return (numb1 + numb2);
    }

//    public static int Subtraction(int numb1, int numb2) {
//        return (numb1 - numb2);
//    }
//
//    public static int Multiplication(int numb1, int numb2) {
//        return (numb1 * numb2);
//    }
//
//    public static int Division(int numb1, int numb2) {
//        return (numb1 / numb2);
//    }
//
//    public static int Modulus(int numb1, int numb2) {
//        return (numb1 % numb2);
//    }

//    public static int getInteger(int num1, int num2) {
//        System.out.println("enter num from 1 to 10");
//        Scanner sc = new Scanner(System.in);
//
//        int userInput1 = sc.nextInt();
//        if(userInput1 <1){
//            System.out.println("try again fucker");
//        }else{
//            System.out.println("good job guyt");
//        }
//        int userInput2= sc.nextInt();
//        if(userInput1 >10){
//            System.out.println("try again fucker");
//        }else{
//            System.out.println("good job guyt");
//        }
//    }

//    public static int factorial(int num){
//        System.out.println("enter number to factorialize ");
//        Scanner scan = new Scanner(System.in);
//        int userInput = scan.nextInt();
//        int fact = 1;
//        for(int i=0; i<userInput; i+=1){
//            return i*fact;
//        }
//
//    }

        public static void HighLow(int range){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number from 1 to 100");
            int userInput = sc.nextInt();
            int guessNumber = (int)Math.floor(Math.random()*range+1);
            if(userInput < 1 || userInput > 100){
                System.out.println("wrong range fucker");
            }
            else{
                if(userInput == guessNumber){
                    System.out.println("you are correct");
                }else if(userInput > guessNumber){
                    System.out.println("too high fucker");
                }else if(userInput< guessNumber){
                    System.out.println("too low fucker");
                }
            }
        }



}