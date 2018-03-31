import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestGame {

        Deck deck;
        Player player1;
        Player player2;
        ArrayList<Player> players;
        Game game;
        Ui ui;

        @Before
        public void before(){
            ui = new Ui();
            player1 = new Player("Player 1", new Hand());
            player2 = new Player("Player 2", new Hand());
            players = new ArrayList<>();
            players.add(player1);
            players.add(player2);
            deck = new Deck();
            ui = new Ui();
            game = new Game(ui, deck, players);
        }


        @Test
        public void checkDeal(){
            game.deal();
            assertEquals(2, player1.getHand().getNumberOfCards());
            assertEquals(2, player2.getHand().getNumberOfCards());
        }

        @Test
        public void player1Wins(){
            player1.addCardToHand(new Card(Suit.SPADES, Rank.ACE));
            player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.EIGHT));
            Player winner = game.checkWinner();
            assertEquals("Player 1", winner.getName());
        }

        @Test
        public void player2Wins(){
            player1.addCardToHand(new Card(Suit.SPADES, Rank.EIGHT));
            player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.ACE));
            Player winner = game.checkWinner();
            assertEquals("Player 2", winner.getName());
        }

        @Test
        public void checkDraw(){
           player1.addCardToHand(new Card(Suit.CLUBS, Rank.ACE));
           player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.ACE));
           Player winner = game.checkWinner();
           assertEquals(null, winner);
        }

}
