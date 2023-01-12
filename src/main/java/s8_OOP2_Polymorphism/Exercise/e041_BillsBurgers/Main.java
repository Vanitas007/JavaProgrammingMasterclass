package s8_OOP2_Polymorphism.Exercise.e041_BillsBurgers;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Classic Burger", "Beef",22.0, "Sesame" );
        hamburger.addHamburgerAddition1("chees", 2.5);
        System.out.println(hamburger.itemizeHamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println(deluxe.itemizeHamburger());
    }
}
