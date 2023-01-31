package s11_InnerAndAbstractClassesAndInterfaces.a155_AbstractClasses;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
