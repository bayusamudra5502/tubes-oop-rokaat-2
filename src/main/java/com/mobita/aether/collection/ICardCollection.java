package com.mobita.aether.collection;

import com.mobita.aether.model.Card;

public interface ICardCollection<T> {
    T insert(String slot, Card item);
    Card get(String slot);
    T delete(String slot);
    T addEffect();
}
