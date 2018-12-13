package Overseer;

import Beings.Being;
import Beings.Ghoul;
import Beings.Ogre;
import Beings.Imp;
import Board.Board;
import TheMedium.TheMedium;
import TheMedium.Dungeon;
import TheMedium.Village;

import java.util.Random;
import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		TheMedium[][] building = new TheMedium[5][5];
		
		//Fill the map with Villages
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Village(x,y);
			}
		}


		//Create the spawn room and Dungeons
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[0][0] = new TheMedium(0, 0);
		building[4][2] = new Dungeon(4, 2);
		building[1][3] = new Dungeon(1, 3);
		building[2][2] = new Dungeon(2, 2);
		building[4][4] = new Dungeon(4, 4);


        //Setup player 1 and the input scanner
		Being player1 = new Being("Persona", 100,0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
        Random rand = new Random();

		//Setup enemies
        Being ghoul1 = new Ghoul("Ghoul",4,4);
        Being ogre = new Ogre("Ogre",4,2);
        Being imp = new Imp("Ghoul",2,2);
        Being ghoul2 = new Ghoul("Ghoul",1,3);
		while(gameOn)
		{
            System.out.print(building);
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Being p, TheMedium[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
