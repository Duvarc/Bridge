import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Iterable<ArrayList<Card>> {

	private int size;

	private ArrayList<Card> Spades;
	private ArrayList<Card> Hearts;
	private ArrayList<Card> Diamonds;
	private ArrayList<Card> Clubs;

	public ArrayList<ArrayList<Card>> hand;

	public Hand() {

		Spades = new ArrayList<Card>();
		Hearts = new ArrayList<Card>();
		Diamonds = new ArrayList<Card>();
		Clubs = new ArrayList<Card>();

		hand = new ArrayList<ArrayList<Card>>(4);

		hand.add(Spades);
		hand.add(Hearts);
		hand.add(Diamonds);
		hand.add(Clubs);
	}

	/*public Hand(Card[] data) {

		Clubs = new ArrayList<Card>();
		Diamonds = new ArrayList<Card>();
		Hearts = new ArrayList<Card>();
		Spades = new ArrayList<Card>();

		hand = new ArrayList<ArrayList<Card>>(4);

		for (int i = 0; i < data.length; i++) {
			hands.get(data[i].getSuit()).add(data[i]);
		}
	}*/

	public ArrayList<Card> getSpades() {
		return Spades;
	}

	public ArrayList<Card> getHearts() {
		return Hearts;
	}

	public ArrayList<Card> getDiamonds() {
		return Diamonds;
	}

	public ArrayList<Card> getClubs() {
		return Clubs;
	}

	public int numSpades() {
		return Spades.size();
	}

	public int numHearts() {
		return Hearts.size();
	}

	public int numDiamonds() {
		return Diamonds.size();
	}

	public int numClubs() {
		return Clubs.size();
	}




	public void add(Card card) {
		hand.get(card.getSuit()).add(card);
	}

	public void sort() {
		for (int i = 0; i < 4; i++) {
			Collections.sort(hand.get(i), Collections.reverseOrder());
		}
	}

	public String toString() {
		String s ="";

		for (int i = 0; i < 4; i++) {
			s += Utils.getSuitWord(i) + ":";
			for (int k = 0; k < hand.get(i).size(); k++) {
				s += " " + Utils.rankToString(hand.get(i).get(k).getRank());
			}
			s+= "\n";
		}
		return s;
	}
	private class SuitIterator implements Iterator<ArrayList<Card>> {
		private int index;

		public SuitIterator() {
			index = 0;
		}

		public boolean hasNext() {
			return (index < 4);
		}

		public ArrayList<Card> next() {
			index++;
			return hand.get(index - 1);
		}
	}

	public Iterator<ArrayList<Card>> iterator() {
		return new SuitIterator();
	}

}