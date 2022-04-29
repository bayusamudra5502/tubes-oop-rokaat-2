package com.mobita.aether.form;

import com.mobita.aether.controller.DeckController;
import com.mobita.aether.controller.ObserverController;
import com.mobita.aether.controller.StateController;
import com.mobita.aether.message.IMessage;
import com.mobita.aether.message.IWatcher;
import com.mobita.aether.message.type.IdMessage;
import com.mobita.aether.model.Card;
import com.mobita.aether.model.Mobs;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextFlow;

import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.mobita.aether.enums.Phase.*;

public class AetherWars implements Initializable {
    @FXML
    private Label attack_card_A1;

    @FXML
    private Label attack_card_A2;

    @FXML
    private Label attack_card_B1;

    @FXML
    private Label attack_card_B2;

    @FXML
    private Label attack_card_C1;

    @FXML
    private Label attack_card_C2;

    @FXML
    private Label attack_card_D1;

    @FXML
    private Label attack_card_D2;

    @FXML
    private Label attack_card_E1;

    @FXML
    private Label attack_card_E2;

    @FXML
    private AnchorPane deck_button;

    @FXML
    private Label deck_counter;

    @FXML
    private AnchorPane delete_button;

    @FXML
    private Label delete_button_hand_1;

    @FXML
    private Label delete_button_hand_2;

    @FXML
    private Label delete_button_hand_3;

    @FXML
    private Label delete_button_hand_4;

    @FXML
    private Label delete_button_hand_5;

    @FXML
    private Label description_hand_1;

    @FXML
    private Label description_hand_2;

    @FXML
    private Label description_hand_3;

    @FXML
    private Label description_hand_4;

    @FXML
    private Label description_hand_5;

    @FXML
    private AnchorPane hand_card1;

    @FXML
    private AnchorPane hand_card2;

    @FXML
    private AnchorPane hand_card3;

    @FXML
    private AnchorPane hand_card4;

    @FXML
    private AnchorPane hand_card5;

    @FXML
    private Label health_card_A1;

    @FXML
    private Label health_card_A2;

    @FXML
    private Label health_card_B1;

    @FXML
    private Label health_card_B2;

    @FXML
    private Label health_card_C1;

    @FXML
    private Label health_card_C2;

    @FXML
    private Label health_card_D1;

    @FXML
    private Label health_card_D2;

    @FXML
    private Label health_card_E1;

    @FXML
    private Label health_card_E2;

    @FXML
    private Label hovered_card_description;

    @FXML
    private TextFlow hovered_card_info;

    @FXML
    private ImageView image_card_A1;

    @FXML
    private ImageView image_card_A2;

    @FXML
    private ImageView image_card_B1;

    @FXML
    private ImageView image_card_B2;

    @FXML
    private ImageView image_card_C1;

    @FXML
    private ImageView image_card_C2;

    @FXML
    private ImageView image_card_D1;

    @FXML
    private ImageView image_card_D2;

    @FXML
    private ImageView image_card_E1;

    @FXML
    private ImageView image_card_E2;

    @FXML
    private ImageView image_hand_2;

    @FXML
    private ImageView image_hand_1;

    @FXML
    private ImageView image_hand_3;

    @FXML
    private ImageView image_hand_4;

    @FXML
    private ImageView image_hand_5;

    @FXML
    private ImageView image_hovered_card;

    @FXML
    private Label level_card_A1;

    @FXML
    private Label level_card_A2;

    @FXML
    private Label level_card_B1;

    @FXML
    private Label level_card_B2;

    @FXML
    private Label level_card_C1;

    @FXML
    private Label level_card_C2;

    @FXML
    private Label level_card_D1;

    @FXML
    private Label level_card_D2;

    @FXML
    private Label level_card_E1;

    @FXML
    private Label level_card_E2;

    @FXML
    private Label mana_hand_1;

    @FXML
    private Label mana_hand_2;

    @FXML
    private Label mana_hand_3;

    @FXML
    private Label mana_hand_4;

    @FXML
    private Label mana_hand_5;

    @FXML
    private AnchorPane next_button;

    @FXML
    private Circle phase_1_circle;

    @FXML
    private Circle phase_2_circle;

    @FXML
    private Circle phase_3_circle;

    @FXML
    private Circle phase_4_circle;

