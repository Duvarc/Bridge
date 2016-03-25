public class BridgeTester {

	public static void testOne() {

		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		Trick test = new Trick(new Bid(south, "Hearts", 2));
		test.add(new Play(south, new Card("Spades", 6)));
		test.add(new Play(west, new Card("Spades", 8)));
		test.add(new Play(north, new Card("Hearts", "King")));
		test.add(new Play(east, new Card("Diamonds", 2)));

		System.out.println(test.getWinner());
	}

	public static void testTwo() {
		Player south = new Player("south");
		Player west = new Player("west");
		Player north = new Player("north");
		Player east = new Player("east");

		Trick test = new Trick(new Bid(south, "No Trump", 4));
		test.add(new Play(south, new Card("Diamonds", 6)));
		test.add(new Play(west, new Card("Clubs", 8)));
		test.add(new Play(north, new Card("Spades", "King")));
		test.add(new Play(east, new Card("Diamonds", 2)));

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