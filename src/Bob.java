import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ask a question and make sure to end with a question mark");
        String userInput = sc.next();

        if(userInput.endsWith("?")){
            System.out.println("Sure.");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out dude");
        }else if(userInput.endsWith(" ")){
            System.out.println("fine be that way");
        }else{
            System.out.println("whatever");
        }



    }
}
