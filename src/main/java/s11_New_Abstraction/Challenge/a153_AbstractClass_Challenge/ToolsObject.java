package s11_New_Abstraction.Challenge.a153_AbstractClass_Challenge;

public class ToolsObject extends ProductForSale {


    public ToolsObject(String type, double price, String description) {

        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a reliable equipment");
        System.out.printf("The price of the %s is $%6.2f %n", description, price);
    }
}
