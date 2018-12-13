package Board;

import TheMedium.TheMedium;

public abstract class Board
{
    private TheMedium[][] map;
    public Board (int length, int width)
    {
        map = new TheMedium[length][width];
    }
    public String toString()
    {
        String Board = " ";
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                Board = Board + map[i][j];
            }
           Board += "/n";
        }
        return Board;
    }
}
