package com.mobita.aether.form;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AetherWars {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Banyak TUBES :D");
    }
}