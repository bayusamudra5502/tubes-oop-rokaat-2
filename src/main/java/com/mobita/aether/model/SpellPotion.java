package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellPotion extends Spell {
    private int attack;
    private int health;
    private int duration;

    public SpellPotion(String name, String description, int mana, int attack, int health, int duration) {
        super(name, description, SpellType.POTION, mana);
        this.attack = attack;
        this.health = health;
        this.duration = duration;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
