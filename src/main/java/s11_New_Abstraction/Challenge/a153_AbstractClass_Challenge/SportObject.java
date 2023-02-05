package s11_New_Abstraction.Challenge.a153_AbstractClass_Challenge;

public class SportObject extends ProductForSale {


    public SportObject(String type, double price, String description) {

        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a fantastic equipment");
        System.out.printf("The price of the %s is $%6.2f %n", description, price);
    }
}
