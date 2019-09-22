package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted =5;
        int bonus = 100;

        if (score < 5000 && score >= 1000) {
            System.out.println("Your score was less than 5000 but equal or greater than 1000");
            System.out.println("This was executed");
        } else if (score < 1000 && score > 0) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        int savedFinalScore = finalScore;

        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            System.out.println("Your final score was " + (score + (levelCompleted * bonus)));
        } else {
            System.out.println("Game is still going on");
        }
    }
}
