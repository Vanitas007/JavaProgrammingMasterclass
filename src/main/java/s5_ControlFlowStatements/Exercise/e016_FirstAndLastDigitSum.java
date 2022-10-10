package s5_ControlFlowStatements.Exercise;

public class e016_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(157));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return sum += number;
    }
}