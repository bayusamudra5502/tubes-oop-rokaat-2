package com.mobita.aether.model;

public class Overworld extends Mobs{
    public Overworld() {
        this.name = "";
        this.description = "";
        this.type = Type.OVERWORLD;
        this.baseAttack = 3;
        this.baseHealth = 80;
        this.level = 0;
        this.exp = 0;
    }
    public Overworld(String name, String description, Type type, int baseAttack, int baseHealth, int level, int exp) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.baseAttack = baseAttack;
        this.baseHealth = baseHealth;
        this.level = level;
        this.exp = exp;
    }
    public void printInfo() {

    }
    public void levelUp() {

    }
    public void addExp() {

    }
    public void addAtk() {

    }
    public void addHealth() {

    }
}
