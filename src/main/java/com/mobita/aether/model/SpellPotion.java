package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellPotion extends Spell {
    private int attack;
    private int health;
    private int duration;

    public SpellPotion(String name, String description, String image, int mana, int attack, int health, int duration) {
        super(name, description, SpellType.POTION, mana, image);
        this.attack = attack;
        this.health = health;
        this.duration = duration;
    }

    public String toString(){
        String res = "Name: " + this.cardName + "\n";
        res += "cardType: " + this.cardType + "\n";
        res += "imagePath: " + this.imageURL + "\n";
        res += "desctiprion: " + this.description + "\n";
        res += "mana: " + this.mana + "\n";
        res += "atk: " + this.attack + "\n";
        res += "hp: " + this.health + "\n";
        res += "duration " + this.duration + "\n";
        return res;
    }

    @Override
    public String getProductDesc() {
        return null;
    }
//    public int getAttack() {
//        return this.attack;
//    }
//
//    public int getHealth() {
//        return this.health;
//    }
//
//    public int getDuration() {
//        return this.duration;
//    }
//
//    public void setAttack(int attack) {
//        this.attack = attack;
//    }
//
//    public void setHealth(int health) {
//        this.health = health;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
}
