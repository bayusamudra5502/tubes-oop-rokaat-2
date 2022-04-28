package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public abstract class Spell {
    private String name;
    private String description;
    private SpellType type;
    private int mana;

    public Spell(String name, String description, SpellType type, int mana) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.mana = mana;
    }

    public String getName() {
        return name;
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
        this.name = name;
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
