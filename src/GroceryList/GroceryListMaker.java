package GroceryList;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class GroceryListMaker {


    public static void main(String[] args) {
        //boolean keepGoing to have the program loop through whether the user wants to continue or not
        boolean keepGoing;
        //prompt user if they want to make a grocery list
        do {
            System.out.println("Would you like to make a grocery list? enter y if yes");
            Scanner scanny = new Scanner(System.in);
            String userInput = scanny.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
                System.out.println("program has ended, fare thee well");
            }
            System.out.println("Would you like to enter a new item, enter y if yes");
            String userInput1 = scanny.nextLine();
            if (userInput1.equalsIgnoreCase("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
                System.out.println("program has ended, fare thee well");
            }

            ArrayList<String> groceryCategories = new ArrayList<>();
            groceryCategories.add("frozen");
            groceryCategories.add("produce");
            groceryCategories.add("meat");
            groceryCategories.add("canned");
            groceryCategories.add("bakedGoods");
            groceryCategories.add("dairy");
            //sorts arraylist by alphabetical order
            Collections.sort(groceryCategories);
            for (int i = 0; i < groceryCategories.size(); i++) {
                System.out.println((i + 1) + "." + groceryCategories.get(i));
            }
            System.out.println("pick a category, select 1-6;");

            HashMap<FoodItem,String> groceryList = new HashMap<>();
            String productCat = scanny.nextLine();

            if (productCat.contains("1")) {
//                groceryList.add(productCat);
                System.out.println("you have selected bakedGoods");
                System.out.println("what food item do you want");

            }
            String productName = scanny.nextLine();
            System.out.println("you have selected "+ productName);

        }while (keepGoing);

    }
}
