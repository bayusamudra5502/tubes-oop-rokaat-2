package com.mobita.aether.controller;

import com.mobita.aether.model.Player;
import com.mobita.aether.state.GameState;

public class StateController {
    private static final Player player1;
    private static final Player player2;
    private static final GameState gamestate;
    private static final Player currentPlayer;

    static {
        player1 = new Player();
        player2 = new Player();
        gamestate = new GameState();
        currentPlayer = player1;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static Player getPlayer1() {
        return player1;
    }

    public static Player getPlayer2() {
        return player2;
    }

    public static GameState getGamestate() {
        return gamestate;
    }
}
