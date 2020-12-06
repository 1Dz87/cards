package deck;

public class ThirtySixDeck extends Deck {

    @Override
    public Deck getDeck() throws NoSuchDeckFoundException {
        Deck deck = new ThirtySixDeck();
        makeCardSet();
        return deck;
    }

    @Override
    public void makeCardSet() throws NoSuchDeckFoundException {
        getCardSet().addAll(CardFactory.getInstance().makeSuit(this));
    }
}
