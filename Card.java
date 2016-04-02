public class Card implements Comparable<Card> {

	private int rank;
	private int suit;

	//See Utils for converting the int representation of an suit to a string.
	//All ranks from 2-10 are equivalent to their int representation. Jack-Ace is 11-14, respsectively.	

	public Card(int rank, int suit) {
		if (rank == 1) {
			rank = 14;
		}

		this.rank = rank;
		this.suit = suit;
	}

	public Card(String rank, int suit) {
		this(Utils.rankToInt(rank), suit);
	}

	public Card(int rank, String suit) {
		this(rank, Utils.suitToInt(suit));
	}

	public Card(String rank, String suit) {
		this(Utils.rankToInt(rank), Utils.suitToInt(suit));
	}

	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}

	//Compare numerical value only
	public int compareTo(Card other) {
		int thisValue = this.rank;
		int otherValue = other.rank;

		if (thisValue > otherValue) {
			return 1;
		}
		else if (thisValue < otherValue) {
			return -1;
		}
		else {
			return 0;
		}
	}

	public String toString() {
		return Utils.rankToString(rank) + " of " + Utils.getSuitWord(getSuit());
	}
}