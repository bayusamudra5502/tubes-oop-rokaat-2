package com.mobita.aether.model;

import com.mobita.aether.enums.Phase;

public class GameState {
    private Phase gamePhase = Phase.Draw;
    private Integer mana = 0;
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

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
}
