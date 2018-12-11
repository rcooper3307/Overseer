package TheMedium;

import Beings.Being;
import Overseer.Runner;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Being entering
	 */
	@Override
	public void enterRoom(Being x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
