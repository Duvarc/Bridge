public class Bridge {

	private Player SOUTH;
	private Player WEST;
	private Player NORTH;
	private Player EAST;

	public Bridge() {
		SOUTH = new Player();
		WEST = new Player();
		NORTH = new Player();
		EAST = new Player();
	}
}