package com.mobita.aether.form;

import com.mobita.aether.model.Card;
import com.mobita.aether.model.Character;
import com.mobita.aether.model.Type;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.io.Console;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DeckSelector {
    public AnchorPane card1;
    public Rectangle card1_rectangle;
    public Text card1_title;
    public Text card1_heart;
    public Text card1_attack;
    public ImageView card1_img;
    public AnchorPane card2;
    public Rectangle card2_rectangle;
    public Text card2_title;
    public Text card2_heart;
    public Text card2_attack;
    public ImageView card2_img;
    public AnchorPane card3;
    public Rectangle card3_rectangle;
    public Text card3_title;
    public Text card3_heart;
    public Text card3_attack;
    public ImageView card3_img;

    private Map<String, Character> dataKartu;

    public DeckSelector(){
        super();
        dataKartu = new HashMap<>();
        dataKartu.put("card1", new Character("Zombi", "Ini adalah zombie", Type.OVERWORLD));
        dataKartu.put("card2", new Character("Ghast", "Ini adalah Ghast", Type.OVERWORLD));
        dataKartu.put("card3", new Character("Kuda", "Ini adalah Kuda", Type.OVERWORLD));
    }

    @FXML
    public void onCardClicked(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException {
        Image img = new Image("/com/mobita/aether/card/image/character/Villager.png");
        AnchorPane src = (AnchorPane) mouseEvent.getSource();

        Field f = getClass().getDeclaredField(src.getId()+"_img");
        ImageView iv = (ImageView) f.get(this);
        iv.setImage(img);

        Character ch = dataKartu.get(src.getId());
        System.out.println(ch.toString());
    }

    public void onCardHoverIn(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException {
        AnchorPane ap = (AnchorPane) mouseEvent.getSource();

        Field f = getClass().getDeclaredField(ap.getId()+"_rectangle");
        Rectangle r = (Rectangle) f.get(this);

        r.setFill(Color.web("#60648F"));
    }

    public void onCardHoverOut(MouseEvent mouseEvent) throws NoSuchFieldException, IllegalAccessException {
        AnchorPane ap = (AnchorPane) mouseEvent.getSource();

        Field f = getClass().getDeclaredField(ap.getId()+"_rectangle");
        Rectangle r = (Rectangle) f.get(this);

        r.setFill(Color.web("#3D405B"));
    }

}
