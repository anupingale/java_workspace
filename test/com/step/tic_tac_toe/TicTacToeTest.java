package com.step.tic_tac_toe;

import org.junit.jupiter.api.Test;

import javax.swing.*;

class TicTacToeTest {
    @Test
    void ShouldInitializeGameWhenInitializingWithTwoPlayers() {
        Player player1 = new Player("anu","X");
        Player player2 = new Player("sai","O");

        TicTacToe ticTacToe = new TicTacToe();

    }
}