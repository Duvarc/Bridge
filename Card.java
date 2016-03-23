public class Card implements Comparable<Card> {

	private int suit;
	private int rank;

	//See Utils for converting the int representation of an suit to a string.
	//All ranks from 2-10 are equivalent to their int representation. Jack-Ace is 11-14, respsectively.	

	public Card(int suit, int rank) {
		if (rank == 1) {
			rank = 14;
		}

		this.suit = suit;
		this.rank = rank;
	}

	public Card(String suit, int rank) {
		if (rank == 1) {
			rank = 14;
		}
		
		this.suit = Utils.suitToInt(suit);
		this.rank = rank;
	}

	public Card(String suit, String rank) {
		this.suit = Utils.suitToInt(suit);
		this.rank = Utils.rankToInt(rank);
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
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
		return rank + " of " + Utils.getSuitWord(getSuit());
	}
}