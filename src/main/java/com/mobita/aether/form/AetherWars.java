package com.mobita.aether.form;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextFlow;

public class AetherWars {
    public AnchorPane player1_deck1;
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
    private ImageView image_hand2;

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