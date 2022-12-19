package s6_OOP1_ClassesConstructorsInheritance.Exercise;

public class Main {
    public static void main(String[] args) {

        e030_SumCalculator calculator = new e030_SumCalculator();
//        calculator.setFirstNumber(45.00);
//        calculator.setSecondNumber(2.00);
//
//        System.out.println(calculator.getAdditionResult());
//        System.out.println(calculator.getSubtractionResult());
//        System.out.println(calculator.getMultiplicationResult());
//        System.out.println(calculator.getDivisionResult());


        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
