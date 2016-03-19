public class Player {
	
	private String name;
	private Hand hand;

	private Player right;
	private Player left;
	private Player partner;

	private ArrayList<Trick> tricksWon;
	private ArrayList<Bid> bids;

	public Player(String name) {
		this.name = name;
		tricksWon = new ArrayList<Trick>(13);
		bids = new ArrayList<Trick>(30);
	}

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
		tricksWon = new ArrayList<Trick>(13);
		bids = new ArrayList<Trick>(30);
	}

	public void setRight(Player right) {
		this.right = right;
	}

	public void setLeft(Player left) {
		this.left = left;
	}

	public void setPartner(Player partener) {
		this.partner = partner;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	public Hand getPartnersHand() {
		return partner.getHand;
	}

	public Bid makeBid(Bid bid) {
		bids.add(bid);
	}

	public void play(Card card) {

	}

}