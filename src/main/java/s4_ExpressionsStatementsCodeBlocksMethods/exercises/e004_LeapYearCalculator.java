package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

public class e004_LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        double divisibleBy4 = year % 4;
        double divisibleBy100 = year % 100;
        double divisibleBy400 = year % 400;

        System.out.println(divisibleBy400);

        return year >= 1 && year <= 9999 && (divisibleBy4 == 0) && ((divisibleBy100 != 0) || (divisibleBy400 == 0));
    }
}


// tak pisałem, i uproszczone z automatu IntelliJ

//public class e004_LeapYearCalculator {
//
//    public static boolean isLeapYear(int year) {
//
//        double divisibleBy4 = year % 4;
//        double divisibleBy100 = year % 100;
//        double divisibleBy400 = year % 400;
//
//        System.out.println(divisible400);
//
//        if (year >= 1 && year <= 9999 && (divisibleBy4 == 0) && ((divisibleBy100 != 0) || (divisibleBy400 == 0))) {
//            return true;
//        } else{
//            return false;
//        }
//    }
//}




