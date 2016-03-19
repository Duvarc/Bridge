public class BidAnalysis() {

	private int[] pointsBySuit;
	private int pointsHAND;

	public void calculatePoints(Hand hand) {

		for (int suit = 0; suit < 4; suit++) {
			for (int c = 0; c < hand.get(s).size(); c++) {

				card = hand.get(s).get(c);
				rank = hand.get(s).get(c).getRank();
				
				//Check for high card points - 4-3-2-1 method

				//If card is an ace
				if (rank == 1) {
					pointsBySuit[suit] += 4;
				}
				//Else if card is a King, Queen, or Jack
				else if (rank >= 11) {
					pointsBySuit[suit] += rank - 10;
				}
			}

			//Long suit points - add 1 point for each card over 4 cards
			pointsBySuit[suit] += Math.max(0, cardsInSuit - 4);
		}
	}

	public int pointsClubs() {
		return pointsBySuit[0];
	}

	public int pointsDiamonds() {
		return pointsBySuit[1];
	}

	public int pointsHearts() {
		return pointsBySuit[2];
	}

	public int pointsSpades() {
		return pointsBySuit[3];
	}

	public int pointsHand() {
		return pointsClubs + pointsDiamonds + pointsHearts + pointsHearts;
	}

	public int numberClubs() {
		return Clubs.size();
	}

	public int numberDiamonds() {
		return Diamonds.size();
	}

	public int numberHearts() {
		return Hearts.size();
	}

	public int numberSpades() {
		return Spades.size();
	}

}