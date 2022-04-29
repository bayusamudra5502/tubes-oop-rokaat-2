package com.mobita.aether.form;

import com.mobita.aether.collection.Deck;
import com.mobita.aether.controller.ObserverController;
import com.mobita.aether.controller.StateController;
import com.mobita.aether.enums.CardType;
import com.mobita.aether.message.IMessage;
import com.mobita.aether.message.IWatcher;
import com.mobita.aether.model.Card;
import com.mobita.aether.model.Mobs;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Pair;

import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class DeckSelector implements Initializable {
    private final Map<String, Pair<Integer, Card>> dataKartu;
    public AnchorPane card1;
    public Rectangle card1_rectangle;
    public Text card1_title;
    public Text card1_heart;
    public Text card1_attack;
    public ImageView card1_img;
    public AnchorPane card2;
    public AnchorPane card3;


    public DeckSelector() {
        super();
        dataKartu = new HashMap<>();
    }

    public void setCard(String id, Card c) throws NoSuchFieldException, URISyntaxException, IllegalAccessException {
        Field f = DeckSelector.class.getDeclaredField(id);
        AnchorPane p = (AnchorPane) f.get(this);

        Rectangle r = (Rectangle) p.getChildren().get(0);
        r.setVisible(true);
        p.getChildren().get(1).setVisible(true);


        if (c.getCardType() == CardType.MOBS) {
            Mobs m = (Mobs) c;

            switch (m.getMobType()) {
                case OVERWORLD -> {
                    r.setFill(Color.web("4C8066"));
                }
                case NETHER -> {
                    r.setFill(Color.web("A63230"));
                }
                default -> {
                    r.setFill(Color.web("3D405B"));
                }
            }
        } else {
            r.setFill(Color.web("3D405B"));
        }

        AnchorPane status = (AnchorPane) p.getChildren().get(1);
        ((Text) status.getChildren().get(0)).setText(c.getCardName());
        Image i = new Image(Objects.requireNonNull(getClass().getResource("/com/mobita/aether/" + c.getImageURL())).toURI().toString());

        HBox a = (HBox) status.getChildren().get(1);
        ((ImageView) a.getChildren().get(0)).setImage(i);

        AnchorPane ap = (AnchorPane) status.getChildren().get(2);

        if (c.getCardType() == CardType.MOBS) {
            ap.setVisible(true);
            Mobs m = (Mobs) c;
            ((Text) ap.getChildren().get(0)).setText(m.getBaseHealth().toString());
            ((Text) ap.getChildren().get(2)).setText(m.getBaseAttack().toString());
        } else {
            ap.setVisible(false);
        }
    }

    public void hideCard(String id) throws NoSuchFieldException, IllegalAccessException {
        Field f = DeckSelector.class.getDeclaredField(id);
        AnchorPane p = (AnchorPane) f.get(this);
        Rectangle r = (Rectangle) p.getChildren().get(0);
        r.setVisible(true);

        r.setFill(Color.web("95624C"));
        p.getChildren().get(1).setVisible(false);
    }

    @FXML
    public void onCardClicked(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException, URISyntaxException {
        AnchorPane src = (AnchorPane) mouseEvent.getSource();

        Pair<Integer, Card> p = this.dataKartu.get(src.getId());
        Deck d = StateController.getCurrentPlayer().getDeck();
        // TODO: Hapus dan kasih intterupt
    }

    public void onCardHoverIn(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException {
        AnchorPane ap = (AnchorPane) mouseEvent.getSource();
        Rectangle r = (Rectangle) ap.getChildren().get(0);

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

    public void onCardHoverOut(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException {
        AnchorPane ap = (AnchorPane) mouseEvent.getSource();

        Rectangle r = (Rectangle) ap.getChildren().get(0);

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

    public void render() throws NoSuchFieldException, IllegalAccessException, URISyntaxException {
        for (int i = 1; i <= 3; i++) {
            hideCard("card" + i);
        }

        int i = 1;
        for (Map.Entry<String, Pair<Integer, Card>> e : this.dataKartu.entrySet()) {
            setCard(e.getKey(), e.getValue().getValue());
        }
    }

    public void fetchData() {
        Deck d = StateController.getCurrentPlayer().getDeck();
        List<Integer> l = d.getTopId();
        int cnt = 1;
        for (Integer i : l) {
            String name = "card" + cnt;
            Card kartu = d.get(i);
            dataKartu.put(name, new Pair<>(i, kartu));
            cnt++;
        }

        try {
            render();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObserverController.registerWatcher("reload-selector", new IWatcher<Object>() {
            @Override
            public void notify(IMessage<Object> message) {
                fetchData();
            }
        });

        fetchData();
    }
}
