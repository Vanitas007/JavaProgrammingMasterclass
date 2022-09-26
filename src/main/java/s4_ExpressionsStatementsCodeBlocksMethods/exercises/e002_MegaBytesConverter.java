package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

public class e002_MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int mb = 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / mb;
            int remainingKilobytes = kiloBytes % mb;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
