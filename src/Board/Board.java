package Board;

import TheMedium.TheMedium;

public class Board extends TheMedium
{
    private TheMedium[][] map;

    public Board (TheMedium[][] map)
    {
        this.map = map;
    }
    public Board (int length, int width)
    {
        map = new TheMedium[length][width];
    }
    public void printBoard()
    {
        super(x, y);
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {


            }
        }
    }
}
