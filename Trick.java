public class Trick {
	private Bid contract;
	private int firstSuit;

	private ArrayList<Play> trick;

	public Trick(Bid contract) {
		this.contract = contract;
		trick = new ArrayList<Play>
	}

	public Player getWinner() {
		int maxValue;
		Player winner;

		firstSuit = trick.get(0).getCard().getSuit();

		for (int i = 0; i < 4; i++) {
			Card currentCard = trick.get(i).getCard();
			int playValue = trick.get(i).getCard().getRank();

			if (currentCard.getSuit() == contract.getSuit()) {
				playValue += 200;
			}
			else if (currentCard.getSuit() == firstSuit) {

			}

		}
	}

}