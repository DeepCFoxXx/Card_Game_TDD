public class Player {

    private Hand hand;
    private String name;

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }
}
