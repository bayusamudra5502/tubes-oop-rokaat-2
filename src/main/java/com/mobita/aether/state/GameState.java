package com.mobita.aether.state;

import com.mobita.aether.enums.Phase;

public class GameState {
    private Phase gamePhase = Phase.Rest;
    private Integer turn = 1;

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public Phase getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(Phase gamePhase) {
        this.gamePhase = gamePhase;
    }
}
