//Written by Joe Comiskey

import java.util.Scanner;
import java.io.*;
public class VideoGameManager
{
	//static variables for delim and how many fields there are for each game
	public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 2;
	private LinkedList<VideoGame> videogames;
	//created constructor
	public VideoGameManager()
	{
		videogames = new LinkedList<VideoGame>();
	}
	//adds game to linked list
	public void addVideoGame(VideoGame aVideoGame)
	{
		videogames.add(aVideoGame);
	}
	//writes a game to a file
	public void writeVideoGameFile(String aName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName));
			videogames.reset();
			while(videogames.hasMore())
			{
				VideoGame aVideoGame = videogames.getCurrent();
				fileWriter.println(aVideoGame.getName()+DELIM+aVideoGame.getConsole());
				videogames.goToNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//allows user to read a file
	public void readVideoGameFile(String aName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == BODY_FIELD_AMT)
				{
					String name = splitLines[0];
					String console = splitLines[1];
					VideoGame aVideoGame = new VideoGame(name,console);
					this.addVideoGame(aVideoGame);
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Couldn't quite figure this part out. Originally wanted to check if user input was equal to games in the list and then add it to a new list
	//Ended up checking if user input was NOT equal to a game in the database and then removing it from the list, leaving only games in the list with the user input keyword
	 public void searchDatbase(String aGame, String aConsole)
	   {
		 while(videogames.hasMore())
		 {
			 if(videogames.getCurrent().getName().equals("*"))
			 {
				 return;
			 }
			 else if(videogames.getCurrent().getName() != aGame)
			 {
				 videogames.removeCurrent();
				 break;
			 }
			 if(videogames.getCurrent().getConsole().equals("*"))
			 {
				 return;
			 }
			 else if(videogames.getCurrent().getConsole() != aConsole)
			 {
				 videogames.removeCurrent();
				 break;
			 }
			 videogames.goToNext();
			 
		 }
			 
		 }
	 public void printResults() {
		 
	 }
	   }
	

