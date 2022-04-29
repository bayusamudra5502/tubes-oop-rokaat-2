package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class Nether extends Mobs{
    private int baseAttack;
    private int baseHealth;
    private int exp;
    private int attackUp;
    private int healthUp;

    public Nether(String name, String description, String image, int baseAttack, int baseHealth, int attackUp, int healthUp, int mana) {
        super(name, description, image, MobType.END, mana);
        this.baseAttack = baseAttack;
        this.baseHealth = baseHealth;
        this.attackUp = attackUp;
        this.healthUp = healthUp;
    }

    public String toString(){
        String res = "Name: " + this.cardName + "\n";
        res += "cardType: " + this.cardType + "\n";
        res += "imagePath: " + this.imageURL + "\n";
        res += "desctiprion: " + this.description + "\n";
        res += "MobType: " + this.type + "\n";
        res += "attack: " + this.baseAttack + "\n";
        res += "HP: " + this.baseHealth + "\n";
        res += "AttackUp: " + this.attackUp + "\n";
        res += "healthUp: " + this.healthUp + "\n";
        res += "mana: " + this.mana + "\n";
        return res;
    }
//    @Override
//    int getAtkUp() {
//        return 0;
//    }
//
//    @Override
//    int getHealthUp() {
//        return 0;
//    }
//    public void printInfo() {
//        System.out.println("Nama : "+ this.cardName);
//        System.out.println("Deskripsi : " + this.description);
//        System.out.println("Tipe : " + Type.NETHER);
//        System.out.println("Attack : " + this.baseHealth);
//        System.out.println("Health : " + this.baseHealth);
//    }
//    public void levelUp() {
//        this.level = (int) Math.round(this.exp/2.0);
//        this.baseAttack += this.getAtkUp();
//        this.baseHealth += this.getHealthUp();
//    }
//    public void addExp(int level2, int health2) {
//        if (health2 == 0) {
//            this.exp += level2;
//        }
//        this.exp += this.mana;
//    }
//    public void Attack(Type type2, int health2) {
//        if (type2 == Type.OVERWORLD) {
//            health2 -= 2*this.getAtk();
//        }
//        else if (type2 == Type.END) {
//            health2 -= 0.5*this.getAtk();
//        }
//    }
//    public int getAtkUp() {
//        return this.attackUp;
//    }
//    public int getHealthUp() {
//        return this.healthUp;
//    }
//    public int getLevel() {
//        return this.level;
//    }
//    public int getExp() {
//        return this.exp;
//    }
//    public int getAtk() {
//        return this.baseAttack;
//    }
//    public int getHealth() {
//        return this.baseHealth;
//    }
}
