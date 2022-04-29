package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;
import com.mobita.aether.enums.SpellType;
import javafx.scene.paint.Color;

public abstract class Spell extends Card {
    private SpellType type;

    public Spell(String name, String description, SpellType type, int mana, String image) {
        super(CardType.POTION, name, description, image, mana);
        this.type = type;
    }

    public abstract String toString();

    public Color getColorRectangle() {
        return Color.web("#E7A131");
    }

    abstract public String getProductDesc();

    abstract public String[] cardInformation();
    //    public String getName() {
//        return cardName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public SpellType getType() {
//        return type;
//    }
//
//    public int getMana() {
//        return mana;
//    }
//
//    public void setName(String name) {
//        this.cardName = name;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setType(SpellType type) {
//        this.type = type;
//    }
//
//    public void setMana(int mana) {
//        this.mana = mana;
//    }
}
