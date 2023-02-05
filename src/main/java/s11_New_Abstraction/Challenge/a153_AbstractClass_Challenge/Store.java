package s11_New_Abstraction.Challenge.a153_AbstractClass_Challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {
}

public class Store {

    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {

        storeProduct.add(new SportObject("ball", 90, "Football ball - Fevernova"));
        storeProduct.add(new SportObject("shoes", 675, "Asics Novablast3"));
        storeProduct.add(new SportObject("cloths", 130, "Nike T-shirt"));
        storeProduct.add(new ToolsObject("hammer", 45, "Milwaukee 3kg"));
        storeProduct.add(new ToolsObject("knife", 455, "Guyto CarboNext 24cm"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 3);
        addItemToOrder(order2, 4, 2);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : storeProduct) {
            System.out.println("-".repeat(50));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProduct.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
