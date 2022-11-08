_// Written by Joe Comiskey

import java.util.Scanner;
public class VideoGameFrontEnd {
	private static Scanner keyboard = new Scanner(System.in);
	private static VideoGameManager videoGameManager = new VideoGameManager();
	public static void main(String[] args) {
		printGreeting();
		boolean quit = false;
		while(!quit)
		{
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice)
			{
			case 1:
				readVideoGameFile();
				break;
			case 2:
				searchDatabase();
				break;
			case 3:
				//printResults();
				break;
			case 4:
				writeVideoGameFile();
				break;
			case 0:
				quit = true;
				break;
				default:
					System.out.println("Invalid input");
			}
		}

	}
	public static void printGreeting() {
		System.out.println("Welcome to the video game database");
	}
	public static void printChoices()
	{
		System.out.println("Enter 1 to load video game database\n"
				+ "Enter 2 to search the database \n"
				+ "Enter 3 to print current results\n"
				+ "Enter 4 to print current results to file\n"
				+ "Enter 0 to quit");
	}
	
	public static void readVideoGameFile()
	{
		System.out.println("Enter the file name to read a Video Game database");
		String fileName = keyboard.nextLine();
		videoGameManager.readVideoGameFile(fileName);
	}
	public static void writeVideoGameFile()
	{
		System.out.println("Enter the file name to write a video game database file");
		String fileName = keyboard.nextLine();
		videoGameManager.writeVideoGameFile(fileName);
	}
	public static void searchDatabase()
	{
		System.out.println("Enter the name of the game or '*' for all names");
		String gameSearch = keyboard.next();
		System.out.println("Enter the name of the console or '*' for all consoles");
		String consoleSearch = keyboard.next();
		videoGameManager.searchDatbase(gameSearch, consoleSearch);
	}
}
