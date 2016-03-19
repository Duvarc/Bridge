public class Utils {

	private static final String[] suitSymbol = {
		"♣", "♦", "♥", "♠", "NT"};

	private static final String[] suitWord = {
		"Clubs", "Diamonds", "Hearts", "Spades", "No Trump"};

	private static final String[] rankString = {
		"Pass", "", "2", "3", "4", "5", "6", "7"," 8", "9", "10", "Jack", "Queen", "King"};


	public static String getSuitString(int suit) {
		return suitWord[suit];
	}

}