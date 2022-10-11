package s5_ControlFlowStatements.Exercise;

public class e019_LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22, 22, 71));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

//        if (!isValid(num1) || (!isValid(num2)) || (!isValid(num3))) {
//            return false;
//        }
//        int lastOfNum1 = num1 % 10;
//        int lastOfNum2 = num2 % 10;
//        int lastOfNum3 = num3 % 10;
//        return (lastOfNum1 == lastOfNum2) || (lastOfNum1 == lastOfNum3 || (lastOfNum2 == lastOfNum3));
//    }

        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int lastOfNum1 = num1 % 10;
            int lastOfNum2 = num2 % 10;
            int lastOfNum3 = num3 % 10;
            return (lastOfNum1 == lastOfNum2) || (lastOfNum1 == lastOfNum3 || (lastOfNum2 == lastOfNum3));
        }
        return false;
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
