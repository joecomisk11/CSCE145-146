import java.util.Scanner;
public class MazeGameFE {
public static Scanner keyboard = new Scanner(System.in);
public static MazeGame game = new MazeGame();
public static final String GIVE_UP = "Give Up";
	public static void main(String[] args) {
		boolean playGame = true;
		while(playGame)
		{
			System.out.println("Welcome to the maze in the dark!");
			game.reset();
			boolean gameOver=false;
			while(!gameOver)
			{
				game.printMoveOptions();
				System.out.println(GIVE_UP);
				String input = keyboard.nextLine();
				if(input.equalsIgnoreCase(GIVE_UP))
				{
					gameOver = true;
					game.printFullMaze();
				}
				else
					game.move(input);
				
				if(game.getWin())
				{
					System.out.println("You win!");
					game.printFullMazeWithPath();
					gameOver = true;
				}
				
			}
			System.out.println("Enter 'yes' to play again!");
			playGame= keyboard.nextLine().equalsIgnoreCase("yes");
		}
		System.out.println("Goodbye");
		
		
		
	}

}
