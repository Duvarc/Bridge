public class Trick {
	
	private Bid contract;
	private int firstSuit;

	private ArrayList<Play> trick;

	public Trick(Bid contract) {
		this.contract = contract;
		trick = new ArrayList<Play>(4);
	}

	public Player getWinner() {
		int maxValue;
		Player winner;

		firstSuit = trick.get(0).getCard().getSuit();

		for (int i = 0; i < 4; i++) {

			Card currentCard = trick.get(i).getCard();
			int playValue = trick.get(i).getCard().getRank();

			//Trump suit bonus
			if (currentCard.getSuit() == contract.getSuit()) {
				playValue += 200;
			}
			//Original suit bonus
			else if (currentCard.getSuit() == firstSuit) {
				playValue += 100;
			}

			if (playValue > maxValue) {
				maxValue = playValue;
				winner = trick.get(i).getPlayer();
			}
		}
	}

}