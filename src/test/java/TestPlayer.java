import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player;
    Hand hand;
    Card card;
    Card card2;

    @Before
    public void setup(){
        hand = new Hand();
        player = new Player("Kara", hand);
        card = new Card(Suit.DIAMONDS, Rank.ACE);
        card2 = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void playerHasName(){
        assertEquals("Kara", player.getName());
    }

}
