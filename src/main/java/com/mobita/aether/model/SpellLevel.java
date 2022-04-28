package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellLevel extends Spell{
    public boolean increaseLevel;

    public SpellLevel(String name, String description, int mana, boolean increaseLevel) {
        super(name, description, SpellType.LEVEL, mana);
        this.increaseLevel = increaseLevel;
    }
}
