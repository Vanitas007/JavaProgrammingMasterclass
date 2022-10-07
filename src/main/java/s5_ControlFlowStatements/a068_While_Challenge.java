package s5_ControlFlowStatements;

public class a068_While_Challenge {
    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count < 6; count++) {
            System.out.println("FOR value is " + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("While value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        /** challenges **/

        System.out.println(isEvenNumber(10));

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (evenNumberFound >= 5) {
                System.out.println("sum = " + sum);
                break;
            }
            evenNumberFound++;
            sum += number;
            System.out.println("Even number " + number);
        }
        System.out.println("total even numbers found = "+evenNumberFound);
    }
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {

        while (number % 2 == 0) {
            return true;
        }
        return false;


    }
}
