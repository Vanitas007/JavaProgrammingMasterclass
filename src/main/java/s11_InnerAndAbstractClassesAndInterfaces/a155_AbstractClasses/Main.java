package s11_InnerAndAbstractClassesAndInterfaces.a155_AbstractClasses;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneckt");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Emperor");
        pinguin.fly();
    }
}