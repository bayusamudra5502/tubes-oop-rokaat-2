package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;

public abstract class Card {
    private String cardName;
    private String description;
    private CardType cardType;

    public String getCardName() {
        return cardName;
    }

    public String getDescription() {
        return description;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Card(String cardName, String description, CardType cardType) {
        this.cardName = cardName;
        this.description = description;
        this.cardType = cardType;
    }
}
