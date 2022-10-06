package s5_ControlFlowStatements.Challenge;

public class a067_Sum3and5challenge {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i + " is divided by 3 and 5");
                sum += i;
                count++;
            }
            if (count == 5) {
                System.out.println("Sum of numbers divided by 3 and 5 is " + sum);
                break;
            }
        }
        // In tutorial System.out.println("Sum of numbers divided by 3 and 5 is " + sum); was here
    }
}

