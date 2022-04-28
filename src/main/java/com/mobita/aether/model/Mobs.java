package com.mobita.aether.model;

public abstract class Mobs {
    protected String name;
    protected String description;
    protected Type type;

    public Mobs(String name, String description, Type type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    abstract void printInfo();
    abstract void levelUp();
    abstract void addExp(int level2, int health2);
    abstract void Attack(Type type2, int health2);
    abstract int getAtkUp();
    abstract int getHealthUp();
    public String getName() {
        return this.name;
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
}
