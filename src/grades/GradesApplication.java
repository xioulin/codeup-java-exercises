package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student joshua = new Student("joshua","44");
        joshua.addGrade(94);
        joshua.addGrade(65);
        joshua.addGrade(78);
        Student elijah = new Student("elijah","55");
        elijah.addGrade(77);
        elijah.addGrade(56);
        elijah.addGrade(86);
        Student samuel = new Student("samuel","69");
        samuel.addGrade(12);
        samuel.addGrade(76);
        samuel.addGrade(57);
        Student jezebel = new Student("jezebel","78");
        jezebel.addGrade(88);
        jezebel.addGrade(96);
        jezebel.addGrade(92);
        HashMap<String,Student> students = new HashMap<>();
        students.put("joshLover",joshua);
        students.put("elijahProphet666",elijah);
        students.put("lelekProrok",samuel);
        students.put("biblicalchick44",jezebel);


        //returns key from key value
//        Object gitUserValue = students.get(gitUserName); // returns value from kay value pair
//        System.out.println(students);
//        System.out.println(gitUserName);
//        System.out.println(gitUserValue);

        for (int i = 0; i < students.size(); i++) {
            System.out.print("  |  "+students.keySet().toArray()[i]);
        }
//        ArrayList<String> gitUserNames = new ArrayList<>();
//        for (int i = 0; i < students.size(); i++) {
//            gitUserNames.add((String) students.keySet().toArray()[i]);
//        }
//        System.out.println(gitUserNames);
        Scanner scannyscanscan = new Scanner(System.in);
        System.out.print("\nSelect one of the above user names to learn more:");
        String userInput = scannyscanscan.nextLine();
            if (students.containsKey(userInput)) {
                students.get(userInput);
                System.out.println(userInput+"'s name is "+students.get(userInput).getName());
                System.out.println(userInput+"'s grade point average is "+students.get(userInput).getGradeAverage());
            } else {
                System.out.println("you did not spell the user name correctly");
            }
        System.out.println("would you like to keep running? type yes if so");
            String continuer = scannyscanscan.nextLine();
            if(continuer = "y"){

            }else{
                System.out.println("okay, program ended");
            }



    }




}
