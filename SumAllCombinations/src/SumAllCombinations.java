//Written by Joe Comiskey
import java.util.*;
public class SumAllCombinations {
	public static final int SIZE = 5;
	public static final int RANGE = 100;
	public static void main(String[] args) {
		System.out.println("Welcome to the sum of all combinations program");
		int[] a = new int[SIZE];
		populateRandomArray(a);
		sumAndPrintComb(a);
		
	}
	//Selects random numbers and adds it to array "a". Also prints the numbers that are filled into the array
	public static void populateRandomArray(int[]a)
	{
		Random r = new Random();
		System.out.print("Given array = {");
		for(int i=0; i<a.length; i++)
		{
			a[i] = r.nextInt(RANGE);
			System.out.print(a[i]+ " ");
		}
		System.out.println("}, all summed combinations are: ");
	}
	//Calls recursive method. This array expands as it moves on
	public static void sumAndPrintComb(int[]a)
	{
		 sumAndPrintComb(a,new int[1],0,1);
	}
	//recursive version of method above. Creates a smaller version of the array
	//Creates new array given size and it copies the values from the working array into the new array "c"
	//Recursively calls the method by adding 1 to currI and currD
	public static void sumAndPrintComb(int[]a,int[]workingArray,int currI, int currD)
	{
		if(currI >= a.length || currD > a.length)
			return;
		int[]c = new int [currD];
		for(int i=0; i<workingArray.length;i++)
			c[i] = workingArray[i];
		c[c.length-1] = a[currI];
		print(c);
		sumAndPrintComb(a,c,currI+1,currD+1);	
		sumAndPrintComb(a,c,currI+1,currD);
	}
	//Prints the array to the console
	public static void print(int[] a)
	{
		System.out.print(a[0]);
		for(int i=1;i<a.length;i++)
			System.out.print(" + "+a[i]);
		System.out.println(" = "+sum(a));
	}
	//Gets the sum of the array and stores it in ret.
	public static int sum(int[] a)
	{
		int ret = 0;
		for(int i=0;i<a.length;i++)
			ret += a[i];
		return ret;
	}
}