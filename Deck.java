import java.util.Random;

public class Deck {
    Card[] cards = new Card[52]; // Array to store 52 cards
    int count = 0; // Number of cards added

    // Constructor to create the deck
    public Deck() {
        createDeck();
    }
}
