package s6_OOP1_ClassesConstructorsInheritance.Challenge.a079_ClassesChallenge;

public class Main {
    public static void main(String[] args) {


        BankAccount santanderBankAccount = new BankAccount();
        santanderBankAccount.setAccountNumber("7896658745345");
        santanderBankAccount.setAccountBalance(500.35);
        santanderBankAccount.setCustomerName("Mark Twain");
        santanderBankAccount.setEmail("m.twain@gmail.com");
        santanderBankAccount.setPhoneNumber("515-234-567");

        santanderBankAccount.depositMoney(1000.10);
        santanderBankAccount.withdrawMoney(2000);
        santanderBankAccount.withdrawMoney(1000.67);

    }
}
