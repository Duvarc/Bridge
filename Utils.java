import java.util.HashMap;
import java.util.Map;

public class Utils {

	private static Map<String, Integer> suitToInt = new HashMap<String, Integer>();
	static {
		suitToInt.put("Clubs", 0);
		suitToInt.put("Diamonds", 1);
		suitToInt.put("Hearts", 2);
		suitToInt.put("Spades", 3);
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
	}



	private static final String[] suitSymbol = {
		"♣", "♦", "♥", "♠", "NT"};

	private static final String[] suitWord = {
		"Clubs", "Diamonds", "Hearts", "Spades", "No Trump"};

	private static final String[] rankString = {
		"Pass", "Ace", "2", "3", "4", "5", "6", "7","8", "9", "10", "Jack", "Queen", "King", "Ace"};


	public static String getSuitWord(int suit) {
		return suitWord[suit];
	}

	public static int suitToInt(String s) {
		return suitToInt.get(s);
	}

	public static int rankToInt(String s) {
		return rankToInt.get(s);
	}

	public static String rankToString(int rank) {
		return rankString[rank];
	}

}