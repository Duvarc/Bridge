import java.util.ArrayList;

public class Hand {

	private int size;

	private ArrayList<Card> Clubs;
	private ArrayList<Card> Diamonds;
	private ArrayList<Card> Hearts;
	private ArrayList<Card> Spades;

	public ArrayList<ArrayList<Card>> hand;

	public Hand() {

		Clubs = new ArrayList<Card>(13);
		Diamonds = new ArrayList<Card>(13);
		Hearts = new ArrayList<Card>(13);
		Spades = new ArrayList<Card>(13);

		hand = new ArrayList<ArrayList<Card>>(4);

		hand.add(Clubs);
		hand.add(Diamonds);
		hand.add(Hearts);
		hand.add(Spades);
	}

	public Hand(Card[] data) {

		Clubs = new ArrayList<Card>(13);
		Diamonds = new ArrayList<Card>(13);
		Hearts = new ArrayList<Card>(13);
		Spades = new ArrayList<Card>(13);

		hand = new ArrayList<ArrayList<Card>>(4);

		for (int i = 0; i < data.length; i++) {
			hands.get(data[i].getSuit()).add(data[i]);
		}
	}

	public ArrayList<Card> getClubs() {
		return Clubs;
	}

	public ArrayList<Card> getDiamonds() {
		return Diamonds;
	}

	public ArrayList<Card> getHearts() {
		return Hearts;
	}

	public ArrayList<Card> getSpades() {
		return Spades;
	}


	public int numClubs() {
		return Clubs.size();
	}

	public int numDiamonds() {
		return Diamonds.size();
	}

	public int numHearts() {
		return Hearts.size();
	}

	public int numSpades() {
		return Spades.size();
	}

	public void add(Card card) {
		suit = card.suit;

		hand.get(suit).add(card);
	}

	public void sort() {
		for (int i = 0; )
	}
}