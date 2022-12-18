package s6_OOP1_ClassesConstructorsInheritance.a077_Classes;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        System.out.println("Model is "+porsche.getModel());



        Car car = new Car();
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+ car.getModel());
        car.describeCar();
    }
}
