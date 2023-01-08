package s9_OOP2_Polymorphism.Challenge.a113_OOP_Master_Challenge;

public class MealOrder {

    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4);
        this.drink = new Item("drink", drinkType, 1);
        this.side = new Item("side", sideType, 1.5);
    }

    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE",getTotalPrice());
    }


    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDringSize(String size) {
        drink.setSize(size);
    }
}
