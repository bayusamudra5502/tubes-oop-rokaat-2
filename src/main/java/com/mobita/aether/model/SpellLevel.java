package com.mobita.aether.model;

import com.mobita.aether.controller.StateController;
import com.mobita.aether.enums.SpellType;

public class SpellLevel extends Spell{
    boolean islevelUp;
    public SpellLevel(String name, String description, boolean islevelUp) {
        super(name, description, SpellType.LEVEL, -1, "card/image/spell/swap/Potion of Turtle Master.png");
        this.islevelUp = islevelUp;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getProductDesc() {
        String res;
        if(islevelUp){
            res = "lvl++";
        }
        else{
            res = "lvl--";
        }
        return res;
    }
    public String getManaLevelUp(){
        return "ceil(lvl/2)";
    }
    public String[] cardInformation() {
        String[] strings = new String[6];
        strings[0] = this.cardName;
        if (this.islevelUp) {
            strings[1] = "level + 1";
        }
        else{
            strings[1] = "level - 1";
        }
        for(int i=2; i<6; i++){
            strings[i] = "";
        }
        return strings;
    }
}
