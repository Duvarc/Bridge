public class Game {

	private Player South;
	private Player West;
	private Player North;
	private Player East;

	private Hand southHand;
	private Hand westHand;
	private Hand northHand;
	private Hand eastHand;

	private Deck deck;

	public Game(Player south, Player west, Player north, Player east) {
		deck = new Deck();
		deck.shuffle();

		South = south;
		West = west;
		North = north;
		East = east;

		South.setRight(West);
		South.setLeft(East);
		West.setRight(North);
		West.setLeft(South);
		North.setRight(East);
		North.setLeft(West);
		East.setRight(South);
		East.setLeft(South);

		southHand = new Hand(South);
		westHand = new Hand(West);
		northHand = new Hand(North);
		eastHand = new Hand(East);

		dealHands();
	}

	public void dealHands() {
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
}