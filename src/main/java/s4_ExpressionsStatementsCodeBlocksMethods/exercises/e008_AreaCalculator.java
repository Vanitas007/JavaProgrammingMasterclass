package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

// Napisane

//public class e008_AreaCalculator {
//
//    public static double area(double radius) {
//        if (radius < 0) {
//            return -1.0;
//        }
//        return radius * radius * Math.PI;
//    }
//
//    public static double area(double x, double y) {
//        if (x < 0 || y < 0) {
//            return -1.0;
//        }
//        return x * y;
//    }
//}


// Fajniejsze rozwiązanie
public class e008_AreaCalculator {
    public static double area(double radius) {
        return (radius < 0) ? -1 : Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}