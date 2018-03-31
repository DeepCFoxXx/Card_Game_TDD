import org.junit.Before;

public class TestCard {

    private Card card;

    @Before
    public void setUp(){
        card = new Card(Suit.SPADES, Rank.ACE);
    }

}
