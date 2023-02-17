package strategy_pattern.example1.model;

import strategy_pattern.example1.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return taps * multiplier - 20;
    }
}
