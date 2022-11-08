import java.util.Scanner;
public class ClosestValue {
public static final int SIZE = 5;
public static final double PRICE = 5.97;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] prices = new double[SIZE];
		System.out.println("Welcome to the closest without going over game!\nGuess the price of the game");
		for(int i=0; i<prices.length;i++)
		{
			System.out.println("Contestant " + i + " enter a non negative price!");
			double newPrice = keyboard.nextDouble();
			if(newPrice >= 0.0)
			{
				prices[i] = newPrice;
			}
			else
			{
				System.out.println("That price is invalid!");
				prices[i] = 0.0;
			}
		}
		System.out.println("The actual price is " + PRICE);
		
		double closestPrice = -1.00;
		int winnerIndex = -1;
		
		for(int i =0;i<prices.length;i++)
		{
			if(prices[i] <= PRICE && prices[i] > closestPrice)
			{
				closestPrice = prices[i];
				winnerIndex = i;
			}
		}
		if(winnerIndex == -1)
		{
			System.out.println("No one wins!");
		}
		else{
			System.out.println("The winner is contestant " + winnerIndex + " with a guess of " + closestPrice);
		}

	}

}
