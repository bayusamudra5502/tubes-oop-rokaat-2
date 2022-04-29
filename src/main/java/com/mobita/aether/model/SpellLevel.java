package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellLevel extends Spell{
    public SpellLevel(String name, String description) {
        super(name, description, SpellType.LEVEL, -1, "card/image/spell/swap/Potion of Turtle Master.png");
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getProductDesc() {
        return null;
    }
}
