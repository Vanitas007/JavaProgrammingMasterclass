package s9_OOP2_Polymorphism.Challenge.a111_Polymorphism_Challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){

    }
    public void drive(){

    }
    protected void runEngine(){

    }

    class GasPoweredCar extends Car{
        public GasPoweredCar(String description) {
            super(description);
        }
        private double accelerate;
    }

    class ElectricCar extends Car{
        public ElectricCar(String description) {
            super(description);
        }
        private double accelerate;
    }

    class HybridCar extends Car{
        public HybridCar(String description) {
            super(description);
        }
        private double accelerate;
    }




}
