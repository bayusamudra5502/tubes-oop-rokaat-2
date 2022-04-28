package com.mobita.aether.form;

import javafx.scene.layout.AnchorPane;

public class CardPane extends AnchorPane{
    String position;

    public CardPane(AnchorPane source, String position){
        super(source);
        this.position = position;
    }
}
