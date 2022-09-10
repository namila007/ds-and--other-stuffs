package me.namila.tutorial.pattern.strategy.tutorial1.controller;

public class ScoreBoardContext {

    ScoreBoardBase scoreBoardBase;

    public Integer getScore(int tap, int multi) {
        return scoreBoardBase.calculateScore(tap, multi);
    }

    public ScoreBoardBase getScoreBoardBase() {
        return scoreBoardBase;
    }

    public void setScoreBoardBase(ScoreBoardBase scoreBoardBase) {
        this.scoreBoardBase = scoreBoardBase;
    }
}
