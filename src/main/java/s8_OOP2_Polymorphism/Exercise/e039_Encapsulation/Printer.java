package s8_OOP2_Polymorphism.Exercise.e039_Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        return tonerAmount <= 0 || tonerAmount > 100 || tonerAmount + tonerLevel > 100 ?
                -1 : (tonerLevel += tonerAmount);
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
