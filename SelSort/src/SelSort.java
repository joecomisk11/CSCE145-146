import java.util.Scanner;
public class SelSort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the selection sort program\nEnter the size of the array");
		int size = keyboard.nextInt();
		
		if(size <1) {
			System.out.println("That is an invalid size");
			System.exit(0);
		}
		int[] a = new int[size];
		for(int i = 0; i<a.length;i++) {
			System.out.println("Enter value at index " + i);
			a[i] = keyboard.nextInt();
			
		}
		//selection sort
		for(int i =0; i<a.length;i++) 
		{
			int smallestIndex = i;
			for(int j = i+1; j<a.length;j++) 
			{
				if(a[j] < a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(smallestIndex != i)
			{
				//swap
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		System.out.println("The sorted array is");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	

	}

}
