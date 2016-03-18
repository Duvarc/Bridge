import java.util.ArrayList;

public class Hand {

	private int size;
	private int value;

	private int[] pointsBySuit;

	private int pointsHAND;

	private ArrayList<Card> CLUBS;
	private ArrayList<Card> DIAMONDS;
	private ArrayList<Card> HEARTS;
	private ArrayList<Card> SPADES;

	public ArrayList<ArrayList<Card>> hand;

	private new ArrayList<Card> hand;

	public Hand() {

		CLUBS = new ArrayList<Card>(13);
		DIAMONDS = new ArrayList<Card>(13);
		HEARTS = new ArrayList<Card>(13);
		SPADES = new ArrayList<Card>(13);

		pointsBySuit = new int[4];

		hand = new ArrayList<ArrayList<Card>>(4);

		hand.add(CLUBS);
		hand.add(DIAMONDS);
		hand.add(HEARTS);
		hand.add(SPADE);
	}

	public void add(Card card) {
		suit = card.suit;

		hand.get(suit).add(card);
	}

	public void play(Card card) {

	}

	public void calculatePoints() {

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

	public int pointsCLUBS() {
		return pointsBySuit[0];
	}

	public int pointsDIAMONDS() {
		return pointsBySuit[1];
	}

	public int pointsHEARTS() {
		return pointsBySuit[2];
	}

	public int pointsSPADES() {
		return pointsBySuit[3];
	}

	public int pointsHAND() {
		return pointsCLUBS + pointsDIAMONDS + pointsHEARTS + pointsHEARTS;
	}

	public void sort() {
		//Sort by suit


		//Sort by rank
	}
}