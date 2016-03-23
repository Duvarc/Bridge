public class CardTester {

	public static void main(String[] args) {

		Hand sample = new Hand();
		sample.add(new Card(1, 11));
		sample.add(new Card(1, 7));
		sample.add(new Card("Spades", 1));
		sample.add(new Card("Hearts", "King"));
		sample.add(new Card("Hearts", "Queen"));
		sample.add(new Card("Hearts", 2));
		sample.add(new Card("Hearts", "Ace"));
		sample.add(new Card("Clubs", "King"));
		sample.add(new Card("Clubs", 9));
		sample.add(new Card("Clubs", 3));

		System.out.println(sample);

		sample.sort();

		System.out.println("-----------------");
		System.out.println(sample);
	}
}