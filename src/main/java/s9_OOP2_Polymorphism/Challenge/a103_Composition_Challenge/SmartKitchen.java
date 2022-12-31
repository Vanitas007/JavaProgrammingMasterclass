package s9_OOP2_Polymorphism.Challenge.a103_Composition_Challenge;

public class SmartKitchen {

    private Refrigenerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;


    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigenerator();
        dishWasher = new DishWasher();
    }

//    public Refrigenerator getIceBox() {
//        return iceBox;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public CoffeeMaker getBrewMaster() {
//        return brewMaster;
//    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffe");
            hasWorkToDo = false;
        }
    }
}

class Refrigenerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}