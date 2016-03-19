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

		South.right = West;
		South.left = East;
		West.right = North;
		West.left = South;
		North.right = East;
		North.left = West;
		East.right = South;
		East.left = South;
	}
}