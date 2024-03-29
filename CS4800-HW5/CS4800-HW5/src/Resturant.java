public class Resturant {
    public static void main(String[] args){
        FoodItem burger = new Burger(5.0);
        FoodItem hotDog = new HotDogs(4.0);
        FoodItem fries = new Fries(3.0);

        FoodItem cheeseBurger = new Cheese(burger);
        FoodItem PicklesCheeseBurger = new Pickles(cheeseBurger);
        FoodItem ketchupAndMustardFries = new KetchupAndMustard(fries);
        FoodItem animalStyleFries = new Onions(ketchupAndMustardFries);
        FoodItem ketchupAndMustardhotDog = new KetchupAndMustard(hotDog);
        FoodItem extraMeatBurger = new ExtraMeat(burger);

        Order order = new Order();
        order.addItem(PicklesCheeseBurger);
        order.addItem(animalStyleFries);
        order.addItem(ketchupAndMustardhotDog);
        order.addItem(extraMeatBurger);

        double totalCost = order.calculateTotalCost();
        System.out.println("Base total cost: $" + totalCost);

        Loyalty loyaltyStatus = new Loyalty();
        int loyaltyLevel = 4;
        double discountedCost = loyaltyStatus.applyDiscount(totalCost, loyaltyLevel);
        System.out.println("Total cost with loyalty status " + loyaltyLevel + " discount: $" + discountedCost);
    }
}
