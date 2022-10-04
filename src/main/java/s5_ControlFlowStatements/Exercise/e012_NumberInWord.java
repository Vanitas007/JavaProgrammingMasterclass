package s5_ControlFlowStatements.Exercise;

public class e012_NumberInWord {
    public static void main(String[] args) {

        printNumberInWord(6);
    }

    public static void printNumberInWord(int number) {

        String[] wholeNumber = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (number >= 0 && number < wholeNumber.length) {
            System.out.println(wholeNumber[number]);
        } else {
            System.out.println("OTHER");
        }
    }
}

//    public static void printNumberInWord(int number) {
//
//        switch (number){
//            case 0:
//                System.out.println("ZERO");
//                break;
//            case 1:
//                System.out.println("ONE");
//                break;
//            case 2:
//                System.out.println("TWO");
//                break;
//            case 3:
//                System.out.println("THREE");
//                break;
//            case 4:
//                System.out.println("FOUR");
//                break;
//            case 5:
//                System.out.println("FIVE");
//                break;
//            case 6:
//                System.out.println("SIX");
//                break;
//            case 7:
//                System.out.println("SEVEN");
//                break;
//            case 8:
//                System.out.println("EIGHT");
//                break;
//            case 9:
//                System.out.println("NINE");
//                break;
//            default:
//                System.out.println("OTHER");
//                break;
//        }
//    }
//}
