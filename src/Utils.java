import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {
	//toString utilies

	private static Map<String, Integer> suitToInt = new HashMap<String, Integer>();
	static {
		suitToInt.put("Spades", 0);
		suitToInt.put("Hearts", 1);
		suitToInt.put("Diamonds", 2);
		suitToInt.put("Clubs", 3);
		suitToInt.put("Pass", 4);
		suitToInt.put("No Trump", 5);
	}



	private static Map<String, Integer> rankToInt = new HashMap<String, Integer>();
	static {
		rankToInt.put("1", 14);
		rankToInt.put("2", 2);
		rankToInt.put("3", 3);
		rankToInt.put("4", 4);
		rankToInt.put("5", 5);
		rankToInt.put("6", 6);
		rankToInt.put("7", 7);
		rankToInt.put("8", 8);
		rankToInt.put("9", 9);
		rankToInt.put("10", 10);
		rankToInt.put("Jack", 11);
		rankToInt.put("Queen", 12);
		rankToInt.put("King", 13);
		rankToInt.put("Ace", 14);
		rankToInt.put("Pass", 0);
	}

	private static final String[] suitToSymbol = {
		"♠", "♥", "♦", "♣", "Pass", "NT"};

	private static final String[] suitToString = {
		"Spades", "Hearts", "Diamonds", "Clubs", "Pass", "No Trump"};

	private static final String[] rankToString = {
		"Pass", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	private static final String[] rankToStringSimple = {
		"Pass", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

	private static final String[] rankToStringBid = {
		"Pass", "1", "2", "3", "4", "5", "6", "7"};

	public static String rankToStringBid(int rank) {
		return rankToStringBid[rank];
	}

	public static String rankToStringSimple(int rank) {
		return rankToStringSimple[rank];
	}

	public static String getSuitWord(int suit) {
		return suitToString[suit];
	}

	public static String suitToString(int suit) {
		return suitToString[suit];
	}

	public static int suitToInt(String s) {
		return suitToInt.get(s);
	}

	public static String suitToSymbol(int rank) {
		return suitToSymbol[rank];
	}

	public static int rankToInt(String s) {
		return rankToInt.get(s);
	}

	public static String rankToString(int rank) {
		return rankToString[rank];
	}

	public static Hand randomHand() {
		Deck deck = new Deck();

		Hand randomHand = new Hand();

		for (int i = 0; i < 5; i++) {
			deck.shuffle();
		}

		for (int i = 0; i <= 12; i++) {
			randomHand.add(deck.get(i));
		}

		return randomHand;
	}

	public static void shuffleArray(int[] array) {
	    int index;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        if (index != i)
	        {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }
	}

	public static int randomSuit() {
		int[] suits = {0, 1, 2, 3};
		shuffleArray(suits);
		shuffleArray(suits);
		return suits[0];

	}

	//Game logs
	public static void writeLog(Game game) {
		
	}


}