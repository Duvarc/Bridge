public class Bid implements Comparable<Bid> {

	private int suit;
	private int rank;
	private Player player;

	public Bid(Player player, int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		this.player = player;
	}

	public Bid(Player player, String suit, int rank) {
		this.suit = Utils.suitToInt(suit);
		this.rank = rank;
		this.player = player;
	}

	public Bid(Player player, String suit, String rank) {
		this.suit = Utils.suitToInt(suit);
		this.rank = Utils.rankToInt(rank);
		this.player = player;
	}



	public int compareTo(Bid other) {
		int thisValue = (4 - suit) * 100 + rank;
		int otherValue = (4 - other.suit) * 100 + other.rank;

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

	public Player getPlayer() {
		return player;
	}
	
	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
}