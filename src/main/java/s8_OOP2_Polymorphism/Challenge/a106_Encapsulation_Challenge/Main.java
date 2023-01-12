package s8_OOP2_Polymorphism.Challenge.a106_Encapsulation_Challenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(30, false);
        printer.addToner(20);
        printer.printPages(15);
        printer.printPages(20);
    }
}

