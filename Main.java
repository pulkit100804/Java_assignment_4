/* name - Pulkit Shrivastava
  * Prn - 23070126098
  * Batch - B1*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n--- Card Deck Management System ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Find a Card");
            System.out.println("3. Shuffle Deck");
            System.out.println("4. Deal 5 Random Cards");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter Rank (Ace, 2, 3, ...): ");
                    String rank = scanner.next();
                    System.out.print("Enter Suit (Hearts, Diamonds, Clubs, Spades): ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;
                case 3:
                    deck.shuffleDeck();
                    break;
                case 4:
                    deck.dealCard();
                    break;
                case 5:
                    System.out.println("Exiting Program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
