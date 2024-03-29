import java.util.List;
import java.util.ArrayList;
public class Order {
    private List<FoodItem> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item){
        items.add(item);
    }

    public double calculateTotalCost(){
        double totalCost = 0;
        for (FoodItem item : items){
            totalCost += item.getCost();
        }
        return totalCost;
    }

}
