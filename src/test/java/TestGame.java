import org.junit.Before;

import java.util.ArrayList;

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

}
