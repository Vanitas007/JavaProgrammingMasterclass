package s4_ExpressionsStatementsCodeBlocksMethods.exercises;

public class e011_PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else return !summer && temperature >= 25 && temperature <= 35;

//      Lepsze rozwiązanie bez duplikowania kodu
//        int maxTemp = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= maxTemp;
    }
}
