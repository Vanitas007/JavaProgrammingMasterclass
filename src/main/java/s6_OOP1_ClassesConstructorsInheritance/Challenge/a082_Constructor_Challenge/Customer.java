package s6_OOP1_ClassesConstructorsInheritance.Challenge.a082_Constructor_Challenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this(12500, "nikt@nikt.pl");
        System.out.println("Second constructor - pusty, wszystkie dane stałe");
    }

    public Customer(double creditLimit, String email) {
        this("Rafał", creditLimit, email);
        System.out.println("Third constructor - samo imie stałe");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("First constructor - główny");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
