public class Hand {

	private int size;
	private int value;

	private ArrayList<Card> CLUBS;
	private ArrayList<Card> DIAMONDS;
	private ArrayList<Card> HEARTS;
	private ArrayList<Card> SPADES;

	public ArrayList<ArrayList<Card>> hand;

	private new ArrayList<Card> hand;

	public Hand() {
		CLUBS = new ArrayList<Card>(13);
		DIAMONDS = new ArrayList<Card>(13);
		HEARTS = new ArrayList<Card>(13);
		SPADES = new ArrayList<Card>(13);

		hand = new ArrayList<ArrayList<Card>>(4);

		hand.add(CLUBS);
		hand.add(DIAMONDS);
		hand.add(HEARTS);
		hand.add(SPADE);
	}

	public void add(Card card) {
		hand.get(card.suit).add(card);
	}

	public void play(Card card) {

	}

	public int pointValue() {
		int sum = 0;
	}

	public void sort() {
		//Sort by suit


		//Sort by rank
	}
}