package com.mobita.aether.model;

import com.mobita.aether.enums.CardType;
import com.mobita.aether.enums.MobType;
import javafx.scene.paint.Color;

public abstract class Mobs extends Card {
    protected MobType type;
    protected Integer totalExp;
    protected Integer baseAttack;
    protected Integer baseHealth;
    protected Integer attackUp;
    protected Integer healthUp;

    public Mobs(String name, String description,
                String pathToImage, MobType type,
                int mana, int baseAttack,
                int baseHealth, int attackUp,
                int healthUp) {
        super(CardType.MOBS, name, description, pathToImage, mana);
        this.type = type;
        this.totalExp = 0;
        this.baseAttack = baseAttack;
        this.baseHealth = baseHealth;
        this.attackUp = attackUp;
        this.healthUp = healthUp;
    }

    public Integer getBaseAttack() {
        return baseAttack;
    }

    public Integer getBaseHealth() {
        return baseHealth;
    }

    public Integer getLevel() {
        return (int) Math.floor(Math.sqrt(this.totalExp)) + 1;
    }

    public Integer getExp() {
        int level = getLevel();
        return totalExp - (level - 1) * (level - 1);
    }

    public Integer getMaxExpInLevel() {
        return this.getLevel() * 2 - 1;
    }

    public MobType getMobType() {
        return this.type;
    }

    @Override
    public String getProductDesc() {
        String res = "ATK "+ this.baseAttack + "/HP " + this.baseHealth;
        return res;
    }

    abstract public Color getColorRectangle();

    public String getLevelString() {
        return "LVL " + this.getLevel() + "(" + this.getExp() + "/" + this.getMaxExpInLevel() + ")";
    }
}
