public class BridgeTester {

	public static void testOne() {

		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		Trick test = new Trick(new Bid(south, 2, "Hearts"));
		test.add(new Play(south, new Card(6, "Spades")));
		test.add(new Play(west, new Card(8, "Spades")));
		test.add(new Play(north, new Card("King", "Hearts")));
		test.add(new Play(east, new Card("Diamonds", 2)));

		System.out.println(test.getWinner());
	}

	public static void testTwo() {
		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		Trick test = new Trick(new Bid(south, 4, "No Trump"));
		test.add(new Play(south, new Card(6, "Diamonds")));
		test.add(new Play(west, new Card(8, "Clubs")));
		test.add(new Play(north, new Card("King", "Spades")));
		test.add(new Play(east, new Card(2, "Diamonds")));

		System.out.println(test.getWinner());
	}

	public static void testThree() {
		/*Deck deck = new Deck();
		deck.shuffle();
		deck.printContents();*/
		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		Game one = new Game(south, west, north, east);
		System.out.println("Hand");
		System.out.println();
		System.out.println(west.getHand());

		System.out.println("-------------");
		System.out.println();
		HandAnalysis analysis = new HandAnalysis(west.getHand());
		analysis.printAnalysis2();
		System.out.println();
		System.out.println("-------------");
		System.out.println("Open with:");
		System.out.println(analysis.openingBid());
		System.out.println();
	}

	public static void main(String[] args) {
		//testOne();
		//testTwo();
		testThree();
	}
}