package me.namila.tutorial.pattern.strategy.tutorial1;

import me.namila.tutorial.pattern.strategy.tutorial1.controller.ScoreBoardContext;
import me.namila.tutorial.pattern.strategy.tutorial1.model.BalloonStrategy;
import me.namila.tutorial.pattern.strategy.tutorial1.model.ClownStratergy;
import me.namila.tutorial.pattern.strategy.tutorial1.model.SquareBalloonStrategy;

public class App {

    public static void main(String[] args) {
        ClownStratergy clownStratergy = new ClownStratergy();
        BalloonStrategy balloonStrategy = new BalloonStrategy();
        SquareBalloonStrategy squareBalloonStrategy = new SquareBalloonStrategy();

        ScoreBoardContext scoreBoardContext = new ScoreBoardContext();

        scoreBoardContext.setScoreBoardBase(clownStratergy);
        System.out.println(scoreBoardContext.getScore(10, 2));
        scoreBoardContext.setScoreBoardBase(balloonStrategy);
        System.out.println(scoreBoardContext.getScore(10, 2));
        scoreBoardContext.setScoreBoardBase(squareBalloonStrategy);
        System.out.println(scoreBoardContext.getScore(10, 2));
    }
}
