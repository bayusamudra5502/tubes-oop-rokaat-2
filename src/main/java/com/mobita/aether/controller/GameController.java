package com.mobita.aether.controller;

import com.mobita.aether.model.Player;

public class GameController {
    Player player_1, player_2;

    public GameController(String player1Name, String player2Name){
        this.player_1 = new Player(player1Name);
        this.player_2 = new Player(player1Name);
    }
}
