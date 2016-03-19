public class Bridge {

	private Player South;
	private Player West;
	private Player North;
	private Player East;

	public Bridge() {
		South = new Player();
		West = new Player();
		North = new Player();
		East = new Player();

		South.next = West;
		West.next = North;
		North.next = East;
		East.next = South;
	}
}