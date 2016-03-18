public class Card implements Comparable {

	private int suit;
	private int rank;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public int compareTo(Card other) {
		thisValue = suit * 100 + rank;
		otherValue = other.suit * 100 + other.rank;

		if (thisValue > otherValue) {
			return 1;
		}
		else {
			return -1
		}
	}
}