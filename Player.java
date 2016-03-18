public class Player {
	
	private String name;
	private Hand hand;
	private Player partner;
	private ArrayList<Trick> tricksWon;

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
		tricksWon = new ArrayList<Trick>(13);
	}

	public void assignPartner(Player partener) {
		this.partner = partner;
	}

	public Hand getHand() {
		return hand;
	}

	public Hand getPartnersHand() {
		return partner.getHand;
	}


	public void play(Card card) {

	}

}