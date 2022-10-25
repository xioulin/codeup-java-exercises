package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {


        //create new student classes with student name and initialized grade
        Student1 joshua = new Student1("joshua", "44");
        //adding subsequent grades
        joshua.addGrade(94);
        joshua.addGrade(65);
        joshua.addGrade(78);
        Student1 elijah = new Student1("elijah", "55");
        elijah.addGrade(77);
        elijah.addGrade(56);
        elijah.addGrade(86);
        Student1 samuel = new Student1("samuel", "69");
        samuel.addGrade(12);
        samuel.addGrade(76);
        samuel.addGrade(57);
        Student1 jezebel = new Student1("jezebel", "78");
        jezebel.addGrade(88);
        jezebel.addGrade(96);
        jezebel.addGrade(92);
        //create hashmap for student key value pairing. pairing github usernames with student class objects
        HashMap<String, Student1> students = new HashMap<>();
        students.put("joshJericho", joshua); // e.x. key is github username is "joshLover", value is student object
        students.put("elijahProphet6", elijah);
        students.put("lelekProrok", samuel);
        students.put("biblicalchick44", jezebel);

        boolean keepGoing;
        do {
            Scanner scannyscanscan = new Scanner(System.in);
            System.out.println("would you like to continue? type yes if so");
            String continuer = scannyscanscan.nextLine();
            if (continuer.contains("yes")) {
                keepGoing=true;
            }else{
                keepGoing=false;
            }
            //for loop to print out the key values aka. the git usernames
            for (int i = 0; i < students.size(); i++) {
                System.out.print("  |  " + students.keySet().toArray()[i]);
            }
            // scanner object created to get user input
            System.out.print("\nSelect one of the above user names to learn more:");
            String userInput = scannyscanscan.nextLine();
            //takes user input and matches against the key objects aka the git usernames
            if (students.containsKey(userInput)) { // checking if the user input matches a user name
                students.get(userInput);
                System.out.println(userInput + "'s name is " + students.get(userInput).getName()); // prints out name associated with student object
                System.out.println(userInput + "'s grade point average is " + students.get(userInput).getGradeAverage()); // uses gradeAverage method to return grade
            } else {
                System.out.println("you did not spell the user name correctly");
            }
            System.out.println("would you like to continue? type yes if so");
            continuer = scannyscanscan.nextLine();
            if (continuer.contains("yes")) {
                keepGoing=true;
            }else{
                keepGoing=false;
                System.out.println("program has ended, goodbye");
            }
        }while(keepGoing);

    }


}
