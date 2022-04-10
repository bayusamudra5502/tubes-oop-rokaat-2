package com.mobita.aether;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.mobita.aether.model.Type;
import com.mobita.aether.model.Character;
import com.mobita.aether.util.CSVReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AetherWars extends Application {
  private static final String CHARACTER_CSV_FILE_PATH = "card/data/character.csv";

  public void loadCards() throws IOException {
    InputStream s = getClass().getResourceAsStream(CHARACTER_CSV_FILE_PATH);
    File characterCSVFile = File.createTempFile("character", ".csv");
    Files.copy(s, characterCSVFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

    CSVReader characterReader = new CSVReader(characterCSVFile, "\t");
    characterReader.setSkipHeader(true);
    List<String[]> characterRows = characterReader.read();
    for (String[] row : characterRows) {
      Character c = new Character(row[1], row[3], Type.valueOf(row[2]));
      System.out.println(c);
    }
  }

  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("form/AetherWars.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }


  public static void main(String[] args) {
    launch();
  }
}
