abstract class Toppings implements FoodItem{
    private FoodItem foodItem;
    private double toppingCost;

    public Toppings(FoodItem foodItem, double toppingCost){
        this.foodItem = foodItem;
        this.toppingCost = toppingCost;
    }
    public double getCost(){
        return foodItem.getCost() + toppingCost;
    }


}
