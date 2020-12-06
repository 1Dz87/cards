package deck;

import java.util.Set;

public abstract class Deck {

    private Set<Card> cardSet;

    public abstract Deck getDeck() throws NoSuchDeckFoundException;

    public abstract void makeCardSet() throws NoSuchDeckFoundException;

    public Set<Card> getCardSet() {
        return cardSet;
    }

    public void setCardSet(Set<Card> cardSet) {
        this.cardSet = cardSet;
    }

    public int getSize() {
        return getCardSet().size();
    }
}
