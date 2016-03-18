public class Hand {

	private int size;
	private int value;

	/*private ArrayList<Card> CLUBS;
	private ArrayList<Card> DIAMONDS;
	private ArrayList<Card> HEARTS;
	private ArrayList<Card> SPADES;*/

	private new ArrayList<Card> hand;

	public Hand() {
		/*CLUBS = new ArrayList<Card>(13);
		DIAMONDS = new ArrayList<Card>(13);
		HEARTS = new ArrayList<Card>(13);
		SPADES = new ArrayList<Card>(13); */

		hand = new ArrayList<Card>(13);

		/*hand.add(CLUBS);
		hand.add(DIAMONDS);
		hand.add(HEARTS);
		hand.add(SPADE);*/

	}

	public void add(Card card) {
		hand.add(card);
	}

	public void play(Card card) {

	}

	public void sort() {
		//Sort by suit


		//Sort by rank
	}
}