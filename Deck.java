import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>(52);
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card get(int index) {
		return deck.get(index);
	}

	public void printContents() {
		for (Card x : deck) {
			System.out.println(x);
		}
	}
}