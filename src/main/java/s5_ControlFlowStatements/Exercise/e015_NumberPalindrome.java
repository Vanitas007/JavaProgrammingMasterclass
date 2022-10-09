package s5_ControlFlowStatements.Exercise;

public class e015_NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1223221));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;                 //IF do usunięcia jeśli:
        }
        int num = number;
        int reverse = 0;
        while (num > 0) {                 // jeśli while (number!=0)
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
            System.out.println("Reverse = " + reverse);
        }
        return reverse == number;
    }
}

// Lepsze rozwiązanie

//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int origin = number;
//        while(number != 0){
//            int lastDigit = number % 10;
//            reverse = (reverse * 10) + lastDigit;
//            number /= 10;
//        }
//        return origin == reverse;
//    }
//}
