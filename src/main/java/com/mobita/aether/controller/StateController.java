package com.mobita.aether.controller;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.Deck;
import com.mobita.aether.model.Player;
import com.mobita.aether.state.GameState;

public class StateController {
    private static final Player player1;
    private static final Player player2;
    private static final GameState gamestate;
    private static Player currentPlayer;
    private static Board board;


    static {
        player1 = new Player();
        player2 = new Player();
        gamestate = new GameState();
        board = new Board();
        currentPlayer = player1;
    }

    public static void insertDeck(Deck deck1, Deck deck2) {
        player1.insertDeck(deck1);
        player2.insertDeck(deck2);
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player p) {
        currentPlayer = p;
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

    public static Board getBoard() {return board;}


}
