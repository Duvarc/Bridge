public class Deck {

	private Card[] deck;
	public Deck() {
		deck = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				deck[index] = new Card(suit, rank);
				index++
			}
		}
	}
}