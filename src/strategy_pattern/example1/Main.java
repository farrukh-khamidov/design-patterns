package strategy_pattern.example1;

import strategy_pattern.example1.controller.ScoreBoard;
import strategy_pattern.example1.model.Balloon;
import strategy_pattern.example1.model.Clown;
import strategy_pattern.example1.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.print("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println();

        System.out.print("Clown Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println();

        System.out.print("Square Ballon Tap Score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}