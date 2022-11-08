package bubblesort;
import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the bubble sort program\nEnter the size of the array");
		int size = keyboard.nextInt();
		if(size <=0)
		{
			System.out.println("That is an invalid size");
			System.exit(0);
		}
		int[]a = new int[size];
		for(int i =0;i<a.length;i++)
		{
			System.out.println("Enter a value at index " + i);
			a[i] = keyboard.nextInt();
		}
		//bubble sort
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i] > a[i+1])
				{
					//swap
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
