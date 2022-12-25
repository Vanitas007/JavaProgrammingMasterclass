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

////  e031
//        e031_Person person = new e031_Person();
//        person.setFirstName("");// firstName is set to empty string
//        person.setLastName("");// lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");// firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");// lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

////      e032
//        e032_WallArea wall = new e032_WallArea(5, 4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

////        e033
//        e033_Point first = new e033_Point(6, 5);
//        e033_Point second = new e033_Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance(second));
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        e033_Point point = new e033_Point();
//        System.out.println("distance()= " + point.distance(second));

//      e035
        e035_ComplexOperations one = new e035_ComplexOperations(1.0, 1.0);
        e035_ComplexOperations number = new e035_ComplexOperations(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
