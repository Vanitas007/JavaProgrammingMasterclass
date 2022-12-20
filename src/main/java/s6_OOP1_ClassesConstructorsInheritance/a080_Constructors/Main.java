package s6_OOP1_ClassesConstructorsInheritance.a080_Constructors;

public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account("7896658745345", 500,
//                "Mark Twain", "m.twain@gmail.com",
//                "515-234-567");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("7896658745345");
//        bobsAccount.setBalance(500.35);
//        bobsAccount.setCustomerName("Mark Twain");
//        bobsAccount.setCustomerEmail("m.twain@gmail.com");
//        bobsAccount.setCustomerPhone("515-234-567");

        bobsAccount.depositFunds(1500.10);
        bobsAccount.depositFunds(680.56);
        bobsAccount.withdrawMoney(2000);
        bobsAccount.withdrawMoney(1000.67);

        Account timsAccount = new Account("Tim",
                "tim@gmail.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());
    }
}
