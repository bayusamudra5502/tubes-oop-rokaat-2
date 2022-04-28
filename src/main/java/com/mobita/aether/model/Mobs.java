package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;

public abstract class Mobs extends Card {
    protected Type type;
    protected int level;

    public Mobs(String name, String description, Type type, int level, String image) {
        super(name, description, CardType.MOBS, image);
        this.type = type;
        this.level = level;
    }

    abstract void printInfo();
    abstract void levelUp();
    abstract void addExp(int level2, int health2);
    abstract void Attack(Type type2, int health2);
    abstract int getAtkUp();
    abstract int getHealthUp();
    public String getName() {
        return this.cardName;
    }
    public Type getType() {
        return this.type;
    }
    public String getDesc() {
        return this.description;
    }
    abstract int getLevel();
    abstract int getExp();
    abstract int getAtk();
    abstract int getHealth();

    @Override
    public String toString() {
        return "Level: " + this.level;
    }
}
