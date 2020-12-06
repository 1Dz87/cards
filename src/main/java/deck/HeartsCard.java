package deck;

public class HeartsCard extends Card {

    private final String name = "Червы";

    public HeartsCard(CardNominal nominal) {
        super(nominal);
    }

    public String getName() {
        return getNominal() + " " + name;
    }
}
