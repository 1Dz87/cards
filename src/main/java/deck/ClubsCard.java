package deck;

public class ClubsCard extends Card {

    private final String name = "Крести";

    public ClubsCard(CardNominal nominal) {
        super(nominal);
    }

    public String getName() {
        return getNominal() + " " + name;
    }
}
