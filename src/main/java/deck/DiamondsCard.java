package deck;

public class DiamondsCard extends Card {

    private final String name = "Бубны";

    public DiamondsCard(CardNominal nominal) {
        super(nominal);
    }

    public String getName() {
        return getNominal() + " " + name;
    }
}
