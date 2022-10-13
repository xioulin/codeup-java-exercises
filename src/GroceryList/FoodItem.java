package GroceryList;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class FoodItem {


    private String foodName;
    private ArrayList<Integer> itemQuantity;
    public FoodItem(String newFoodItem,String itemQuantity){
       this(newFoodItem, new ArrayList<Integer>());
    }

    public FoodItem(String newfoodName, ArrayList<Integer> newitemQuantity) {
        this.foodName = newfoodName;
        this.itemQuantity = newitemQuantity;
    }

    public String addFoodName() {
        return foodName;
    }

    public void addItemQuantity(int quantity){
         itemQuantity.add(quantity);
    }
}
