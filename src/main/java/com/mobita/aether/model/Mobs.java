package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;
import com.mobita.aether.enums.MobType;

public abstract class Mobs extends Card {
    protected MobType type;
    protected int level;
    protected String pathToImage;
    protected int attack;
    protected int health;
    protected int mana;
    protected int attackup;
    protected int healthup;


    public Mobs(String name, String description, MobType type, int level, String pathToImage) {
        super(name, description, CardType.MOBS, pathToImage);
        this.type = type;
        this.level = level;
//        this.pathToImage = pathToImage;
    }

//    abstract void printInfo();
//    abstract void levelUp();
//    abstract void addExp(int level2, int health2);
//    abstract void Attack(Type type2, int health2);
    abstract int getAtkUp();
    abstract int getHealthUp();
    public MobType getType() {
        return this.type;
    }

//    abstract int getLevel();
//    abstract int getExp();
//    abstract int getAtk();
//    abstract int getHealth();

    @Override
    public String toString() {
        return "Level: " + this.level;
    }
}
