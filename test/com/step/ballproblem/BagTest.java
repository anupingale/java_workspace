package com.step.ballproblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagTest {
    @Test
    void shouldAddBallToABagIfBallCountIsLessThanTwelve() {
        Bag bag = new Bag();
        bag.addBall(Bag.Balls.RED);
        int actual = bag.getBallCount();
        assertEquals(1, actual);
    }


    @Test
    void shouldNotAddMoreThanThreeGreenBalls() {
        Bag bag = new Bag();
        bag.addBall(Bag.Balls.GREEN).addBall(Bag.Balls.GREEN)
                .addBall(Bag.Balls.GREEN).addBall(Bag.Balls.GREEN);
        assertEquals(3,bag.getBallCount());
    }

    @Test
    void shouldNotAddBallIfBallCountIsTweleve() {
        Bag bag = new Bag();
        bag.addBall(Bag.Balls.RED).addBall(Bag.Balls.RED)
                .addBall(Bag.Balls.GREEN).addBall(Bag.Balls.YELLOW)
                .addBall(Bag.Balls.RED).addBall(Bag.Balls.RED)
                .addBall(Bag.Balls.GREEN).addBall(Bag.Balls.YELLOW)
                .addBall(Bag.Balls.RED).addBall(Bag.Balls.RED)
                .addBall(Bag.Balls.GREEN).addBall(Bag.Balls.YELLOW);

        assertEquals(12, bag.getBallCount());
        bag.addBall(Bag.Balls.YELLOW);
        assertEquals(12, bag.getBallCount());
    }



    @Test
    void shouldNotAddYellowBallsIfAlreadyFortyPercentOfBallsAreYellow() {
        Bag bag = new Bag();
        bag.addBall(Bag.Balls.YELLOW);
        assertEquals(0,bag.getBallCount());
    }

    @Test
    void shouldAddYellowBallsIfAlreadyFortyPercentOfBallsAreNotYellow() {
        Bag bag = new Bag();
        bag.addBall(Bag.Balls.GREEN).addBall(Bag.Balls.GREEN).addBall(Bag.Balls.BLUE).addBall(Bag.Balls.YELLOW);
        assertEquals(4,bag.getBallCount());
    }
}