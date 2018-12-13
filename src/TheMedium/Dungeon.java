package TheMedium;

import Beings.Being;


public class Dungeon extends TheMedium
{
    public Dungeon(int x, int y)
    {
        super(x, y);
    }

    /**
     * Method controls the Being entering the Dungeon
     * @param x the Person entering
     */
    public void enterRoom(Being x)
    {
        System.out.println("You enter into a dungeon.");
        System.out.println("Or, rather, you wander into a dungeon. The scene before you suddenly warps and distorts to that of a deep, rough cave dimly lit with torches before you can even process it.");
        System.out.println("Then, before you suddenly there appears to be an obstacle.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Being x)
    {
        occupant = null;
    }

}

