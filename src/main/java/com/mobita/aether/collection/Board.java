package com.mobita.aether.collection;

import com.mobita.aether.model.Card;

import java.util.HashMap;
import java.util.Map;

public class Board implements ICardCollection {
    private final Map<String, Card> cardList;

    public Board() {
        cardList = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            cardList.put("player1_card" + i, null);
        }

        for (int i = 1; i <= 5; i++) {
            cardList.put("player2_card" + i, null);
        }
    }

    public Board insert(String slot, Card item) {
        cardList.put(slot, item);
        return null;
    }

    public Card get(String slot) {
        return cardList.get(slot);
    }

    public Card delete(String slot) {
        return cardList.remove(slot);
    }

//    public Board addEffect(){
//        // TODO: add effect to all mobs
//        return this;
//    }
}
