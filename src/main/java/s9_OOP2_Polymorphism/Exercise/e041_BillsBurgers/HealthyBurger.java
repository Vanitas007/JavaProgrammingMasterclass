package s9_OOP2_Polymorphism.Exercise.e041_BillsBurgers;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Vegan Burger", meat, price, "oats bread");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        this.healthyExtra1Price += price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        this.healthyExtra2Price += price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("One order of Vegan Burger on oats bread with " +
                healthyExtra1Name + " " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
