package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;
import com.mobita.aether.enums.MobType;

public abstract class Mobs extends Card {
    protected MobType type;
    protected int totalExp;


    public Mobs(String name, String description, String pathToImage, MobType type, int mana) {
        super(CardType.MOBS, name, description, pathToImage, mana);
        this.type = type;
        this.totalExp = 0;
    }

    public Mobs(String name, String description, String pathToImage, MobType type, int totalExp, int mana){
        super(CardType.MOBS, name, description, pathToImage, mana);
        this.type = type;
        this.totalExp = totalExp;
    }


    public int getLevel(){
        return (int) Math.floor(Math.sqrt(this.totalExp)) + 1;
    }

    public int getExp(){
        int level = getLevel();
        return totalExp - (level-1)*(level-1);
    }

    public abstract String toString();

//
//    @Override
//    public String toString() {
//        return "Level: " + this.level;
//    }
}
