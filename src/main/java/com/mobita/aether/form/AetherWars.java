package com.mobita.aether.form;

import com.mobita.aether.controller.ObserverController;
import com.mobita.aether.controller.StateController;
import com.mobita.aether.enums.Phase;
import com.mobita.aether.message.IMessage;
import com.mobita.aether.message.IWatcher;
import com.mobita.aether.message.type.IdMessage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;

public class AetherWars implements Initializable {
    public AnchorPane player1_card1;
    public AnchorPane player1_card2;
    public AnchorPane player1_card3;
    public AnchorPane player1_card4;
    public AnchorPane player1_card5;
    public AnchorPane player2_card1;
    public AnchorPane player2_card2;
    public AnchorPane player2_card3;
    public AnchorPane player2_card4;
    public AnchorPane player2_card5;
    public ProgressBar player_1_healthbar;
    public ProgressBar player_2_healthbar;
    public ImageView player_1_head_img;
    public Label hovered_card_description;
    public Circle phase_1_circle;
    public Label turn_number;
    public Label phase_state;

    public AetherWars() {
        registerWatcher();
    }

    public void render() {
        turn_number.setText("Turn " + StateController.getGamestate().getTurn().toString());
        player_1_healthbar.setProgress(StateController.getPlayer1());
        switch (StateController.getGamestate().getGamePhase()) {
            case Draw -> {
                phase_state.setText("Draw Phase");
                ObserverController.notifyEvent("open-deck", null);
            }
            case Plan -> {
                phase_state.setText("Plan Phase");
            }
            case Attack -> {
                phase_state.setText("Attack Phase");
            }
            case End -> {
                phase_state.setText("End Phase");
            }
        }
    }

    public void registerWatcher() {
        ObserverController.registerWatcher("board-click", new IWatcher<String>() {
            @Override
            public void notify(IMessage<String> message) {
                hovered_card_description.setText("[BOARD] Id Kartu " + message.getMessage() + " terkena tekanan");
            }
        });

        ObserverController.registerWatcher("hand-click", new IWatcher<String>() {
            @Override
            public void notify(IMessage<String> message) {
                hovered_card_description.setText("[HAND] Id Kartu " + message.getMessage() + " terkena tekanan");
            }
        });
    }

    private AnchorPane getAnchorPaneById(String id) throws IllegalAccessException {
        try {
            Field f = getClass().getDeclaredField(id);
            return (AnchorPane) f.get(this);
        } catch (NoSuchFieldException err) {
            return null;
        }
    }

    @FXML
    void enteredCard(MouseEvent event) {
        AnchorPane p = (AnchorPane) event.getSource();
        ((Rectangle) p.getChildren().get(0)).setFill(javafx.scene.paint.Color.RED);
    }

    @FXML
    void exitedCard(MouseEvent event) {
        AnchorPane p = (AnchorPane) event.getSource();
        ((Rectangle) p.getChildren().get(0)).setFill(javafx.scene.paint.Color.web("7EAA9F"));
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
        StateController.getGamestate().setGamePhase(Phase.Draw);
        StateController.getGamestate().setTurn(20);
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

    public void onClickedBoard(MouseEvent mouseEvent) {
        AnchorPane p = (AnchorPane) mouseEvent.getSource();
        ObserverController.notifyEvent("board-click", new IdMessage(p.getId()));
    }

    public void onClickedHand(MouseEvent mouseEvent) {
        AnchorPane p = (AnchorPane) mouseEvent.getSource();
        ObserverController.notifyEvent("hand-click", new IdMessage(p.getId()));
    }


    public void inHoveredNextButton(MouseEvent mouseEvent) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        render();
    }
}