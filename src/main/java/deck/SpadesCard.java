package deck;

public class SpadesCard extends Card {

    private final String name = "Пики";

    public SpadesCard(CardNominal nominal) {
        super(nominal);
    }

    public String getName() {
        return getNominal() + " " + name;
    }
}