    @FXML
    private Label phase_description;

    @FXML
    private Label phase_state;

    @FXML
    private AnchorPane player1_card1;

    @FXML
    private AnchorPane player1_card2;

    @FXML
    private AnchorPane player1_card3;

    @FXML
    private AnchorPane player1_card4;

    @FXML
    private AnchorPane player1_card5;

    @FXML
    private AnchorPane player2_card1;

    @FXML
    private AnchorPane player2_card2;

    @FXML
    private AnchorPane player2_card3;

    @FXML
    private AnchorPane player2_card4;

    @FXML
    private AnchorPane player2_card5;

    @FXML
    private ImageView player_1_head_img;

    @FXML
    private Label player_1_health;

    @FXML
    private ProgressBar player_1_healthbar;

    @FXML
    private Label player_1_name;

    @FXML
    private Label player_2_health;

    @FXML
    private ProgressBar player_2_healthbar;

    @FXML
    private Label player_2_name;

    @FXML
    private Label player_mana;

    @FXML
    private AnchorPane trade_button;

    @FXML
    private Label turn_number;


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

        ObserverController.registerWatcher("card-hover", new IWatcher<String>() {
            @Override
            public void notify(IMessage<String> message) throws URISyntaxException {
                String res;
                if (message.getMessage().startsWith("player_")) {
                    if (StateController.getBoard().get(message.getMessage()) == null) {
                        image_hovered_card.setImage(null);
                        return;
                    }
                    String name = "/com/mobita/aether/" + StateController.getBoard().get(message.getMessage()).getImageURL();
                    res = Objects.requireNonNull(getClass().getResource(name)).toURI().toString();
                } else {
                    if (StateController.getCurrentPlayer().getHand().get(message.getMessage()) == null) {
                        image_hovered_card.setImage(null);
                        return;
                    }
                    String name = "/com/mobita/aether/" + StateController.getCurrentPlayer().getHand().get(message.getMessage()).getImageURL();
                    res = Objects.requireNonNull(getClass().getResource(name)).toURI().toString();
                }
                Image img = new Image(res);
                image_hovered_card.setImage(img);
            }
        });

        ObserverController.registerWatcher("card-exit-hover", new IWatcher<String>() {
            @Override
            public void notify(IMessage<String> message) {

            }
        });

        ObserverController.registerWatcher("open-draw", new IWatcher<Object>() {
            @Override
            public void notify(IMessage<Object> message) {
                ObserverController.notifyEvent("reload-selector", null);
                DeckController.showDeck();
            }
        });

