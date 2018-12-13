package Board;

import TheMedium.TheMedium;

public class Board
{
    private String[][] map;
    public Board(String[][] map)
    {
        this.map = map;
    }
    void edit(String replace, int row, int column)
    {
        map[row][column] = replace;
    }

    void fill(String str)
    {
        for(int x = 0; x < map.length; x++)
        {
            for(int y = 0; y < map[x].length; y++)
            {
                map[x][y] = str;
            }
        }
    }
    public String toString()
    {
        String Board = "";
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
