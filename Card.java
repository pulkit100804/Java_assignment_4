public class Card {
    String rank, suit;

    // Constructor to initialize a card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Method to print a single card
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }
}
