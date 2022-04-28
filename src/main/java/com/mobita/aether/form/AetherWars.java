package com.mobita.aether.form;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Field;
import java.util.Map;

public class AetherWars {
    public AnchorPane player1_board1;

    private AnchorPane getAnchorPaneById(String id) throws IllegalAccessException {
        try{
            Field f = getClass().getDeclaredField(id);
            return (AnchorPane) f.get(this);
        }catch (NoSuchFieldException err){
            return null;
        }
    }

    @FXML
    void enteredCard(MouseEvent event) {

        AnchorPane p = (AnchorPane) event.getSource();
        ((Rectangle) p.getChildren().get(0)).setFill(javafx.scene.paint.Color.RED);

        System.out.println(p.getId());
    }

    @FXML
    void exitedCard(MouseEvent event) {
        AnchorPane p = (AnchorPane) event.getSource();
        ((Rectangle) p.getChildren().get(0)).setFill(javafx.scene.paint.Color.BLUE);
    }

    @FXML
    void inHoveredPlayer1(MouseEvent event) {

    }

    @FXML
    void inHoveredPlayer2(MouseEvent event) {

    }

    @FXML
    void onClickDeleteButton(MouseEvent event) {

    }

    @FXML
    void onClickNextButton(MouseEvent event) {

    }

    @FXML
    void onClickTradeButton(MouseEvent event) {

    }

    @FXML
    void onClickedCard(MouseEvent event) {

    }

    @FXML
    void onClickedDeleteHand1(MouseEvent event) {

    }

    @FXML
    void onClickedDeleteHand2(MouseEvent event) {

    }

    @FXML
    void onClickedDeleteHand3(MouseEvent event) {

    }

    @FXML
    void onClickedDeleteHand4(MouseEvent event) {

    }

    @FXML
    void onClickedDeleteHand5(MouseEvent event) {

    }

    @FXML
    void onClickedPlayer1(MouseEvent event) {

    }

    @FXML
    void onClickedPlayer2(MouseEvent event) {

    }

    @FXML
    void outHoveredPlayer1(MouseEvent event) {

    }

    @FXML
    void outHoveredPlayer2(MouseEvent event) {

    }

}