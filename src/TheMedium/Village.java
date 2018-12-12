package TheMedium;
import Beings.Being;
import Beings.Persona;


public class Village extends TheMedium
{
    public Village(int x, int y)
    {
        super(x, y);
    }

    /**
     * Method controls the Being entering the Village
     * @param x the Person entering
     */
    public void enterRoom(Being x)
    {
        System.out.println("You enter a village whose occupants are desperately looking for a solution to the occupied dungeons in the nearby area.");
        System.out.println("They...hire you instantaneously. Without even the slightest bit of hesitation. And they seem very eager to reward you for accepting.");
        System.out.println("They offer you ARMOURE (+1 tank), HEALTH GEL (+5 health vial), and a SUGARCUBE (+1 attack)");
        System.out.println("You may select one.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public static String itemChoose(String item, Being p, TheMedium[][] map)
    {
        item = item.toLowerCase().trim();
        if (item = "armoure")
        {
            //attack counter goes up
            Persona.
        }

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
