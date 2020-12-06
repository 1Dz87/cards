package deck;

public abstract class Card {

    private CardNominal nominal;

    public Card(CardNominal nominal) {
        this.nominal = nominal;
    }

    public CardNominal getNominal() {
        return nominal;
    }
}
