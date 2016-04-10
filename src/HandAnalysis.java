import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class HandAnalysis {

	private int totalPoints;

	private int highCardPoints;

	private int pointDistribution;

	private Hand hand;

	private int[] sizeDistribution;
	private int[] sortedDistribution;
	private int[] pointsBySuit;

	public HandAnalysis(Hand hand) {
		this.hand = hand;
		sizeDistribution = new int[4];
		pointsBySuit = new int[4];
		highCardPoints = 0;

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
		sizeDistribution[0] = hand.numSpades();
		sizeDistribution[1] = hand.numHearts();
		sizeDistribution[2] = hand.numDiamonds();
		sizeDistribution[3] = hand.numClubs();
	}

	public void calculatePoints() {
		int suitIndex = 0;
		for (ArrayList<Card> suit : hand) {
			for (Card x : suit) {
				int rank = x.getRank();

				//High card points
				if (rank >= 11) {
					pointsBySuit[suitIndex] += rank - 10;
					highCardPoints += rank - 10;
				}
			}

			int numInSuit = suit.size();
			pointsBySuit[suitIndex] += Math.max(0, numInSuit - 4);
			suitIndex++;
		}

		totalPoints = pointsClubs() + pointsDiamonds() + pointsHearts() + pointsSpades();
	}

	public void testIterator() {
		for (ArrayList<Card> suit : hand) {
			for (Card x : suit) {
				System.out.println(x);
			}
		}
	}
	public int pointsSpades() {
		return pointsBySuit[0];
	}

	public int pointsHearts() {
		return pointsBySuit[1];
	}

	public int pointsDiamonds() {
		return pointsBySuit[2];
	}

	public int pointsClubs() {
		return pointsBySuit[3];
	}

	public int highCardPoints() {
		return highCardPoints;
	}

	public int pointsHand() {
		return totalPoints;
	}

	public void printAnalysis() {
		System.out.println("Analysis");
		System.out.println();
		System.out.println("Spades: " + pointsSpades() + " points");
		System.out.println("Hearts: " + pointsHearts() + " points");
		System.out.println("Diamonds: " + pointsDiamonds() + " points");
		System.out.println("Clubs: " + pointsClubs() + " points");
		System.out.println("Points total: " + totalPoints + " points");
		System.out.println("Balanced?: " + balanced());
	}

	public void printAnalysis2() {
		System.out.println("Analysis");
		System.out.println();
		System.out.println("♠ " + pointsSpades() + " points");
		System.out.println("♥ " + pointsHearts() + " points");
		System.out.println("♦ " + pointsDiamonds() + " points");
		System.out.println("♣ " + pointsClubs() + " points");
		System.out.println("Points total: " + totalPoints + " points");
		System.out.println("Balanced?: " + balanced());
	}

	public Bid openingBid() {

		//Standard American Yellow Card
		Player owner = hand.getOwner();
		int longestLength = sortedDistribution[3];

		if (totalPoints >= 12 && totalPoints <= 21) {
			//If balanced and high card points is 20 or 21, bid 2 NT.
			if (balanced() && highCardPoints == 20 || highCardPoints == 21) {
				return new Bid(owner, 2, 5);
			}
			//If balanced and high card points is 15, 16, or 17, bid 1 NT.
			else if (balanced() && highCardPoints >= 15 && highCardPoints <= 17) {
				return new Bid(owner, 1, 5);
			}
			//If not balanced
			else {
				//If longest length of a suit is 5 or more, bid the longest suit.
				//If the longest length is less than 5, then we cannot open in major suits
				//and must go to the minor suits.
				if (longestLength >= 5) {
					return new Bid(owner, 1, getSuitOfLength(longestLength));
				}
				//Else bid the longer of the two minors. Only bid 1 Clubs if number of 
				//clubs is strictly greater than number of diamonds. 
				//If minor suits are 3-3, then bid 1 Clubs - the only case where
				//the lower suit beats the higher suit when they have equal length
				else if (sizeDistribution[2] > sizeDistribution[2] ||
				(sizeDistribution[2] == 3 && sizeDistribution[3] == 3)) {
					return new Bid(owner, 1, 3);
				}
				//If number of diamonds >= number of clubs, bid 1 Diamonds.
				else {
					return new Bid(owner, 1, 2);
				}

				/*//Less efficient version of above two else if statements
				else {
					int longerMinor = Math.max(sizeDistribution[2], sizeDistribution[3]);
					return new Bid(owner, 1, getSuitOfLength(longerMinor));
				}*/
			}
		}
		//Over 21 points
		else {
			//If balanced and high card points is 25, 26, or 27, bid 3 NT.
			if (balanced() && highCardPoints >= 25 && highCardPoints <= 27) {
				return new Bid(owner, 3, 5);
			}
			//Bid 2 Clubs for strong hands.
			else if (totalPoints >= 22) {
				return new Bid(owner, 2, 3);
			}
		}
		return new Bid(owner, 0, 0);
	}


	public int getSuitOfLength(int length) {
		for (int i = 0; i < 4; i++) {
			if (sizeDistribution[i] == length) {
				return i;
			}
		}
		return -1;
	}
}