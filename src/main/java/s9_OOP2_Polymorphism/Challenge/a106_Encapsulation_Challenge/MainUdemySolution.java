package s9_OOP2_Polymorphism.Challenge.a106_Encapsulation_Challenge;

public class MainUdemySolution {
    public static void main(String[] args) {
        PrinterUdemySolution printerUdemySolution = new PrinterUdemySolution(50, true);
        System.out.println("Initial page count = "+printerUdemySolution.getPagesPrinted());

        int pagesPrinted = printerUdemySolution.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printerUdemySolution.getPagesPrinted());

        pagesPrinted = printerUdemySolution.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printerUdemySolution.getPagesPrinted());
    }
}
