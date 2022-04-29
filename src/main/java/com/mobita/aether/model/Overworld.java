package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class Overworld extends Mobs {
    public Overworld(String name, String description,
                     String image, int baseAttack,
                     int baseHealth, int attackUp,
                     int healthUp, int mana) {
        super(name, description, image,
                MobType.OVERWORLD, mana, baseAttack,
                baseHealth, attackUp, healthUp);
    }
}
