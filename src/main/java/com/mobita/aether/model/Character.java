package com.mobita.aether.model;

import com.mobita.aether.enums.MobType;

public class Character {
  private String name;
  private String description;
  private MobType type;

  public Character() {
    this.name = "";
    this.description = "";
    this.type = MobType.OVERWORLD;
  }

  public Character(String name, String description, MobType element) {
    this.name = name;
    this.description = description;
    this.type = element;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nDescription: " + this.description + "\nType: " + this.type;
  }
}
