package s6_OOP1_ClassesConstructorsInheritance.Challenge.a082_Constructor_Challenge;

public class Main {
    public static void main(String[] args) {


        Customer customer = new Customer("Tim", 1000,
                "tim@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println();

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
        System.out.println();

        Customer thirdCustomer = new Customer(7250, "rafi@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
