public class HotDogs implements FoodItem{
    private double basePrice;

    public HotDogs(double basePrice){
        this.basePrice = basePrice;
    }
    public double getCost(){
        return basePrice;
    }
}

