package com.mobita.aether.form;

import com.mobita.aether.controller.ObserverController;
import com.mobita.aether.controller.StateController;
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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;

import static com.mobita.aether.enums.Phase.*;

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
    public Circle phase_2_circle;
    public Circle phase_3_circle;
    public Circle phase_4_circle;
    public Label turn_number;
    public Label phase_state;
    public Label phase_description;
    public Label player_1_health;
    public Label player_2_health;

    public AetherWars() {
        registerWatcher();
    }

    public void render() {
        turn_number.setText("Turn " + StateController.getGamestate().getTurn().toString());

        player_1_healthbar.setProgress(StateController.getPlayer1().getHealthPoints() / 80.0);
        player_2_healthbar.setProgress(StateController.getPlayer2().getHealthPoints() / 80.0);

        player_1_health.setText(StateController.getPlayer1().getHealthPoints().toString() + "/80");
        player_2_health.setText(StateController.getPlayer2().getHealthPoints().toString() + "/80");

        switch (StateController.getGamestate().getGamePhase()) {
            case Rest -> {
                phase_1_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_2_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_3_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_4_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_state.setText("Rest Phase");
                phase_description.setText("Klik next untuk memulai permainamu!");
            }
            case Draw -> {
                phase_1_circle.setFill(javafx.scene.paint.Color.web("F2CC8F"));
                phase_2_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_3_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_4_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_state.setText("Draw Phase");
                phase_description.setText("Kamu bisa mengambil 3 kartu dari deck");
            }
            case Plan -> {
                phase_1_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_2_circle.setFill(javafx.scene.paint.Color.web("F2CC8F"));
                phase_3_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_4_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_state.setText("Plan Phase");
                phase_description.setText("Kamu bisa melakukan beberapa aksi atau tidak sama sekali");
            }
            case Attack -> {
                phase_1_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_2_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_3_circle.setFill(javafx.scene.paint.Color.web("F2CC8F"));
                phase_4_circle.setFill(javafx.scene.paint.Color.web("C4C4C4"));
                phase_state.setText("Attack Phase");
                phase_description.setText("Kamu bisa menyerang karakter lawan");
            }
            case End -> {
                phase_1_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_2_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_3_circle.setFill(javafx.scene.paint.Color.web("7EAA9F"));
                phase_4_circle.setFill(javafx.scene.paint.Color.web("F2CC8F"));
                phase_state.setText("End Phase");
                phase_description.setText("Giliranmu berakhir");
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
        Rectangle r = (Rectangle) p.getChildren().get(0);
        Color color = (Color) r.getFill();
        Color baru = color;

        if (color.equals(Color.web("4C8066"))) {
            baru = Color.web("7EAA9F");
        } else if (color.equals(Color.web("A63230"))) {
            baru = Color.web("D9423F");
        } else if (color.equals(Color.web("3D405B"))) {
            baru = Color.web("60648F");
        }

        r.setFill(baru);
    }

    @FXML
    void exitedCard(MouseEvent event) {
        AnchorPane p = (AnchorPane) event.getSource();
        Rectangle r = (Rectangle) p.getChildren().get(0);
        Color color = (Color) r.getFill();
        Color baru = color;

        if (color.equals(Color.web("7EAA9F"))) {
            baru = Color.web("4C8066");
        } else if (color.equals(Color.web("D9423F"))) {
            baru = Color.web("A63230");
        } else if (color.equals(Color.web("60648F"))) {
            baru = Color.web("3D405B");
        }

        r.setFill(baru);
    }

    @FXML
    void onClickDeleteButton(MouseEvent event) {

    }

    @FXML
    void onClickNextButton(MouseEvent event) {
        switch (StateController.getGamestate().getGamePhase()) {
            case Rest -> {
                StateController.getGamestate().setGamePhase(Draw);
            }
            case Draw -> {
                StateController.getGamestate().setGamePhase(Plan);
            }
            case Plan -> {
                StateController.getGamestate().setGamePhase(Attack);
            }
            case Attack -> {
                StateController.getGamestate().setGamePhase(End);
            }
            case End -> {
                StateController.getGamestate().setGamePhase(Rest);
                StateController.getGamestate().setTurn(StateController.getGamestate().getTurn() + 1);
                ObserverController.notifyEvent("open-draw", null);
            }
        }
        render();
    }

    @FXML
    void onClickTradeButton(MouseEvent event) {

    }

    @FXML
    void onClickedPlayer(MouseEvent event) {

    }

    public void onClickedBoard(MouseEvent mouseEvent) {
        AnchorPane p = (AnchorPane) mouseEvent.getSource();
        ObserverController.notifyEvent("board-click", new IdMessage(p.getId()));
    }

    public void onClickedHand(MouseEvent mouseEvent) {
        AnchorPane p = (AnchorPane) mouseEvent.getSource();
        ObserverController.notifyEvent("hand-click", new IdMessage(p.getId()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        render();
        ObserverController.notifyEvent("open-draw", null);
    }

    public void onClickedDeleteHand(MouseEvent mouseEvent) {

    }
}