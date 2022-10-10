package s5_ControlFlowStatements.Exercise;

public class e017_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(552));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit%2==0){
                sum+=digit;
            }
            number/=10;
        }
        return sum;
    }
}
