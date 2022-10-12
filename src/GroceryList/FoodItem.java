package GroceryList;
import java.util.ArrayList;


public class FoodItem {


    private String foodName;
    private Integer itemQuantity;

    public FoodItem(String foodName, Integer itemQuantity) {
        this.foodName = foodName;
        this.itemQuantity = itemQuantity;
    }

    public void addMore(int more){
        itemQuantity +=more;
    }
}
