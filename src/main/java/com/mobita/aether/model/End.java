package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class End extends Mobs {
    public End(String name, String description,
               String image, int baseAttack,
               int baseHealth, int attackUp,
               int healthUp, int mana) {
        super(name, description, image,
                MobType.END, mana, baseAttack,
                baseHealth, attackUp, healthUp);
    }
}
