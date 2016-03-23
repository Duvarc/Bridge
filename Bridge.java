public class Bridge {

	private Player South;
	private Player West;
	private Player North;
	private Player East;

	public Bridge() {
		initPlayers();
	}

	public void initPlayers() {
		South = new Player("South");
		West = new Player("West");
		North = new Player("North");
		East = new Player("East");

		South.setRight(West);
		South.setLeft(East);
		West.setRight(North);
		West.setLeft(South);
		North.setRight(East);
		North.setLeft(West);
		East.setRight(South);
		East.setLeft(South);
	}

}