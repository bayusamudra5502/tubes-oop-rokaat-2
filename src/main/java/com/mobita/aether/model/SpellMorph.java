package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;
import com.mobita.aether.enums.SpellType;

public class SpellMorph extends Spell {
    private Mobs target;
    public SpellMorph(String name, String description, int mana, String image, Mobs target) {
        super(name, description, SpellType.MORPH, mana, image);
        this.target = target;
    }

    public String toString(){
        String res = "Name: " + this.cardName + "\n";
        res += "cardType: " + this.cardType + "\n";
        res += "imagePath: " + this.imageURL + "\n";
        res += "desctiprion: " + this.description + "\n";
        res += "mana: " + this.mana + "\n";
        res += "target description: \n";
        res += target.toString();
        return res;
    }

    @Override
    public String getProductDesc() {
        return "Morph";
    }

    public String[] cardInformation() {
        String[] strings = new String[6];
        strings[0] = this.cardName;
        strings[1] = "change character";
        for(int i=2; i<6; i++){
            strings[i] = "";
        }
        return strings;
    }
}
