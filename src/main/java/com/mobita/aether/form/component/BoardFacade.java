package com.mobita.aether.form.component;

import com.mobita.aether.model.Mobs;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

public class BoardFacade {
    private final AnchorPane pane;

    public BoardFacade(AnchorPane pane) {
        this.pane = pane;
    }

    public BoardFacade setValue(Mobs c) {
        Rectangle r = (Rectangle) pane.getChildren().get(0);
        AnchorPane descriptionPane = (AnchorPane) pane.getChildren().get(1);

        HBox imageBox = (HBox) descriptionPane.getChildren().get(0);
        ImageView image = (ImageView) imageBox.getChildren().get(0);
        Label attackValue = (Label) descriptionPane.getChildren().get(3);
        Label healthValue = (Label) descriptionPane.getChildren().get(4);
        Label level = (Label) descriptionPane.getChildren().get(5);

        image.setImage(new Image(c.getImageURL()));
        attackValue.setText(c.getBaseAttack().toString());
        healthValue.setText(c.getBaseHealth().toString());
        level.setText("Lvl " + c.getLevel() + "(" + c.getExp() + "/" + c.getMaxExpInLevel() + ")");

        return this;
    }
}
