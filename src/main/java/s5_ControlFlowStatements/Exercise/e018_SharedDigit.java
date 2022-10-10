package s5_ControlFlowStatements.Exercise;

public class e018_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(95, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10) || (num2 < 10) || (num1 > 99) || (num2 > 99)) {
            return false;
        }
        int lastDigit1 = 0;
        int lastDigit2 = 0;
        while (num1 >= 10) {
            lastDigit1 = num1 % 10;
            num1 /= 10;
            lastDigit2 = num2 % 10;
            num2 /= 10;
        }
        return lastDigit1 == lastDigit2 || lastDigit1 == num2 || num1 == num2 || num1 == lastDigit2;
    }
}

// Starczy tyle
//    public static boolean hasSharedDigit(int num1, int num2) {
//
//        if ((num1 < 10) || (num2 < 10) || (num1 > 99) || (num2 > 99)) {
//            return false;
//        } else {
//            int lastDigit1 = num1 % 10;
//            num1 /= 10;
//            int lastDigit2 = num2 % 10;
//            num2 /= 10;
//            return lastDigit1 == lastDigit2 || lastDigit1 == num2 || num1 == num2 || num1 == lastDigit2;
//        }
//    }
//}

