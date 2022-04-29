package com.mobita.aether.collection;

import com.mobita.aether.model.*;

import java.util.*;


public class Deck implements ICardCollection{
    ArrayList<Card> content;
    private final int MAX_CARD_DECK = 60;
    private final int MIN_CARD_DECK = 40;
    private int remainingCard;
    private int maxCard;

    public Deck(List<Mobs> listOfMobs, List<SpellMorph> listOfSpellMorph, List<SpellPotion> listOfSpellPotion, List<SpellSwap> listOfSpellSwap){
        this.content = new ArrayList<>();
        this.maxCard = new Random().nextInt((MAX_CARD_DECK-MIN_CARD_DECK) + 1) + MIN_CARD_DECK;
        int potionCount = 10*maxCard/40;
        int swapCount = 8*maxCard/40;
        int levelCount = 4*maxCard/40;
        int morphCount = 2*maxCard/40;


        for(int i=0; i<potionCount; i++){
            int id = new Random().nextInt(listOfSpellPotion.size());
            content.add(listOfSpellPotion.get(id));
        }

        for(int i=0; i<swapCount; i++){
            int id = new Random().nextInt(listOfSpellSwap.size());
            content.add(listOfSpellSwap.get(id));
        }

        for(int i=0; i<levelCount; i++){
            boolean id = new Random().nextBoolean();
            content.add(new SpellLevel("Level Potion", "Menambah level pemain", id));
        }
        for(int i=0; i<morphCount; i++){
            int id = new Random().nextInt(listOfSpellMorph.size());
            content.add(listOfSpellMorph.get(id));
        }
        while(content.size()<this.maxCard){
            int id = new Random().nextInt(listOfMobs.size());
            content.add(listOfMobs.get(id));
        }

        this.remainingCard = this.maxCard;
        Collections.shuffle(this.content);
    }

    public List<Integer> getTopId() {
        List<Integer> res = new ArrayList<>();

        int i = 0;
        while (i < 3 && i < this.remainingCard){
            int id = new Random().nextInt(this.remainingCard);
            res.add(id);
            i++;
        }

        return res;
    }

    public Card get(int id){
        return this.content.get(id);
    }

    public Card delete(int id){
        Card deleted = this.content.get(id);
        this.content.remove(id);
        this.remainingCard--;
        return deleted;
    }

    public int getRemainingCard(){
        return this.remainingCard;
    }


    public int getMaxCard() {
        return this.maxCard;
    }


}
