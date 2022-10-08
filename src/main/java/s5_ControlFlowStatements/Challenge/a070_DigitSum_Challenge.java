package s5_ControlFlowStatements.Challenge;

public class a070_DigitSum_Challenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

//        int sum = 0;
//        for (int n = number; n >= 10; ) {
//            sum += (n % 10);
//            n /= 10;
//            if (n < 10) {
//                sum += n;
//            }
//        }

        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}
