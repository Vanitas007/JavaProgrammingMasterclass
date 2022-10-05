package s5_ControlFlowStatements;

public class a065_For_Challenge {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");

        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("*********************");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println(isPrime(15));

        // Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit

        int number = 10;
        for (int i = 0; i < 3; ) {
            if (isPrime(number)) {
                System.out.println(i + 1 + ". Prime number = " + number);
                i++;
            }
            number++;
        }

        // rozwiązanie z kursu
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {       // (long)Math.sqrt(n) (mniej pętli niż) == n/2
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

