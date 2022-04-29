package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;

public abstract class Card{
    protected String cardName;
    protected String description;
    protected CardType cardType;
    protected String imageURL;
    protected int mana;


//    public String getCardName() {
//        return cardName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public CardType getCardType() {
//        return cardType;
//    }
//
//    public void setCardName(String cardName) {
//        this.cardName = cardName;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCardType(CardType cardType) {
//        this.cardType = cardType;
//    }

    public Card(CardType cardType, String cardName, String description, String imageURL, int mana) {
        this.cardName = cardName;
        this.description = description;
        this.cardType = cardType;
        this.imageURL = imageURL;
        this.mana = mana;
    }

    public abstract String toString();

//    public Card(){
//        this.setEmpty();
//    }

//    public void setEmpty(){
//        this.cardName = "";
//        this.description = "";
//        this.cardType = null;
//        this.imageURL = null;
//    }
}
