import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Ui ui;

    public Game(Ui ui, Deck deck, ArrayList<Player> players) {
        this.deck = deck;
        this.players = players;
        this.ui = ui;
    }

}
