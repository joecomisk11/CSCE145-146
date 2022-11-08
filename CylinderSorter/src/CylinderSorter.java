import java.util.Scanner;
public class CylinderSorter {

	public static void main(String[] args) {
		  int n;
		  int choice;
	      double radius;
	      double height;
	      String name = "";

	       
	       Scanner keyboard = new Scanner(System.in);

	       System.out.print("How many Cylinders data you want to enter ?");
	       n = keyboard.nextInt();

	       Cylinder cy[] = new Cylinder[n];
	       for (int i = 0; i < n; i++) {
	           System.out.println("Enter the name of cylinder#" + (i + 1) + ":");
	           name = keyboard.next();
	           System.out.print("Enter Radius :");
	           radius = keyboard.nextDouble();
	           System.out.print("Enter Height :");
	           height = keyboard.nextDouble();
	           cy[i] = new Cylinder(name, radius, height);
	       }
	       while (true) {
	           System.out.println("\nThe options of sorting the cylinders should be");
	           System.out.println("1. Sort by radius");
	           System.out.println("2. Sort by height");
	           System.out.println("3. Sort by volume");
	           System.out.println("4. reenter cylinder data");
	           System.out.println("5. quit");
	           System.out.print("Enter Choice:");
	           choice = keyboard.nextInt();
	           switch (choice) {
	           case 1:
	               sortByRadius(cy);
	               printResults(cy);
	               continue;
	           case 2:
	               sortByHeight(cy);
	               printResults(cy);
	               continue;
	           case 3:
	               sortByVolume(cy);
	               printResults(cy);
	               continue;
	           case 4:
	               for (int i = 0; i < n; i++) {
	                   System.out.println("Cylinder#" + (i + 1) + ":");
	                   System.out.print("Enter Radius :");
	                   radius = keyboard.nextDouble();
	                   System.out.print("Enter Height :");
	                   height = keyboard.nextDouble();
	                   cy[i] = new Cylinder(name, radius, height);

	               }
	               continue;
	           case 5:
	               break;
	           default:
	               System.out.println("** Invalid Choice **");
	               continue;

	           }
	           break;
	       }
	   }

	   private static void printResults(Cylinder[] cy) {
	       for (int i = 0; i < cy.length; i++)
	{
	           System.out.println("\nCylinder #"+(i+1)+": "+ cy[i].getName());
	           System.out.println("Radius: "+cy[i].getRadius());
	           System.out.println("Height: "+cy[i].getHeight());
	           System.out.println("Volume: "+cy[i].volume());
	           System.out.println("=================================");
	}
	  
	      
	   }

	   private static void sortByVolume(Cylinder[] cy) {
	       Cylinder temp;
	       for (int i = 0; i < cy.length; i++)
	   {
	   for (int j = i + 1; j < cy.length; j++)
	   {
	   if (cy[i].volume() > cy[j].volume())
	   {
	   temp = cy[i];
	   cy[i] = cy[j];
	   cy[j] = temp;
	   }
	   }
	   }      

	   }

	   private static void sortByHeight(Cylinder[] cy) {
	               Cylinder temp;
	               for (int i = 0; i < cy.length; i++)
	           {
	           for (int j = i + 1; j < cy.length; j++)
	           {
	           if (cy[i].getHeight() > cy[j].getHeight())
	           {
	           temp = cy[i];
	           cy[i] = cy[j];
	           cy[j] = temp;
	           }
	           }
	           }


	   }

	   private static void sortByRadius(Cylinder[] cy) {
	       Cylinder temp;
	       for (int i = 0; i < cy.length; i++)
	   {
	   for (int j = i + 1; j < cy.length; j++)
	   {
	   if (cy[i].getRadius() > cy[j].getRadius())
	   {
	   temp = cy[i];
	   cy[i] = cy[j];
	   cy[j] = temp;
	   }
	   }
	   }

	   }
	

}
