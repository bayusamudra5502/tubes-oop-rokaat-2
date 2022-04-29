package com.mobita.aether.model;

import com.mobita.aether.enums.SpellType;

public class SpellSwap extends Spell {
    private int duration;
    public SpellSwap(String name, String description, String image, int mana, int duration) {
        super(name, description, SpellType.SWAP, mana, image);
        this.duration = duration;
    }

    public String toString(){
        String res = "Name: " + this.cardName + "\n";
        res += "cardType: " + this.cardType + "\n";
        res += "imagePath: " + this.imageURL + "\n";
        res += "desctiprion: " + this.description + "\n";
        res += "mana: " + this.mana + "\n";
        res += "duration: " + this.duration + "\n";
        return res;
    }
}
