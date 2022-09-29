import java.util.Scanner;

public class Bob {

    public static void main(String[] a2rgs) {

        boolean conversation =false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ask a question and make sure to end with a question mark");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out dude");
            } else if (userInput.isEmpty()) {
                System.out.println("fine be that way");
            } else {
                System.out.println("whatever");
            }
            System.out.println("Would you like to keep talking to Bob? [y/n]");
            String userCheck = sc.nextLine();
            if(userInput.equalsIgnoreCase("y")){
                conversation = true;
            }else if(userInput.equalsIgnoreCase("n")){
                 conversation = false;
            }
        }while(conversation == true);


    }
}
