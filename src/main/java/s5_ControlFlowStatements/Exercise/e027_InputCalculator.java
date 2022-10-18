package s5_ControlFlowStatements.Exercise;

import java.util.Scanner;

public class e027_InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        int numberEntered;
        double sum = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                numberEntered = scanner.nextInt();
                sum += numberEntered;
            } else {
//                if (i == 0) {         Wcześniej krzyczało o dzielenie przez 0 :/ dlatego dodałem
//                    i = 1;
//                }
                avg = sum / i;
                avg = Math.round(avg);
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + (int) sum + " AVG = " + (int) avg);
        scanner.close();
    }
}

//    Z neta
//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        while(scanner.hasNextInt()){
//            sum += scanner.nextInt();
//            count++;
//        }
//        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
//        scanner.close();
//    }
//}