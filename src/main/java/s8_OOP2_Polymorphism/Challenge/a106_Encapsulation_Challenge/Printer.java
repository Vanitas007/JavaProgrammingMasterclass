package s8_OOP2_Polymorphism.Challenge.a106_Encapsulation_Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(int pagesPrinted, boolean duplex) {
        this(50, pagesPrinted, duplex);
    }

    public void addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel < 0 || tonerLevel > 100) {
            tonerLevel = -1;
            System.out.println("Rozlałeś tusz/toner zaschnięty Sadge");
        } else System.out.println("Po uzupełnieniu pojemnika, poziom tuszu wynosi " +
                tonerLevel + "%");
    }

    public void printPages(int pagesToPrint) {
        if (duplex) {
            System.out.println("It's a duplex print");
            pagesPrinted += pagesToPrint;
            System.out.println(pagesPrinted % 2 == 0 ? "Lącznie wydrukowano " + pagesPrinted +
                    " stron/y, na " + pagesPrinted / 2 + " kartkach." : "Lącznie wydrukowano " +
                    pagesPrinted + " stron/y, na " + ((pagesPrinted / 2) + 1) + " kartkach.");
        } else {
            pagesPrinted += pagesToPrint;
            System.out.printf("Lącznie wydrukowano %d stron/y, na %d kartkach. %n",
                    pagesPrinted, pagesPrinted);
        }
    }
}
