package com.mobita.aether.collection;

import com.mobita.aether.model.Card;

import java.util.HashMap;
import java.util.Map;

public class Hand implements ICardCollection {
    private final Map<String, Card> inHand;

    public Hand() {
        this.inHand = new HashMap<>();
    }


    public void initHand(Deck deck) {
        for (int i = 0; i < 3; i++) {
            Card c = deck.delete(0);
            inHand.put("hand_card" + (i + 1), c);
        }
    }

    public ICardCollection insert(String slot, Card item) {
        inHand.put(slot, item);
        return this;
    }

    public Card get(String slot) {
        return inHand.get(slot);
    }
    
    public Hand delete(String slot) {
        this.inHand.remove(slot);
        return this;
    }

}
