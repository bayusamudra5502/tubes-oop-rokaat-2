package com.mobita.aether;

import com.mobita.aether.collection.Deck;
import com.mobita.aether.controller.StateController;
import com.mobita.aether.enums.MobType;
import com.mobita.aether.model.*;
import com.mobita.aether.util.CSVReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class AetherWars extends Application {
    private static final String MOBS_CSV_FILE_PATH = "card/data/character.csv";
    private static final String SPELL_MORPH_CSV_FILE_PATH = "card/data/spell_morph.csv";
    private static final String SPELL_POTION_CSV_FILE_PATH = "card/data/spell_ptn.csv";
    private static final String SPELL_SWAP_CSV_FILE_PATH = "card/data/spell_swap.csv";

    public static void main(String[] args) {
        launch();
//        loadCards();
//        initCards();
    }

    private List<String[]> loadCard(String path, String prefix) throws IOException{
        InputStream s = getClass().getResourceAsStream(path);

        File CSVFile = File.createTempFile(prefix, ".csv");
        Files.copy(s, CSVFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        CSVReader reader = new CSVReader(CSVFile, "\t");
        reader.setSkipHeader(true);
        return reader.read();
    }

    public void initCards() throws IOException {
        List<String[]> mobsRows = loadCard(MOBS_CSV_FILE_PATH, "character");
        List<String[]> spellMorphRows = loadCard(SPELL_MORPH_CSV_FILE_PATH, "spell_morph");
        List<String[]> spellPotionRows = loadCard(SPELL_POTION_CSV_FILE_PATH, "spell_ptn");
        List<String[]> spellSwapRows = loadCard(SPELL_SWAP_CSV_FILE_PATH, "spell_swap");

        List<Card> listOfCards = new ArrayList<>();
        List<Mobs> listOfMobs = new ArrayList<>();
        List<SpellMorph> listOfSpellMorph = new ArrayList<>();
        List<SpellPotion> listOfSpellPotion = new ArrayList<>();
        List<SpellSwap> listOfSpellSwap = new ArrayList<>();
        for (String[] row : mobsRows) {
            if(MobType.valueOf(row[2]) == MobType.END){
                listOfMobs.add(new End(row[1],
                        row[3],
                        row[4],
                        Integer.parseInt(row[5]),
                        Integer.parseInt(row[6]),
                        Integer.parseInt(row[8]),
                        Integer.parseInt(row[9]),
                        Integer.parseInt(row[7]))
                );
            }
            else if(MobType.valueOf(row[2]) == MobType.NETHER){

                listOfMobs.add(new Nether(row[1],
                        row[3],
                        row[4],
                        Integer.parseInt(row[5]),
                        Integer.parseInt(row[6]),
                        Integer.parseInt(row[8]),
                        Integer.parseInt(row[9]),
                        Integer.parseInt(row[7]))
                );
            }
            else{
                listOfMobs.add(new Overworld(row[1],
                        row[3],
                        row[4],
                        Integer.parseInt(row[5]),
                        Integer.parseInt(row[6]),
                        Integer.parseInt(row[8]),
                        Integer.parseInt(row[9]),
                        Integer.parseInt(row[7]))
                );
            }
            listOfCards.add(listOfMobs.get(listOfMobs.size()-1));
        }

        for (String[] row : spellMorphRows){
            int id = Integer.parseInt(row[4]);
            listOfSpellMorph.add(new SpellMorph(row[1],
                    row[2],
                    Integer.parseInt(row[5]),
                    row[3],
                    listOfMobs.get(id-1))
            );
            listOfCards.add(listOfSpellMorph.get(listOfSpellMorph.size()-1));
        }

        for (String[] row: spellPotionRows){
            listOfSpellPotion.add(new SpellPotion(row[1],
                    row[2],
                    row[3],
                    Integer.parseInt(row[6]),
                    Integer.parseInt(row[4]),
                    Integer.parseInt(row[5]),
                    Integer.parseInt(row[7]))
            );
            listOfCards.add(listOfSpellPotion.get(listOfSpellPotion.size()-1));
        }

        for(String[] row: spellSwapRows){
            listOfSpellSwap.add(new SpellSwap(row[1],
                    row[2],
                    row[3],
                    Integer.parseInt(row[5]),
                    Integer.parseInt(row[4]))
            );
            listOfCards.add(listOfSpellSwap.get(listOfSpellSwap.size()-1));
        }

        Deck deck1 = new Deck(listOfMobs, listOfSpellMorph, listOfSpellPotion, listOfSpellSwap);
        Deck deck2 = new Deck(listOfMobs, listOfSpellMorph, listOfSpellPotion, listOfSpellSwap);

        StateController.insertDeck(deck1, deck2);
    }

    public void start(Stage stage) throws IOException {
        initCards();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("form/AetherWars.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 760);
        stage.setTitle("Mobita Aether");
        stage.setScene(scene);
        stage.show();
    }
}
