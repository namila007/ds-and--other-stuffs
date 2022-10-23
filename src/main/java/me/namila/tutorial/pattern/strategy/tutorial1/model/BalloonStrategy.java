package me.namila.tutorial.pattern.strategy.tutorial1.model;

import me.namila.tutorial.pattern.strategy.tutorial1.controller.ScoreBoardBase;

public class BalloonStrategy extends ScoreBoardBase {
    @Override
    public Integer calculateScore(int tap, int multiplier) {
        return tap*multiplier+10;
    }
}
