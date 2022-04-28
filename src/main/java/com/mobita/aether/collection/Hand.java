package com.mobita.aether.collection;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.ICardCollection;
import com.mobita.aether.model.Card;

import java.util.HashMap;
import java.util.Map;

public class Hand {
    private Map<String, Card> inHand;
    public Hand() {
        this.inHand = new HashMap<>();
    }

    public Hand insert(String slot, Card item) {
        inHand.put(slot,item);
        return this;
    }

    public Card get(String slot) {
        return inHand.get(slot);
    }

    public Hand delete(String slot) {
        inHand.remove(slot);
        return this;
    }

}
