package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;
import javafx.scene.paint.Color;

public class End extends Mobs {
    public End(String name, String description,
               String image, int baseAttack,
               int baseHealth, int attackUp,
               int healthUp, int mana) {
        super(name, description, image,
                MobType.END, mana, baseAttack,
                baseHealth, attackUp, healthUp);
    }


    @Override
    public Color getColorRectangle() {
        return Color.web("3D405B");
    }

    @Override
    public String[] cardInformation() {
        String[] newString = super.cardInformation();
        newString[5] = "END";
        return newString;
    }
}
