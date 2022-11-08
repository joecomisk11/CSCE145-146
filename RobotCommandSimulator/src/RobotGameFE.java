//Written by Joe Comiskey
import java.util.Scanner;
public class RobotGameFE {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		RobotGame rg = new RobotGame();
		System.out.println("Welcome to the Robot Simulator");
		boolean quit = false;
		while(quit == false)
		{
			//Gets both file names and stores it in variable 
			System.out.println("Enter the board file name:");
			String fileName = keyboard.nextLine();
			System.out.println("Enter the robot commands file name:");
			String fileName2 = keyboard.nextLine();
			
			System.out.println("Simulation begins");
			//shows initial map
			rg.showBoard(fileName);
			//runs the move method 
			rg.moveSpace(fileName2);
			System.out.println("The simulation ended. Enter 'true' to quit or hit enter to run another simulation.");
			String playAgain = keyboard.nextLine();
			//asks if user wants to quit
			if(playAgain.equalsIgnoreCase("True"))
			{
				System.out.println("Goodbye");
				break;
			}
		}

	}

}
