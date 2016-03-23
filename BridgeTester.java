public class BridgeTester {

	public static void main(String[] args) {

		Player South = new Player("South");
		Player West = new Player("West");
		Player North = new Player("North");
		Player East = new Player("East");

		Trick test = new Trick(new Bid(South, "Spades", 2));
		test.add(new Play(South, new Card("Spades", 6)));
		test.add(new Play(West, new Card("Spades", 8)));
		test.add(new Play(North, new Card("Hearts", "King")));
		test.add(new Play(East, new Card("Diamonds", 2)));

		System.out.println(test.getWinner());
	}
}