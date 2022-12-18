package s6_OOP1_ClassesConstructorsInheritance.Challenge.a079_ClassesChallenge;

public class BankAccount {

    private String accountNumber = "78987456415";
    private double accountBalance = 12300.50;
    private String customerName = "Matti Hautamaki";
    private String email = "m.Hautamaki@gmail.com";
    private String phoneNumber = "123-456-789";

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositMoney(double depositedMoney) {
        this.accountBalance = accountBalance + depositedMoney;
        System.out.println("New account balance after deposit is " + String.format("%.2f", accountBalance));
        return accountBalance;
    }

    public double withdrawMoney(double takenMoney) {

        if ((accountBalance - takenMoney) < 0) {
            System.out.println("You have not enough money.");
        } else {
            accountBalance -= takenMoney;
            System.out.println("New account balance after withdraw is " + String.format("%.2f", accountBalance));
        }
        return accountBalance;
    }

}
