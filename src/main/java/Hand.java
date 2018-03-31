import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private int value;


    public Hand() {
        this.cards = new ArrayList<Card>();
        value = 0;
    }

    public int getHandValue() {
        return this.value;
    }
}
