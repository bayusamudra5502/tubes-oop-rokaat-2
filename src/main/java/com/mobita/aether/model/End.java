package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class End extends Mobs{
    private int baseAttack;
    private int baseHealth;
    private int exp;
    private int attackUp;
    private int healthUp;
    private int mana;
    
    public End(String name, String description, int baseAttack, int baseHealth, int level, int exp, int attackUp, int healthUp, int mana, String image) {
        super(name, description, MobType.END, level, image);
        this.baseAttack = baseAttack;
        this.baseHealth = baseHealth;
        this.level = level;
        this.exp = exp;
        this.attackUp = attackUp;
        this.healthUp = healthUp;
        this.mana = mana;
    }
    public void printInfo() {
        System.out.println("Nama : "+ this.cardName);
        System.out.println("Deskripsi : " + this.description);
        System.out.println("Tipe : " + MobType.END);
        System.out.println("Attack : " + this.baseHealth);
        System.out.println("Health : " + this.baseHealth);
    }
    public void levelUp() {
        this.level = (int) Math.round(this.exp/2.0);
        this.baseAttack += this.getAtkUp();
        this.baseHealth += this.getHealthUp();
    }
    public void addExp(int level2, int health2) {
        if (health2 == 0) {
            this.exp += level2;
        }
        this.exp += this.mana;
    }
    public void Attack(MobType type2, int health2) {
        if (type2 == MobType.NETHER) {
            health2 -= 2*this.getAtk();
        }
        else if (type2 == MobType.OVERWORLD) {
            health2 -= 0.5*this.getAtk();
        }
    }
    public int getAtkUp() {
        return this.attackUp;
    }
    public int getHealthUp() {
        return this.healthUp;
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
