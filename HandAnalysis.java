import HandData.java;

public class HandAnalysis {

	private int pointsHand;
	private Hand hand;
	private int[] sizeDistribution;
	private int[] pointsBySuit;

	public HandAnalysis(Hand hand) {
		this.hand = hand;
		sizeDistribution = new int[4];
		pointsBySuit = new int[4];

		calculateDistribution(hand);
		calculatePoints(hand);
	}

	public boolean balanced() {

		int[] sortedDistribution = Arrays.copyOf(sizeDistribution, 4);
		Array.sort(sortedDistribution, Collections.reverseOrder());

		if (sortedDistrubtion == HandData.balanced4333) {
			return true;
		}
		else if (sortedDistrubtion == HandData.balanced4432) {
			return true;
		}
		else if (sortedDistrubtion == HandData.balanced5332) {
			return true;
		}
		return false;
	}

	public void calculateDistribution() {
		sizeDistribution[0] = hand.numClubs();
		sizeDistribution[1] = hand.numDiamonds();
		sizeDistribution[2] = hand.numHearts();
		sizeDistribution[3] = hand.numSpades();
	}

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

		pointsHand = pointsClubs() + pointsDiamonds() + pointsHearts(); + pointsSpades();
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
		return pointsHand;
	}
}