        ObserverController.registerWatcher("selected-card", new IWatcher<Card>() {
            @Override
            public void notify(IMessage<Card> message) {
                DeckController.closeDeck();
                System.out.println(message.getMessage().getCardName());

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

        ObserverController.notifyEvent("card-hover", new IdMessage(p.getId()));
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
        ObserverController.notifyEvent("card-exit-hover", null);
    }

    @FXML
    void onClickDeleteButton(MouseEvent event) {

    }

    @FXML
    void onClickNextButton(MouseEvent event) {
        switch (StateController.getGamestate().getGamePhase()) {
            case Rest -> {
                StateController.getGamestate().setGamePhase(Draw);
                ObserverController.notifyEvent("open-draw", null);
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

                if (StateController.getGamestate().getTurn() % 2 == 0) {
                    StateController.setCurrentPlayer(StateController.getPlayer2());
                } else {
                    StateController.setCurrentPlayer(StateController.getPlayer1());
                }
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


        redrawGame();

    }


    public void redrawBordsCard(String id, int suffix, String url, int attack, int health, String level) {
        try {
            if (id.startsWith("player1_")) {
                char convertedChar = (char) (suffix + 'A');
                String img = "image_card_" + convertedChar + "1";
                String atk = "attack_card_" + suffix + "1";
                String hlth = "health_card_" + suffix + "1";
                String lvl = "level_card_" + +suffix + "1";
                Field fimg = getClass().getDeclaredField(img);
                ImageView Image = (ImageView) fimg.get(this);

                Field fatk = getClass().getDeclaredField(atk);
                Label Attack = (Label) fatk.get(this);

                Field fhlth = getClass().getDeclaredField(hlth);
                Label Health = (Label) fhlth.get(this);

                Field flvl = getClass().getDeclaredField(lvl);
                Label Level = (Label) flvl.get(this);

                String name = "/com/mobita/aether/" + url;
                String res = Objects.requireNonNull(getClass().getResource(name)).toURI().toString();
                Image Img = new Image(res);
                Image.setImage(Img);
                Attack.setText(String.valueOf(attack));
                Health.setText(String.valueOf(health));
                Level.setText(level);
            } else if (id.startsWith("player_2")) {
                char convertedChar = (char) (suffix + 'A');
                String img = "image_card_" + convertedChar + "2";
                String atk = "attack_card_" + suffix + "2";
                String hlth = "health_card_" + suffix + "2";
                String lvl = "level_card_" + +suffix + "2";
                Field fimg = getClass().getDeclaredField(img);
                ImageView Image = (ImageView) fimg.get(this);

                Field fatk = getClass().getDeclaredField(atk);
                Label Attack = (Label) fatk.get(this);

                Field fhlth = getClass().getDeclaredField(hlth);
                Label Health = (Label) fhlth.get(this);

                Field flvl = getClass().getDeclaredField(lvl);
                Label Level = (Label) flvl.get(this);

                String name = "/com/mobita/aether/" + url;
                String res = Objects.requireNonNull(getClass().getResource(name)).toURI().toString();
                Image Img = new Image(res);
                Image.setImage(Img);
                Attack.setText(String.valueOf(attack));
                Health.setText(String.valueOf(health));
                Level.setText(level);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void redrawHandCard(String id, int suffix, String url, String mana, String description) {
        try {
            String img = "image_hand_" + suffix;
            String mn = "mana_hand_" + suffix;
            String desc = "description_hand_" + suffix;

            Field fimg = getClass().getDeclaredField(img);
            ImageView Image = (ImageView) fimg.get(this);

            Field fmana = getClass().getDeclaredField(mn);
            Label Mana = (Label) fmana.get(this);

            Field fdesc = getClass().getDeclaredField(desc);
            Label Desc = (Label) fdesc.get(this);

            String name = "/com/mobita/aether/" + url;
            String res = Objects.requireNonNull(getClass().getResource(name)).toURI().toString();
            Image Img = new Image(res);
            Image.setImage(Img);

            Mana.setText(mana);
            Desc.setText(description);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void redrawGame() {
        String id;
        for (int i = 1; i <= 5; i++) {
            id = "player1_card" + i;
            if (StateController.getBoard().get(id) == null) {
                try {
                    getAnchorPaneById(id).getChildren().get(1).setVisible(false);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {

                    AnchorPane p = getAnchorPaneById(id);
                    Mobs c = (Mobs) StateController.getBoard().get(id);
                    String lvl = "Level " + c.getLevel() + "(" + c.getExp() + "/" + ")";

                    redrawBordsCard(id, i - 1, c.getImageURL(), c.getBaseAttack(), c.getBaseHealth(), lvl);
                    getAnchorPaneById(id).getChildren().get(1).setVisible(true);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 1; i <= 5; i++) {
            id = "player2_card" + i;
            if (StateController.getBoard().get(id) == null) {
                try {
                    getAnchorPaneById(id).getChildren().get(1).setVisible(false);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    AnchorPane p = getAnchorPaneById(id);
                    Mobs c = (Mobs) StateController.getBoard().get(id);
                    String lvl = "Level " + c.getLevel() + "(" + c.getExp() + "/" + ")";
                    redrawBordsCard(id, i - 1, c.getImageURL(), c.getBaseAttack(), c.getBaseHealth(), lvl);
                    getAnchorPaneById(id).getChildren().get(1).setVisible(true);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 1; i <= 5; i++) {
            id = "hand_card" + i;
            if (StateController.getCurrentPlayer().getHand().get(id) == null) {
                try {
                    getAnchorPaneById(id).getChildren().get(1).setVisible(false);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    AnchorPane p = getAnchorPaneById(id);
                    Card c = StateController.getCurrentPlayer().getHand().get(id);
                    redrawHandCard(id, i, c.getImageURL(), "Mana: " + c.getMana(), "Description");
                    getAnchorPaneById(id).getChildren().get(1).setVisible(true);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void onClickedDeleteHand(MouseEvent mouseEvent) {

    }
}