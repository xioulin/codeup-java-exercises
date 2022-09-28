import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        String name = "Wojtek";
//        String sign = "Kurwa Mac";
        int pozycja = 69;
        float percent = 91.99F;
        System.out.format("Czesc,jestem %s chyba jeszcze nie znasz mnie Ulobiona pozycja to %d Ale o co kurwa chodzi Ile zajebalem? No chyba az %.2f%% razy.  nie wiem", name, pozycja,percent);
//        System.out.print("Czesc jestem"+name+"\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme shelter:");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        System.out.println("Czego chces kurwo jedno?");
        int ulubionyNumer = scanner.nextInt();
        System.out.println(ulubionyNumer);


        scanner.nextLine();
        System.out.println("Jaki jest twoj ulubiony kolor?");
        String ulubionyKolor = scanner.nextLine();
        System.out.println("Twoj ulubiony kolor jest "+ ulubionyKolor);
    }
}
