package TheMedium;

import Beings.Being;

public class TheMedium {
	Being occupant;
	int xLoc,yLoc;
	public boolean isOccupied;

	public TheMedium(int x, int y)
	{
		xLoc = x;
		yLoc = y;
		this.isOccupied = false;
	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Being entering
	 */
	public void enterRoom(Being x)
	{

		System.out.println("You have just entered THE MEDIUM.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	 public void isOccupied()
	{
		if (isOccupied = true)
		{
			System.out.print("X");
		}
		else if (isOccupied = false)
		{
			System.out.print("+");
		}

	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Being x)
	{
		isOccupied = false;
		occupant = null;
	}
	
}
