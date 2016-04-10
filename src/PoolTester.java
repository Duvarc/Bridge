public class PoolTester {

	public static void main(String[] args) {
		Hand hand1 = Utils.randomHand();
		hand1.sort();
		System.out.println(hand1);
		System.out.println("--------------------");

		Hand hand2 = Utils.randomHand();
		hand2.sort();
		System.out.println(hand2);
		System.out.println("--------------------");



		Hand pool = hand1.combineHand(hand2);
		pool.sort();
		System.out.println(pool);
		System.out.println("--------------------");

	}
}