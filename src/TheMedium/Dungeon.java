package TheMedium;

import Beings.Being;

public class Dungeon extends TheMedium {
    Being occupant;
    int xLoc,yLoc;

    public Dungeon(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Being entering
     */
    public void enterRoom(Being x)
    {
        System.out.println("You enter a cool ass dungeon. You encounter a  ");
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

