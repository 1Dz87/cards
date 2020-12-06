package games;

import deck.Card;
import deck.Deck;
import player.PlayerHand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwentyOneGame {

    private Deck deck;

    private PlayerHand player;

    private Queue<Card> queue;

    private boolean isNewGame = true;

    private final String EXIT = "exit";

    private final String MORE = "m";

    private final String PASS = "p";

    public void run(Deck deck, PlayerHand player) {
        this.deck = deck;
        this.player = player;
        queue = new LinkedList<>(deck.getCardSet());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String s = reader.readLine();
                if (s.equals(EXIT)) {
                    break;
                }
                if (isNewGame) {
                    giveCard(2);
                    isNewGame = false;
                }
                if (s.equals(MORE)) {
                    giveCard(1);
                }
                if (s.equals(PASS)) {

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void giveCard(int q) {
        for (int i = 0; i < q; i++) {
            player.getHand().add(queue.poll());
        }
    }
}
