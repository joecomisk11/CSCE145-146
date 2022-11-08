/* 
 * Created by Joe Comiskey
 */
import java.util.Scanner;
public class TheCoinMachine {

	public static void main(String[] args) {
		System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		int coinAmount;
		coinAmount = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("You will receive: ");
		
		System.out.println(coinAmount /25 + " quarters");
		coinAmount = coinAmount % 25;
		
		System.out.println(coinAmount / 10 + " dimes");
		coinAmount = coinAmount % 10;
		
		System.out.println(coinAmount / 5 + " nickles");
		coinAmount = coinAmount % 5;
		
		System.out.println(coinAmount / 1 + " pennies");
		
		
	}

}
