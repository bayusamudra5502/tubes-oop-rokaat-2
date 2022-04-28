package com.mobita.aether.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private ArrayList<Card> inHand;
    public Hand() {
        this.inHand = new ArrayList<Card>();
    }
    public Hand(ArrayList<Card> inHand) {
        this.inHand = inHand;
    }
    public void addToHand(Card c) {
        this.inHand.add(c);
    }
    public void removeFromHand(int idx) {
        this.inHand.remove(idx);
    }
}
