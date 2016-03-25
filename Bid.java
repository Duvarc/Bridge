public class Bid implements Comparable<Bid> {

	private int suit;
	private int rank;
	private Player player;

	public Bid(Player player, Bid bid) {
		this(bid.getSuit(), bid.getRank());
		this.player = player;
	}

	public Bid(String suit) {
		this.suit = 5;
		this.rank = 0;
	}

	public Bid(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Bid(String suit, int rank) {
		this(Utils.suitToInt(suit), rank);
	}

	public Bid(String suit, String rank) {
		this(Utils.suitToInt(suit), Utils.rankToInt(rank));
	}

	public Bid(Player player, String suit) {
		this(suit);
		this.player = player;
	}
	public Bid(Player player, int suit, int rank) {
		this(suit, rank);
		this.player = player;
	}

	public Bid(Player player, String suit, int rank) {
		this(suit, rank);
		this.player = player;
	}

	public Bid(Player player, String suit, String rank) {
		/*this.suit = Utils.suitToInt(suit);
		this.rank = Utils.rankToInt(rank);*/
		this(suit, rank);
		this.player = player;
	}



	public int compareTo(Bid other) {
		int thisValue;
		int otherValue;

		if (suit == 5) {
			thisValue = 5 + 100 * rank;
		}
		else {
			thisValue = (4 - suit) + 100 * rank;
		}


		if (other.getSuit() == 5) {
			otherValue = 5 + 100 * other.getRank();
		}
		else {
			otherValue = (4 - other.suit) + 100 * other.rank;
		}


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

	public Bid max(Bid other) {
		int compareValue = compareTo(other);
		if (compareValue == 1) {
			return this;
		}
		else if (compareValue == -1) {
			return other;
		}
		else {
			return this;
		}
	}

	public Player getPlayer() {
		return player;
	}
	
	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public String toString() {
		if (suit == 4 || rank == 0) {
			return "Pass";
		}
		else {
			return Utils.rankToStringBid(rank) + " " + Utils.suitToSymbol(suit);
		}
	}
}