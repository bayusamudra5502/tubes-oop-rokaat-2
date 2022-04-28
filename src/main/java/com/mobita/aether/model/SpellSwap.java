package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellSwap extends Spell {
    private int duration;
    public SpellSwap(String name, String description, int mana, int duration, String image) {
        super(name, description, SpellType.SWAP, mana, image);
        this.duration = duration;
    }
}
