public class CardTester {

	public static void main(String[] args) {

		Hand sample = new Hand();
		sample.add(new Card("Queen", "Spades"));
		sample.add(new Card(8, "Spades"));
		sample.add(new Card(2, "Spades"));
		sample.add(new Card("King", "Hearts"));
		sample.add(new Card("Jack", "Hearts"));
		sample.add(new Card(5, "Hearts"));
		sample.add(new Card("Hearts", 2));
		sample.add(new Card("Ace", "Diamonds"));
		sample.add(new Card(6, "Diamonds"));
		sample.add(new Card(3, "Diamonds"));

		sample.add(new Card("King", "Clubs"));
		sample.add(new Card("Jack", "Clubs"));
		sample.add(new Card("King", "Clubs"));

		System.out.println(sample);

		sample.sort();

		System.out.println("-----------------");
		System.out.println(sample);

		System.out.println("-----------------");
		sample.printHand();

		HandAnalysis sampleAnalysis = new HandAnalysis(sample);
		sampleAnalysis.printAnalysis2();

		System.out.println(sampleAnalysis.highCardPoints());

		System.out.println(sampleAnalysis.openingBid());

		Bid one = new Bid(1, "No Trump");
		Bid two = new Bid(3, "Spades");
		Bid three = new Bid(3, "Hearts");
		Bid four = new Bid(3, "No Trump");

		System.out.println(two.max(four));
	}
}