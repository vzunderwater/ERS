package com.ers.game.gameobjects;

import com.ers.game.gameobjects.Card;
import com.badlogic.gdx.utils.Array;

/**
 * Created by clemus on 6/11/2015.
 */
public class Hand {

     private Array<Card> hand;
    /**
     * Constructor. Create a hand object that is initially empty
     */
    public Hand(){
        hand = new Array<Card>();
    }
    /**
     * Discard all cards from hand
     */
    public void clear(){
        hand.clear();
    }
    /**
     * Add a card to had
     *
     * @param c the non-null card to add to deck
     * @throws java.lang.NullPointerException if the parameter is null
     */
    public void addCard(Card c){
        if(c == null)
            throw new NullPointerException("Can't add a null card to a hand.");
        hand.add(c);
    }
    /**
     * If the card specified is in the hand it is removed.
     * (Progammer Note: May not need this since always taking from top of stack)
     * @param c the non-null card to remove.  If c is not found, nothing is done
     */
    public void removeCard(Card c){
        if(hand.contains(c,false)){
          hand.removeValue(c,false);
        }
    }

    /**
     * The game takes the top card of the deck to place in center stack
     * Remove the top of the deck, in this case the first card of hand
     * @return the first card of the array
     */
    public Card getFirstCard(){
       Card c = hand.first();
       this.removeCard(c);
       return c;
    }

    /**
     * @return: the amount of cards left in the hand
     */
    public int getCount(){
        return hand.size;
    }
}
