package com.mobita.aether.form.component;

import com.mobita.aether.model.Card;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

public class BoardFacade {
    private AnchorPane pane;

    public BoardFacade(AnchorPane pane){
        this.pane = pane;
    }

    public BoardFacade setValue(Card c) {
        Rectangle r = (Rectangle) pane.getChildren().get(0);
        AnchorPane descriptionPane = (AnchorPane) pane.getChildren().get(1);

        HBox image = (HBox) descriptionPane.getChildren().get(0);
        Label attackValue = (Label) descriptionPane.getChildren().get(3);
        Label hearthValue = (Label)  descriptionPane.getChildren().get(4);
        Label lavel = (Label) descriptionPane.getChildren().get(5);

        // TODO: Masukin datanya

        return this;
    }
}
