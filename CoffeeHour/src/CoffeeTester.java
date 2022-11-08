import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's Coffee!!!1!11!!ONE!!!1!");
		System.out.println("What's the name of the first coffee?");
		String coffee1Name = keyboard.next();
		System.out.println("What's the caffeine content?");
		int coffee1Caff = keyboard.nextInt();
		Coffee coffee1 = new Coffee(coffee1Name, coffee1Caff);
		
		System.out.println("What's the name of the second coffee?");
		
		String coffee2Name = keyboard.next();
		System.out.println("What's the caffeine content?");
		int coffee2Caff = keyboard.nextInt();
		Coffee coffee2 = new Coffee(coffee2Name, coffee2Caff);
		
		System.out.println(coffee1.toString());
		System.out.println(coffee2.toString());
		

	}

}
