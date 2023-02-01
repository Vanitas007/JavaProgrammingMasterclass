package s11_InnerAndAbstractClassesAndInterfaces.a155_AbstractClasses;

public class Pinguin extends Bird {

    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
