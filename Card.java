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
    
    // Create a deck of 52 cards
    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[index++] = new Card(rank, suit);
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        for (int i = 0; i < 52; i++) {
            cards[i].printCard();
        }
    }

    // Find a specific card in the deck
    public void findCard(String rank, String suit) {
        for (int i = 0; i < 52; i++) {
            if (cards[i].rank.equals(rank) && cards[i].suit.equals(suit)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not found.");
    }
      // Shuffle the deck randomly
    public void shuffleDeck() {
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int j = rand.nextInt(52);
            // Swap cards[i] and cards[j]
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        System.out.println("Deck shuffled!");
    }

    // Deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        System.out.println("Dealing 5 Random Cards:");
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(52);
            cards[index].printCard();
        }
    }
}  
