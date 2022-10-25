package ArraysList;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysListLecture {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(21);
        numbers.add(1,16);
        numbers.add(0,69);


        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.remove("medium");


        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Wojciech", "wojtekKowal");
        usernames.put("Piotr", "piotrNowak69");
        usernames.put("Piotrek", "piotrNowak69");
        usernames.put("Piotr", "piotrZielinski20");
        usernames.put("Marek", "marekCitko");
        System.out.println(usernames.get("Wojciech"));
        System.out.println(usernames.get("Wojciec"));
        System.out.println(usernames.get("Piotr"));
        System.out.println(usernames.getOrDefault("Mare","napierdoliles, kurwo jedno"));
        usernames.replace("Wojciech","wojtekKowal", "skurwisyn");
        System.out.println(usernames);



    }
}
