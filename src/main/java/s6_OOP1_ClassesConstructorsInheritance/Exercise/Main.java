package s6_OOP1_ClassesConstructorsInheritance.Exercise;

public class Main {
    public static void main(String[] args) {
////    e030
//        e030_SumCalculator calculator = new e030_SumCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//  e031
        e031_Person person = new e031_Person();
        person.setFirstName("");// firstName is set to empty string
        person.setLastName("");// lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");// firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");// lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
