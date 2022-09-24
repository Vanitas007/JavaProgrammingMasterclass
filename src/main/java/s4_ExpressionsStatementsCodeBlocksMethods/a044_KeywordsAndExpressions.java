package s4_ExpressionsStatementsCodeBlocksMethods;

public class a044_KeywordsAndExpressions {
    public static void main(String[] args) {

        //a mile is equal to 1.609344
        double kilometres = (100 * 1.609344);
        System.out.println(kilometres);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
    }
}
