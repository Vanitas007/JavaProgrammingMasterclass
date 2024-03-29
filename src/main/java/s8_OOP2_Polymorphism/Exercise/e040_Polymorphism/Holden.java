package s8_OOP2_Polymorphism.Exercise.e040_Polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> is braking";
    }
}
