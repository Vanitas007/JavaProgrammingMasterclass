package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

public class e005_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        one = (int) (one * 1000);
        two = (int) (two * 1000);
        return one == two;
    }
}