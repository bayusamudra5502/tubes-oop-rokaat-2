package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;
import com.mobita.aether.enums.SpellType;

public abstract class Spell extends Card {
    private SpellType type;
    private int mana;

    public Spell(String name, String description, SpellType type, int mana, String image) {
        super(name, description, CardType.POTION, image);
        this.type = type;
        this.mana = mana;
    }

    public String getName() {
        return cardName;
    }

    public String getDescription() {
        return description;
    }

    public SpellType getType() {
        return type;
    }

    public int getMana() {
        return mana;
    }

    public void setName(String name) {
        this.cardName = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(SpellType type) {
        this.type = type;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
