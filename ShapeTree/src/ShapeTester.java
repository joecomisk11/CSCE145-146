/*
 * By Joe Comiskey
 * Output a little funky couldn't figure out how to line everything up correctly but values are accurate
 */
import java.io.File;
import java.util.*;

public class ShapeTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the shape tester!\nPlease enter a Shape File Name.");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();
		System.out.println("Reading from file");
		//creates new tree
		BST shape = new BST();
		try 
		{
			//scans the file
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				//valid keeps track if the shape name is either rectangle, circle, or triangle
				int valid = 0;
				String currLine = fileScanner.nextLine();
				String[] words = currLine.split("\t");
				if(words[0].equals("Rectangle"))
				{
					//the three shapes that we want all get a valid value = to 1 for reasons later on in the class
					valid = 1;
					shape.add(new Rectangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
				}
				else if(words[0].equals("Right Triangle"))
				{
					valid = 1;
					shape.add(new Triangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
				}
				else if(words[0].equals("Circle"))
				{
					valid = 1;
					shape.add(new Circle(Double.parseDouble(words[1])));
				}
				else
				{
					System.out.println("Not properly formatted line!");
				}
				//the shapes with value = to 1 which is the 3 we have classes for get printed 
				if(valid == 1)
				{
				for(String word:words)
				{
					System.out.print(word+"\t");
				}
				}
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//calling all methods
		System.out.println("Printing pre-order");
		shape.printPreorder();
		System.out.println();
		System.out.println("Printing in-order");
		shape.printInorder();
		System.out.println();
		System.out.println("Printing post-order");
		shape.printPostorder();
		System.out.println();
		System.out.println("The max area is: " + shape.maxArea());
		System.out.println();
		System.out.println("Deleting Rectangle Side 1: 2.0 Side 2: 7.0 Area: 14.0");
		shape.delete("Rectangle",14);
		System.out.println("Printing in-order");
		shape.printInorder();
		System.out.println();
		System.out.println("Deleting values larger than 30");
		shape.deleteGreaterThan(30);
		System.out.println("Print in-order");
		shape.printInorder();
		
		
	}
	

}
