import java.util.ArrayList;

public class Hand {

	private int size;
	private int value;

	private int[] pointsBySuit;

	private int pointsHAND;

	private ArrayList<Card> Clubs;
	private ArrayList<Card> Diamonds;
	private ArrayList<Card> Hearts;
	private ArrayList<Card> Spades;

	public ArrayList<ArrayList<Card>> hand;

	private new ArrayList<Card> hand;

	public Hand() {

		Clubs = new ArrayList<Card>(13);
		Diamonds = new ArrayList<Card>(13);
		Hearts = new ArrayList<Card>(13);
		Spades = new ArrayList<Card>(13);

		pointsBySuit = new int[4];

		hand = new ArrayList<ArrayList<Card>>(4);

		hand.add(Clubs);
		hand.add(Diamonds);
		hand.add(Hearts);
		hand.add(Spades);
	}

	public void add(Card card) {
		suit = card.suit;

		hand.get(suit).add(card);
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

	public void sort() {
		//Sort by suit


		//Sort by rank
	}
}