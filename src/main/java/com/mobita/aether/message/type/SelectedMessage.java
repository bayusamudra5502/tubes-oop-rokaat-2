package com.mobita.aether.message.type;

import com.mobita.aether.message.IMessage;
import com.mobita.aether.model.Card;

public class SelectedMessage implements IMessage<Card> {
    private Card card;

    public SelectedMessage(Card card) {
        this.card = card;
    }

    @Override
    public Card getMessage() {
        return card;
    }

    @Override
    public void setMessage(Card message) {
        this.card = message;
    }
}
