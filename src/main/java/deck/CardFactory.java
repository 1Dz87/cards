package deck;

import java.util.HashSet;
import java.util.Set;

public class CardFactory {

    private static CardFactory instance;

    public static CardFactory getInstance() {
        if (instance == null) {
            instance = new CardFactory();
        }
        return instance;
    }

    private CardFactory() {

    }

    public Set<Card> makeSuit(Deck deck) throws NoSuchDeckFoundException {
        if (deck instanceof ThirtySixDeck) {
            return makeThirtySixSuit();
        }
        if (deck instanceof FiftyTwoDeck) {
            return makeFiftyTwoSuit();
        }
        throw new NoSuchDeckFoundException("Тип колоды не найден");
    }

    private Set<Card> makeThirtySixSuit() {
        Set<Card> result = new HashSet<>();

        result.add(new HeartsCard(CardNominal.SIX));
        result.add(new HeartsCard(CardNominal.SEVEN));
        result.add(new HeartsCard(CardNominal.EIGHT));
        result.add(new HeartsCard(CardNominal.NINE));
        result.add(new HeartsCard(CardNominal.TEN));
        result.add(new HeartsCard(CardNominal.JACK));
        result.add(new HeartsCard(CardNominal.QUEEN));
        result.add(new HeartsCard(CardNominal.KING));
        result.add(new HeartsCard(CardNominal.ACE));

        result.add(new DiamondsCard(CardNominal.SIX));
        result.add(new DiamondsCard(CardNominal.SEVEN));
        result.add(new DiamondsCard(CardNominal.EIGHT));
        result.add(new DiamondsCard(CardNominal.NINE));
        result.add(new DiamondsCard(CardNominal.TEN));
        result.add(new DiamondsCard(CardNominal.JACK));
        result.add(new DiamondsCard(CardNominal.QUEEN));
        result.add(new DiamondsCard(CardNominal.KING));
        result.add(new DiamondsCard(CardNominal.ACE));

        result.add(new ClubsCard(CardNominal.SIX));
        result.add(new ClubsCard(CardNominal.SEVEN));
        result.add(new ClubsCard(CardNominal.EIGHT));
        result.add(new ClubsCard(CardNominal.NINE));
        result.add(new ClubsCard(CardNominal.TEN));
        result.add(new ClubsCard(CardNominal.JACK));
        result.add(new ClubsCard(CardNominal.QUEEN));
        result.add(new ClubsCard(CardNominal.KING));
        result.add(new ClubsCard(CardNominal.ACE));

        result.add(new SpadesCard(CardNominal.SIX));
        result.add(new SpadesCard(CardNominal.SEVEN));
        result.add(new SpadesCard(CardNominal.EIGHT));
        result.add(new SpadesCard(CardNominal.NINE));
        result.add(new SpadesCard(CardNominal.TEN));
        result.add(new SpadesCard(CardNominal.JACK));
        result.add(new SpadesCard(CardNominal.QUEEN));
        result.add(new SpadesCard(CardNominal.KING));
        result.add(new SpadesCard(CardNominal.ACE));
        return result;
    }

    private Set<Card> makeFiftyTwoSuit() {
        Set<Card> result = makeThirtySixSuit();

        result.add(new HeartsCard(CardNominal.TWO));
        result.add(new HeartsCard(CardNominal.THREE));
        result.add(new HeartsCard(CardNominal.FOUR));
        result.add(new HeartsCard(CardNominal.FIVE));

        result.add(new DiamondsCard(CardNominal.TWO));
        result.add(new DiamondsCard(CardNominal.THREE));
        result.add(new DiamondsCard(CardNominal.FOUR));
        result.add(new DiamondsCard(CardNominal.FIVE));

        result.add(new ClubsCard(CardNominal.TWO));
        result.add(new ClubsCard(CardNominal.THREE));
        result.add(new ClubsCard(CardNominal.FOUR));
        result.add(new ClubsCard(CardNominal.FIVE));

        result.add(new SpadesCard(CardNominal.TWO));
        result.add(new SpadesCard(CardNominal.THREE));
        result.add(new SpadesCard(CardNominal.FOUR));
        result.add(new SpadesCard(CardNominal.FIVE));
        return result;
    }

}
