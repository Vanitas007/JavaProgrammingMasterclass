package s9_OOP2_Polymorphism.Challenge.a113_OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("coke", "drink", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("avocado", "Topping", 1.5);
        avocado.printItem();
    }
}
