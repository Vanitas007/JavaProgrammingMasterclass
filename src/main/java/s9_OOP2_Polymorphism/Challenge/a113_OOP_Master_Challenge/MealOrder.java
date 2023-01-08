package s9_OOP2_Polymorphism.Challenge.a113_OOP_Master_Challenge;

public class MealOrder {

    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
    }

    public MealOrder(Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public void addToppings(){

    }

    public void setDringSize(Item drink) {
        this.drink = drink;
    }
}
