package s9_OOP2_Polymorphism.Exercise.e040_Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this(true, cylinders, name, 4);
    }

    public Car(boolean engine, int cylinders, String name, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

