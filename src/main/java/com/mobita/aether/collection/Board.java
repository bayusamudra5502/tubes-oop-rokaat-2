package com.mobita.aether.collection;

import com.mobita.aether.model.Card;

import java.util.HashMap;
import java.util.Map;

public class Board implements ICardCollection{
    private Map<String, Card> cardList;

    public Board() {
        cardList = new HashMap<>();
    }

    public Board insert(String slot, Card item) {
        cardList.put(slot, item);
        return null;
    }

    public Card get(String slot){
        return cardList.get(slot);
    }

//    public Board delete(String slot){
//        cardList.remove(slot);
//        return this;
//    }
//
//    public Board addEffect(){
//        // TODO: add effect to all mobs
//        return this;
//    }
}
