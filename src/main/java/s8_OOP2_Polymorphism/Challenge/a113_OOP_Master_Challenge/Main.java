package s8_OOP2_Polymorphism.Challenge.a113_OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("coke", "drink", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("avocado", "Topping", 1.5);
//        avocado.printItem();


//        Burger burger = new Burger("regular", 4);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDringSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDringSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVODADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDringSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
