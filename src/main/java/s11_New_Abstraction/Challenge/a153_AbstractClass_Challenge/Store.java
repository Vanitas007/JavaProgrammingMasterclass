package s11_New_Abstraction.Challenge.a153_AbstractClass_Challenge;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {

        storeProduct.add(new SportObject("ball", 90, "Football ball - Fevernova"));
        storeProduct.add(new SportObject("shoes", 675, "Asics Novablast3"));
        storeProduct.add(new SportObject("cloths", 130, "Nike T-shirt"));
        listProducts();
    }

    public static void listProducts() {
        for (var item:storeProduct){
            System.out.println("-".repeat(50));
            item.showDetails();
        }
    }
}
