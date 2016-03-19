public class Trick implements Comparator<Play> {
	
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

	public int compare(Play play1, Play play2) {
		int playValue1 = play1.getCard().getRank();
		int playValue2 = play2.getCard().getRank();

		//Trump suit bonus
		if (play1.getSuit() == contract.getSuit()) {
			playValue1 += 200;
		}
		//Original suit bonus
		else if (currentCard.getSuit() == firstSuit) {
			playValue1 += 100;
		}


		if (play2.getSuit() == contract.getSuit()) {
			playValue2 += 200;
		}
		else if (play2.getSuit() == firstSuit) {
			playValue2 += 100;
		}


		if (playValue1 > playValue2) {
			return 1;
		}
		else if (playValue1 < playValue2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}