import java.util.ArrayList;

public class Game {

	private Player south;
	private Player west;
	private Player north;
	private Player east;

	private Hand southHand;
	private Hand westHand;
	private Hand northHand;
	private Hand eastHand;

	private Bid contract;

	private Deck deck;

	private ArrayList<Bid> listOfBids;

	public Game() {
		deck = new Deck();
		listOfBids = new ArrayList<Bid>();

		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		seatPlayers();
		dealHands();
	}

	public Game(Player south, Player west, Player north, Player east) {
		deck = new Deck();
		listOfBids = new ArrayList<Bid>();

		this.south = south;
		this.west = west;
		this.north = north;
		this.east = east;

		seatPlayers();
		dealHands();
	}

	public void seatPlayers() {

		south.setRight(west);
		south.setLeft(east);
		west.setRight(north);
		west.setLeft(south);
		north.setRight(east);
		north.setLeft(west);
		east.setRight(south);
		east.setLeft(south);
	}
	public void dealHands() {
		deck.shuffle();

		southHand = new Hand(south);
		westHand = new Hand(west);
		northHand = new Hand(north);
		eastHand = new Hand(east);

		for (int i = 0; i <= 12; i++) {
			southHand.add(deck.get(i));
		}
		for (int i = 13; i <= 25; i++) {
			westHand.add(deck.get(i));
		}
		for (int i = 26; i <= 38; i++) {
			northHand.add(deck.get(i));
		}
		for (int i = 39; i <= 51; i++) {
			eastHand.add(deck.get(i));
		}

		southHand.sort();
		westHand.sort();
		northHand.sort();
		eastHand.sort();
	}

	public void startBidding() {
		Player currentBidder = south;
		boolean biddingOver = false;
		int passCount = 0;

		while (!biddingOver) {
			//Prompt player for bid;
			Bid inputBid = new Bid(2, 3);
			Bid bid = new Bid(currentBidder, inputBid);

			if (bid.getRank() == 0) {
				passCount++;
			}

			if (passCount == 3) {
				contract = bid;
				biddingOver = true;
			}
			else {
				listOfBids.add(bid);
				currentBidder = currentBidder.getLeft();
			}
		}
	}

	public void startPlaying() {
		Player currentPlayer = south;
		for (int i = 0; i <= 12; i++) {

			Trick t = new Trick(contract);

			for (int k = 0; k <= 3; k++) {
				//Prompt player for card
				Card currentCard = new Card("Spades", "Ace");
				Play currentPlay = new Play(currentPlayer, currentCard);
				t.add(currentPlay);
			}

			Player winner = t.getWinner();
			winner.addTrickWon(t);
			currentPlayer = winner;
		}
	}


}