package com.mobita.aether.collection;

import com.mobita.aether.collection.Board;
import com.mobita.aether.collection.ICardCollection;
import com.mobita.aether.model.Card;

import java.util.HashMap;
import java.util.Map;

public class Hand implements ICardCollection{
    private Map<String, Card> inHand;

    public Hand() {
        this.inHand = new HashMap<>();
    }

    public void insert(String slot, Card item) {
        inHand.put(slot,item);
    }

    public Card get(String slot) {
        return inHand.get(slot);
    }

//    public Card delete(String slot) {
//        Card res = get(slot);
//        res.setEmpty();
//        return res;
//    }

}
