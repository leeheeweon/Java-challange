package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finalScore);

        finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println(finalScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("LEE1", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("LEE2", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("LEE3", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("LEE4", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("LEE5", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("LEE6", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("LEE7", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
        int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
