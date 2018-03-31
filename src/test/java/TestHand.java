import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHand {

    Hand hand;
    Card card;
    Card card2;

    @Before
    public void setup(){
        hand = new Hand();
        card = new Card(Suit.SPADES, Rank.ACE);

    }

    @Test
    public void valueStartsZero(){
        assertEquals(0, hand.getHandValue());
    }

}