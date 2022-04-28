package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellPotion extends Spell {
    private int attack;
    private int health;

    public SpellPotion(String name, String description, int mana, int attack, int health) {
        super(name, description, SpellType.POTION, mana);
        this.attack = attack;
        this.health = health;
    }
}
