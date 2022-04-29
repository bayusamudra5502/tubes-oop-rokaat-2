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

    @Override
    public String getProductDesc() {
        return "Swap";
    }
    public String[] cardInformation() {
        String[] strings = new String[6];
        strings[0] = this.cardName;
        strings[1] = "HP <> ATK";
        strings[2] = "duration: " + this.duration;

        for(int i=3; i<6; i++){
            strings[i] = "";
        }
        return strings;
    }

}
