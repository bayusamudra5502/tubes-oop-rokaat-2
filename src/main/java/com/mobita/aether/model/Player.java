package com.mobita.aether.model;

import com.mobita.aether.collection.Deck;
import com.mobita.aether.collection.Hand;

public class Player {
    private String name; // name of the player
    private String pathProfile; // profil picture of the player
    private Integer healthPoints;
    private Integer mana;
    private Deck deck;
    private Hand hand;
    public Player(String name, String pathProfile) {
        this.name = name;
        this.pathProfile = pathProfile;
        this.healthPoints = 80;
        this.mana = 0;
        this.deck = new Deck();
        this.hand = new Hand();
    }

    public String getName(){
        return this.name;
    }

    public String getPathProfile(){
        return this.getPathProfile();
    }

    public Card getNewCard(String slot) {
        return this.deck.get(slot);
    }

    public String seeDescriptionHand() {
        return "Lorem Ipsum";
        // belum selesai
    }

    public void handToBoard(String slotHand, String slotBoard, Card card) {
        // belum selesai
    }

    public void attackEnemy() {
        // belum
    }

    public void nextPhase() {

    }
}
