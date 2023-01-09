package s9_OOP2_Polymorphism.Exercise.e041_BillsBurgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.10, "Big Black Bread");
        this.addHamburgerAddition1("drink",0);
        this.addHamburgerAddition2("chips", 0);
        this.addHamburgerAddition3("beef", 0);
        this.addHamburgerAddition4("chess",0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}
