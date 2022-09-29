import java.util.Scanner;

public class Bob {

    public static void main(String[] a2rgs) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ask a question and make sure to end with a question mark");
        String userInput = sc.nextLine();

        if(userInput.endsWith("?")){
            System.out.println("Sure.");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out dude");
        }else if(userInput.isEmpty()){
            System.out.println("fine be that way");
        }else{
            System.out.println("whatever");
        }



    }
}
