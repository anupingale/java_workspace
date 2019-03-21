package com.step.tic_tac_toe;

import java.util.ArrayList;

public class Player {
    private String name;
    private String symbol;
    private ArrayList<Integer> moves;

    public Player(String playerName, String symbol) {
        this.name = playerName;
        this.symbol = symbol;
        this.moves = new ArrayList<>();
    }
}
