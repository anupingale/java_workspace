package com.step.ballproblem;

import javax.xml.validation.Validator;
import java.util.HashMap;
import java.util.Map;

class Bag {
    Map<Balls, Integer> balls;
    private static Map<Balls, Validator> validator;

//    static {
//        validator = new HashMap<>();
//        Validator redBallValidator
//    }
//
//    private interface validator {
//        boolean validate();
//    }

    public Bag() {
        this.balls = new HashMap<>();
        balls.put(Balls.RED, 0);
        balls.put(Balls.YELLOW, 0);
        balls.put(Balls.GREEN, 0);
        balls.put(Balls.BLUE, 0);
    }

    public enum Balls {
        RED(),
        GREEN(),
        YELLOW,
        BLUE;

        Balls() {
        }
    }

    int getBallCount() {
        int ballCount = 0;
        for (int count : this.balls.values()) {
            ballCount += count;
        }
        return ballCount;
    }

    Bag addBall(Balls ball) {
        int count = this.balls.get(ball);
        int totalBalls = this.getBallCount();
        if (totalBalls == 12) return this;
        System.out.println(this.balls.get(ball));
        if (ball == Balls.GREEN && this.balls.get(ball) >= 3) return this;
        boolean validationForYellow = (((count + 1) * 100) / (totalBalls + 1) >= 40);
        if (ball == Balls.YELLOW && validationForYellow) return this;
        this.balls.put(ball, ++count);
        return this;
    }
}
