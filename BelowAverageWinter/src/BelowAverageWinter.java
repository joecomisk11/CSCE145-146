/*
v * Written by Joe Comiskey
 */

import java.util.Scanner;
public class BelowAverageWinter {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the below average temperature tester program");
		double[]temps = new double[SIZE];
		double sum = 0.0;
		for(int i=0; i<temps.length;i++) {
			System.out.println("Enter the temperature for day " + (i+1));
			temps[i] = keyboard.nextDouble();
			sum += temps[i];
		}
		double avg = sum / temps.length;
		System.out.println("The average temperature was "+avg+"\nThe days that were below average were");
		for(int i=0; i<temps.length;i++) {
			if(temps[i] < avg) {
				System.out.println("Day "+(i+1)+" with "+temps[i]);
			}
		}

	}

}
