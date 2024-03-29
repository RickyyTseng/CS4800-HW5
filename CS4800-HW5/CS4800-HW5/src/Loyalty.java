public class Loyalty {
    public double applyDiscount(double totalCost, int loyaltyStatus){
        switch(loyaltyStatus){
            case 1:
                return totalCost * 0.9;
            case 2:
                return totalCost * 0.8;
            case 3:
                return totalCost * 0.7;
            case 4:
                return totalCost * 0.5;
            default:
                return totalCost;
        }
    }
}
