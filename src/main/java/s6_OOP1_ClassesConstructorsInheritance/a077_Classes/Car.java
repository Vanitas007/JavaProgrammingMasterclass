package s6_OOP1_ClassesConstructorsInheritance.a077_Classes;

public class Car {

//    private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String colour;
//
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if (validModel.equals("carrera") || validModel.equals("commodore")) {
//            this.model = model;
//        } else {
//            this.model = "Unknown";
//        }
//    }
//
//    public String getModel() {
//        return this.model;
//    }

    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                colour + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}