package s4_ExpressionsStatementsCodeBlocksMethods;

public class a046_IfKeywordAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCOmpleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("You score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCOmpleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // challenge
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        score = 10000;
        levelCOmpleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCOmpleted * bonus);
            System.out.println(finalScore);
        }
    }
}
