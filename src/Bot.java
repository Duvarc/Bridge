public class Bot extends Player {

	public Bot(String name) {
		super(name);
	}

	//Play random legal move 
	public Play playRandom(Trick trick) {
		int firstSuit = trick.getFirstSuit();

		//If bot can play a card with the same suit as the first suit of the trick, then play it.
		if (hand.get(firstSuit).size() > 0) {
			Card randomCard = hand.get(firstSuit).get((int) (Math.random() * hand.get(firstSuit).size()));
			return play(randomCard);
		}
		//Else, play a random card from a random suit.
		else {
			int[] availableSuits = {(firstSuit + 1) % 4, (firstSuit + 2) % 4, (firstSuit + 3) % 4};
			Utils.shuffleArray(availableSuits);

			int randomSuit = availableSuits[0];
			Card randomCard = hand.get(randomSuit).get((int) (Math.random() * hand.get(randomSuit).size()));
			return play(randomCard);
		}
	}

	//Play random move - used when bot is first player
	public Play playRandom() {
		int randomSuit = Utils.randomSuit();
		while (hand.get(randomSuit).size() == 0) {
			randomSuit = Utils.randomSuit();
		}
		Card randomCard = hand.get(randomSuit).get((int) (Math.random() * hand.get(randomSuit).size()));
		return play(randomCard);
	}
}