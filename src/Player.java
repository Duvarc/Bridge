import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player {
	
	protected String name;
	protected Hand hand;

	protected Player right;
	protected Player left;
	protected Player partner;

	protected ArrayList<Trick> tricksWon;
	protected ArrayList<Bid> bids;

	public Player(String name) {
		this.name = name;
		tricksWon = new ArrayList<Trick>(13);
		bids = new ArrayList<Bid>(30);
	}

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
		tricksWon = new ArrayList<Trick>(13);
		bids = new ArrayList<Bid>(30);
	}

	public void setLeft(Player left) {
		this.left = left;
	}

	public void setRight(Player right) {
		this.right = right;
	}

	public Player getLeft() {
		return left;
	}

	public Player getRight() {
		return right;
	}

	public void setPartner(Player partener) {
		this.partner = partner;
	}

	public void setHand(Hand givenHand) {
		hand = givenHand;
		hand.setHandHelper(this);
	}

	public void setOwnerHelper(Hand hand) {
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	/*public Hand getPartnersHand() {
		return partner.getHand();
	}*/

	public Bid makeBid(Bid bid) {
		bids.add(bid);
		return bid;
	}

	public Play play(Card card) {
		hand.removeCard(card);
		return new Play(this, card);
	}


	public void addTrickWon(Trick t) {
		tricksWon.add(t);
	}

	public ArrayList<Trick> getTricksWon() {
		return tricksWon;
	}

	public String toString() {
		return name;
	}

}