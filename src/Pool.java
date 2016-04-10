public class Pool extends Hand {

	private Hand pool;

	public Pool(Hand hand1, Hand hand2) {
		pool = hand1.combineHand(hand2);
	}
}