package s6_OOP1_ClassesConstructorsInheritance.Challenge.a079_ClassesChallenge;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" + String.format("%.2f", depositAmount)
                + " made. New account balance is $"
                + String.format("%.2f", accountBalance));
    }

    public void withdrawMoney(double withrawalAmount) {

        if (accountBalance - withrawalAmount < 0) {
            System.out.println("You have not enough money! You only have $"
                    + String.format("%.2f", accountBalance) + " in your account.");
        } else {
            accountBalance -= withrawalAmount;
            System.out.println("Withrawal of $" + String.format("%.2f", withrawalAmount)
                    + " processed. Remaining balance = $"
                    + String.format("%.2f", accountBalance));
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
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

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

//              moja metoda
//    public double withdrawMoney(double takenMoney) {
//
//        if ((accountBalance - takenMoney) < 0) {
//            System.out.println("You have not enough money.");
//        } else {
//            accountBalance -= takenMoney;
//            System.out.println("New account balance after withdraw is " + String.format("%.2f", accountBalance));
//        }
//        return accountBalance;
//    }

}
