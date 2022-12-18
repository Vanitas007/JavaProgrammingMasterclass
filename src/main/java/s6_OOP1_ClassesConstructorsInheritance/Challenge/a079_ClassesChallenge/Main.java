package s6_OOP1_ClassesConstructorsInheritance.Challenge.a079_ClassesChallenge;

public class Main {
    public static void main(String[] args) {

        BankAccount santanderBankAccount = new BankAccount();
        santanderBankAccount.setAccountNumber("7896658745345");
        santanderBankAccount.setAccountBalance(500.35);
        santanderBankAccount.setCustomerName("Mark Twain");
        santanderBankAccount.setCustomerEmail("m.twain@gmail.com");
        santanderBankAccount.setCustomerPhone("515-234-567");

        santanderBankAccount.depositFunds(1500.10);
        santanderBankAccount.depositFunds(680.56);
        santanderBankAccount.withdrawMoney(2000);
        santanderBankAccount.withdrawMoney(1000.67);

    }
}
