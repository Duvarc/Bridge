public class CardTester {

	public static void main(String[] args) {

		Hand sample = new Hand();
		sample.add(new Card("Spades", "Queen"));
		sample.add(new Card("Spades", 8));
		sample.add(new Card("Spades", 2));
		sample.add(new Card("Hearts", "King"));
		sample.add(new Card("Hearts", "Jack"));
		sample.add(new Card("Hearts", 5));
		sample.add(new Card("Hearts", 2));
		sample.add(new Card("Diamonds", "Ace"));
		sample.add(new Card("Diamonds", 6));
		sample.add(new Card("Diamonds", 3));

		sample.add(new Card("Clubs", "King"));
		sample.add(new Card("Clubs", "Jack"));
		sample.add(new Card("Clubs", 4));

		System.out.println(sample);

		sample.sort();

		System.out.println("-----------------");
		System.out.println(sample);

		System.out.println("-----------------");

		HandAnalysis sampleAnalysis = new HandAnalysis(sample);
		sampleAnalysis.printAnalysis();
	}
}