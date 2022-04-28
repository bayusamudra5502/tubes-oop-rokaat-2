package com.mobita.aether.form;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class DeckSelector {
    public AnchorPane card1;
    public Rectangle card1_rectangle;
    public Text card1_title;
    public Text card1_heart;
    public Text card1_attack;
    public ImageView card1_img;
    public AnchorPane card2;
    public Rectangle card2_rectangle;
    public Text card2_title;
    public Text card2_heart;
    public Text card2_attack;
    public ImageView card2_img;
    public AnchorPane card3;
    public Rectangle card3_rectangle;
    public Text card3_title;
    public Text card3_heart;
    public Text card3_attack;
    public ImageView card3_img;

    @FXML
    public void onCard1Clicked(MouseEvent mouseEvent){
        card1_img.setImage(new Image("/com/mobita/aether/card/image/character/Villager.png"));
    }

    @FXML
    public void onCard2Clicked(MouseEvent mouseEvent) {
        card2_img.setImage(new Image("/com/mobita/aether/card/image/character/Villager.png"));
    }

    @FXML
    public void onCard3Clicked(MouseEvent mouseEvent) {
        card3_img.setImage(new Image("/com/mobita/aether/card/image/character/Villager.png"));
    }

    public void onCard1HoverIn(MouseEvent mouseEvent) {
        card1_rectangle.setFill(Color.web("#60648F"));
    }

    public void onCard1HoverOut(MouseEvent mouseEvent) {
        card1_rectangle.setFill(Color.web("#3D405B"));
    }

    public void onCard2HoverIn(MouseEvent mouseEvent) {
        card2_rectangle.setFill(Color.web("#60648F"));
    }

    public void onCard2HoverOut(MouseEvent mouseEvent) {
        card2_rectangle.setFill(Color.web("#3D405B"));
    }

    public void onCard3HoverIn(MouseEvent mouseEvent) {
        card3_rectangle.setFill(Color.web("#60648F"));
    }

    public void onCard3HoverOut(MouseEvent mouseEvent) {
        card3_rectangle.setFill(Color.web("#3D405B"));
    }
}