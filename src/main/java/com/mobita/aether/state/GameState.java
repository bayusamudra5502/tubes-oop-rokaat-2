package com.mobita.aether.state;

import com.mobita.aether.enums.ActionType;
import com.mobita.aether.enums.Phase;

public class GameState {
    private Phase gamePhase = Phase.Rest;
    private Integer turn = 1;
    private ActionType action = ActionType.None;
    private String fromID;

    public ActionType getAction() {
        return action;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }

    public String getFromID() {
        return fromID;
    }

    public void setFromID(String fromID) {
        this.fromID = fromID;
    }

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
