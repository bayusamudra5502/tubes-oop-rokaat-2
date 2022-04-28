package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellMorph extends Spell {
    private Character target;
    public SpellMorph(String name, String description, int mana, Character target) {
        super(name, description, SpellType.MORPH, mana);
        this.target = target;
    }
}
