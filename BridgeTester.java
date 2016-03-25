public class BridgeTester {

	public static void testOne() {

		Player South = new Player("South");
		Player West = new Player("West");
		Player North = new Player("North");
		Player East = new Player("East");

		Trick test = new Trick(new Bid(South, "Hearts", 2));
		test.add(new Play(South, new Card("Spades", 6)));
		test.add(new Play(West, new Card("Spades", 8)));
		test.add(new Play(North, new Card("Hearts", "King")));
		test.add(new Play(East, new Card("Diamonds", 2)));

		System.out.println(test.getWinner());
	}

	public static void testTwo() {
		Player South = new Player("South");
		Player West = new Player("West");
		Player North = new Player("North");
		Player East = new Player("East");

		Trick test = new Trick(new Bid(South, "No Trump", 4));
		test.add(new Play(South, new Card("Diamonds", 6)));
		test.add(new Play(West, new Card("Clubs", 8)));
		test.add(new Play(North, new Card("Spades", "King")));
		test.add(new Play(East, new Card("Diamonds", 2)));

		System.out.println(test.getWinner());
	}

	public static void testThree() {
		/*Deck deck = new Deck();
		deck.shuffle();
		deck.printContents();*/
		Player South = new Player("South");
		Player West = new Player("West");
		Player North = new Player("North");
		Player East = new Player("East");

		Game one = new Game(South, West, North, East);
		System.out.println("Hand");
		System.out.println();
		System.out.println(West.getHand());

		System.out.println("-------------");
		System.out.println();
		HandAnalysis analysis = new HandAnalysis(West.getHand());
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