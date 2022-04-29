package com.mobita.aether.model;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.Deck;
import com.mobita.aether.collection.Hand;

public class Player {
    private final Hand hand;
    private Deck deck;
    private Integer healthPoints = 80;
    private Integer mana;


    public Player() {
        this.deck = null;
        this.hand = new Hand();
        this.mana = 1;
    }

    public void insertDeck(Deck deck) {
        this.deck = deck;
        this.hand.initHand(deck);
        this.mana = 1;
    }


    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

//    public Card getNewCard(String slot) {
//        return this.deck.get(slot);
//    }

//    public String getDescriptionInHand(String slot) {
//        return this.hand.get(slot).getDescription();
//    }
//
//    public String getDescriptionInDeck(String slot) {
//        return this.deck.get(slot).getDescription();
//    }

    public Board handToBoard(String slotHand, String slotBoard, Board board) {
        Card movingCard = this.hand.get(slotHand);
        return board.insert(slotBoard, movingCard);
    }

    public void attackEnemy() {
        // belum
    }
}
