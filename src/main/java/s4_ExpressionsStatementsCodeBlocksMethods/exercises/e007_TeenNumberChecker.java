package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

public class e007_TeenNumberChecker {

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
        return (isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree));
    }

    public static boolean isTeen(int teen) {
        return (teen >= 13) && (teen <= 19);
    }
}


//    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
//        return (numberOne >= 13 && numberOne <= 19) || (numberTwo >= 13 && numberTwo <= 19) ||
//                (numberThree >= 13 && numberThree <= 19);
//    } zanim pojawiła się 2ga metoda xD