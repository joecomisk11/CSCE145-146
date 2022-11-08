/*
 * Written by Joe Comiskey
 */
import java.util.Scanner;

public class VectorMath {

	public static void main(String[] args) {
		boolean complete = false;

		System.out.println("Welcome to the Vector Operations Program!");
		
		
		while(!complete) {
			System.out.println("Enter 1. To Add Two Vectors\nEnter 2. To Subtract Two Vectors\nEnter 3. To Find The Magnitude of a Vector\nEnter 9. To Quit");

			Scanner keyboard = new Scanner(System.in);
			int userInput = keyboard.nextInt();			
			
			if(userInput == 1) {
				
				
				System.out.println("Enter the size of the vectors");
				int vecSize = keyboard.nextInt();
				if(vecSize > 0) {
				double[]vec1 = new double[vecSize];
				double[]vec2 = new double[vecSize];
				

				System.out.println("Enter the values for Vector 1");
				for(int i = 0; i<vecSize;i++) {
					vec1[i] = keyboard.nextDouble();
				}
				System.out.println("Enter the values for Vector 2");
				for(int i = 0; i<vecSize;i++) {
					vec2[i] = keyboard.nextDouble();
				}
				double[]finalVec = new double[vecSize * 2];
				for(int i = 0; i<vecSize; i++) {
					finalVec[i] = vec1[i] + vec2[i];
				}
				System.out.println("Result:");
				for(int i = 0; i<vecSize; i++) {
					System.out.println(vec1[i]);
				}
				System.out.println("+");
				for(int i = 0; i<vecSize; i++) {
					System.out.println(vec2[i]);
				}
				System.out.println("=");
				for(int i = 0;i<vecSize;i++) {
					System.out.println(finalVec[i]);
				}
				}
				else {
					System.out.println("Invalid size");
				}
				
			}
			if(userInput == 2) {
			System.out.println("Enter the size of the vectors");
			int vecSize = keyboard.nextInt();
			if(vecSize > 0) {
			double[]vec1 = new double[vecSize];
			double[]vec2 = new double[vecSize];

			System.out.println("Enter the values for Vector 1");
			for(int i = 0; i<vecSize;i++) {
				vec1[i] = keyboard.nextDouble();
			}
			System.out.println("Enter the values for Vector 2");
			for(int i = 0; i<vecSize;i++) {
				vec2[i] = keyboard.nextDouble();
			}
			double[]finalVec = new double[vecSize * 2];
			for(int i = 0; i<vecSize; i++) {
				finalVec[i] = vec1[i] - vec2[i];
			}
			System.out.println("Result:");
			for(int i = 0; i<vecSize; i++) {
				System.out.println(vec1[i]);
			}
			System.out.println("-");
			for(int i = 0; i<vecSize; i++) {
				System.out.println(vec2[i]);
			}
			System.out.println("=");
			for(int i = 0;i<vecSize;i++) {
				System.out.println(finalVec[i]);
			}
			}else {
				System.out.println("Invalid size");
			}
			}
			if(userInput == 3) {
				System.out.println("Enter the size of the vector");
				int vecSize = keyboard.nextInt();
				if(vecSize > 0) {
				System.out.println("Enter values for the Vector");
				double[]vecMag = new double[vecSize];
				for(int i = 0; i<vecSize; i++) {
					vecMag[i] = keyboard.nextDouble();
				}
				double total = 0;
				for(int i = 0;i<vecSize;i++) {
					total += Math.pow(vecMag[i],2);
				}
				System.out.println("The magnitude is: " + (Math.sqrt(total)));
			}else {
				System.out.println("Invalid size");
			}
				}
			if(userInput == 9) {
				System.out.println("Goodbye!");
				complete = true;
			}
			
		}
			
		}
	}
	


