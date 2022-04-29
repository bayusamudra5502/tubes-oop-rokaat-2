package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class Nether extends Mobs {
    public Nether(String name, String description,
                  String image, int baseAttack,
                  int baseHealth, int attackUp,
                  int healthUp, int mana) {
        super(name, description, image,
                MobType.NETHER, mana, baseAttack,
                baseHealth, attackUp, healthUp);
    }
}
