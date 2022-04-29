package com.mobita.aether.controller;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.Deck;
import com.mobita.aether.collection.Hand;
import com.mobita.aether.model.GameState;

public class StateController {
    private static Board board;
    private static Deck deck;
    private static Hand hand;
    private static GameState gamestate;

    public static Board getBoard() {
        if (board == null) {
            board = new Board();
        }
        return board;
    }

    public static Deck getDeck() {
        if (deck == null) {
            deck = new Deck();
        }
        return deck;
    }

    public static Hand getHand() {
        if (hand == null) {
            hand = new Hand();
        }
        return hand;
    }

    public static GameState getGamestate() {
        if (gamestate == null) {
            gamestate = new GameState();
        }

        return gamestate;
    }
}
