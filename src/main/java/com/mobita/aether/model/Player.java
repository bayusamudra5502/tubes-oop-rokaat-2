package com.mobita.aether.model;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.Deck;
import com.mobita.aether.collection.Hand;

public class Player {
    private Deck deck;
    private Hand hand;
    private Integer healthPoints = 80;
    private Integer mana;

    public Player(Deck deck) {
        this.deck = deck;
        this.hand = new Hand();
    }

    public Player(){
        this.deck = null;
        this.hand = new Hand();
    }

    public void insertDeck(Deck deck){
        this.deck = deck;
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

    public Board handToBoard(String slotHand, String slotBoard, Card card, Board board) {
        Card movingCard = this.hand.get(slotHand);
        return board.insert(slotBoard, movingCard);
    }

    public void attackEnemy() {
        // belum
    }
}
