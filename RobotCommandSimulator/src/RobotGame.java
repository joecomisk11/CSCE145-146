//Written by Joe Comiskey
import java.util.*;
import java.io.*;
public class RobotGame implements CommandQueueInterface<String>{
	//instance variables for movements and board size
	public static final int BOARD_SIZE = 10;
	public static final String UP = "Move Up";
	public static final String DOWN = "Move Down";
	public static final String LEFT = "Move Left";
	public static final String RIGHT = "Move Right";
	//creation of board
	private char[][]board;
	private CommandQueue<String> decision;
	//constructor
	public RobotGame()
	{
		board = new char[BOARD_SIZE][BOARD_SIZE];
		decision = new CommandQueue<String>();
	}
	//prints the initial board by using for loop with character in top left corner
	public void showBoard(String fileName)
	{
		try
		{ 
			Scanner file = new Scanner(new File(fileName));
			for(int i=0;i<BOARD_SIZE;i++)
			{
				board[i] = file.nextLine().toCharArray();
				board[0][0]= 'O';
				System.out.println(board[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid file name");
		}
	}
	//method with for loop to print the board out 
	public void printUpdatedBoard()
	{
		for(int i = 0; i<BOARD_SIZE;i++)
		{
			System.out.println(board[i]);
		}
	}
	//checks if the character is inbounds by checking different boolean statements 
	public boolean inBounds(int i, int j, char board[][])
	{
		if(i >= 0 && j>= 0 && i<BOARD_SIZE && j < BOARD_SIZE && board[i][j]== '_' )
		{
			return true;
		}
		else
		{
			System.out.println("CRASH!");
			System.exit(0);
			return false;
		}
	}
	//sets the x and y coordinate to 0. Takes in the instructions via the file scanner. Uses peek method to check what the next instruction is and 
	//checks the conditions to see if it needs to move the character up,down,left or right
	//It also reprints the new updated board after that instruction 
	public void moveSpace(String fileName2)
	{
		int count = 0;
		int Y = 0;
		int X = 0;
		try
		{
			Scanner getCommand = new Scanner(new File(fileName2));
			while(getCommand.hasNext())
			{
				String move = getCommand.nextLine();
				decision.enqueue(move);
				if(decision.peek().equals(UP))
				{
					System.out.println("\nCommand "+count);
					if(inBounds(Y-1,X,board))
					{
						board[Y][X] = '_';
						board[Y-1][X] = 'O';
						Y -= 1;
						printUpdatedBoard();
						decision.dequeue();
						count++;
					}
				}
				else if(decision.peek().equals(DOWN))
				{
					System.out.println("\nCommand "+count);
					if(inBounds(Y+1,X,board))
					{
						board[Y][X] = '_';
						board[Y+1][X] = 'O';
						Y += 1;
						printUpdatedBoard();
						decision.dequeue();
						count++;
					}
				}
				else if(decision.peek().equals(LEFT))
				{
					System.out.println("\nCommand "+count);
					if(inBounds(Y,X-1,board))
					{
						board[Y][X] = '_';
						board[Y][X-1] = 'O';
						X -= 1;
						printUpdatedBoard();
						decision.dequeue();
						count++;
					}
				}
				else if(decision.peek().equals(RIGHT))
				{
					System.out.println("\nCommand "+count);
					if(inBounds(Y,X+1,board))
					{
						board[Y][X] = '_';
						board[Y][X+1] = 'O';
						X += 1;
						printUpdatedBoard();
						decision.dequeue();
						count++;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid file name");
		}
	}
	//3 override methods to override the parent class
	@Override
	public String dequeue() {
		return null;
	}
	@Override
	public String enqueue() {
		return null;
	}
	@Override
	public String peek() {
		return null;
	}
	
	
	
}
	
	