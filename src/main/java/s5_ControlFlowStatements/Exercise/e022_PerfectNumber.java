package s5_ControlFlowStatements.Exercise;

public class e022_PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number<1){
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

    //  5Head
//    public static boolean isPerfectNumber(int number) {
//
//        int sum = 0;
//        int increment = (number % 2 == 0) ? 1 : 2;
//
//        for (int i = 1; i <= number / 2; i += increment)
//            if (number % i == 0)
//                sum += i;
//
//        return sum == number && number > 1;
//    }
//}
