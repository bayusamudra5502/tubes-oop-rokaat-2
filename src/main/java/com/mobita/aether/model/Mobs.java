package com.mobita.aether.model;

public abstract class Mobs {
    protected String name;
    protected String description;
    protected Type type;
    protected int baseAttack;
    protected int baseHealth;
    protected int level;
    protected int exp;

    abstract void printInfo();
    abstract void levelUp();
    abstract void addExp();
    abstract void addAtk();
    abstract void addHealth();
    public String getName() {
        return this.name;
    }
    public Type getType() {
        return this.type;
    }
    public int getLevel() {
        return this.level;
    }
    public int getExp() {
        return this.exp;
    }
    public int getAtk() {
        return this.baseAttack;
    }
    public int getHealth() {
        return this.baseHealth;
    }
}
