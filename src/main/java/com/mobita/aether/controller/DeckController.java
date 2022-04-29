package com.mobita.aether.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DeckController {
    private static final Stage stage;

    static {
        FXMLLoader fxmlLoader = new FXMLLoader(DeckController.class.getResource("/com/mobita/aether/form/Selector.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 661, 399);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage = new Stage();
        stage.setTitle("Deck Selector");
        stage.setScene(scene);
    }

    public static void showDeck() {
        stage.show();
    }

    public static void closeDeck() {
        stage.close();
    }
}
