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

    public void addCardToHand(Card card) {
        this.hand.addCard(card);
    }

    public Object getHand() {
        return hand;
    }

    public int getHandValue() {
        return this.hand.getHandValue();
    }


}
