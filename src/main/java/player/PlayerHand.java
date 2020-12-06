package player;

import deck.Card;

import java.util.HashSet;
import java.util.Set;

public class PlayerHand {

    private Set<Card> hand;

    public Set<Card> getHand() {
        if (hand == null) {
            hand = new HashSet<>();
        }
        return hand;
    }
}
