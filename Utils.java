import java.util.HashMap;
import java.util.Map;

public class Utils {

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
		"Pass", "Ace", "2", "3", "4", "5", "6", "7","8", "9", "10", "Jack", "Queen", "King", "Ace"};


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


}