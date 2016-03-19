public class Card implements Comparable {

	private int suit;
	private int rank;

	//See Utils for converting the int representation of an suit to a string.
	//All ranks from 2-10 are equivalent to their int representation. Jack-Ace is 11-14, respsectively.	

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

	//Comparison in the context of bidding - this comparing doesn't work in the context of tricks
	public int compareTo(Card other) {
		thisValue = suit * 100 + rank;
		otherValue = other.suit * 100 + other.rank;

		if (thisValue > otherValue) {
			return 1;
		}
		else if (otherValue > thisValue) {
			return -1;
		}
		else {
			return 0;
		}
	}

	public String toString() {
		return rank + " of " + Utils.getSuitString(card.suit);
	}
}