package com.mobita.aether.collection;

import com.mobita.aether.model.Card;

public interface ICardCollection {
    Board insert(String slot, Card item);
    Card get(String slot);
    Board delete(String slot);
    Board addEffect();
}
