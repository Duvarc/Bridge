import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class HandAnalysis {

	private int pointsHand;
	private int pointDistribution;

	private Hand hand;

	private int[] sizeDistribution;
	private int[] sortedDistribution;
	private int[] pointsBySuit;

	public HandAnalysis(Hand hand) {
		this.hand = hand;
		sizeDistribution = new int[4];
		pointsBySuit = new int[4];

		calculateDistribution();
		calculatePoints();
		sortedDistribution = Arrays.copyOf(sizeDistribution, 4);
		Arrays.sort(sortedDistribution);
		pointDistribution = sortedDistribution[0] + 
							10 * sortedDistribution[1] +
							100 * sortedDistribution[2] +
							1000 * sortedDistribution[3];
	}

	public boolean balanced() {


		if (pointDistribution == HandData.balanced4333) {
			return true;
		}
		else if (pointDistribution== HandData.balanced4432) {
			return true;
		}
		else if (pointDistribution == HandData.balanced5332) {
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

	public void calculatePoints() {

		/*for (int s = 0; s < 4; s++) {
			for (int c = 0; c < hand.get(s).size(); c++) {

				card = hand.get(s).get(c);
				rank = hand.get(s).get(c).getRank();
				
				//Check for high card points - 4-3-2-1 method

				//If card is an ace
				if (rank == 1) {
					pointsBySuit[s] += 4;
				}
				//Else if card is a King, Queen, or Jack
				else if (rank >= 11) {
					pointsBySuit[s] += rank - 10;
				}
			}

			//Long suit points - add 1 point for each card over 4 cards
			int numInSuit = hand.get(s).size();
			pointsBySuit[s] += Math.max(0, numInSuit - 4);
		}

		pointsHand = pointsClubs() + pointsDiamonds() + pointsHearts() + pointsSpades();*/

		int suitIndex = 0;
		for (ArrayList<Card> suit : hand) {
			for (Card x : suit) {

				int rank = x.getRank();
				//If card is an ace
				if (rank == 1) {
					pointsBySuit[suitIndex] += 4;
				}
				//Else if card is a King, Queen, or Jack
				else if (rank >= 11) {
					pointsBySuit[suitIndex] += rank - 10;
				}
			}
			int numInSuit = suit.size();
			pointsBySuit[suitIndex] += Math.max(0, numInSuit - 4);
			suitIndex++;
		}

		pointsHand = pointsClubs() + pointsDiamonds() + pointsHearts() + pointsSpades();
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