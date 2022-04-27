package com.mobita.aether.model;

public class Player {
    private String name; // name of the player
    private String pathProfile; // profil picture of the player

    public Player(String name, String pathProfile) {

        this.name = name;
        this.pathProfile = pathProfile;
    }

    public String getName(){
        return this.name;
    }

    public String getPathProfile(){
        return this.getPathProfile();
    }
}
