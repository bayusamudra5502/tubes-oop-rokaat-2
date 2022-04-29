package com.mobita.aether.model;

import com.mobita.aether.enums.Phase;

public class GameState {
    private Phase gamePhase;
    private Integer mana;

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
