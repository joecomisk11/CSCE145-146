import java.util.Scanner;
public class Octo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a positive value and I'll count up by 8!");
		
		int numInput = keyboard.nextInt();
		
		if(numInput < 0) {
			
		
			System.out.println("That's not valid!");
			System.exit(0);
		
		}
		
		for(int i = 0; i <= numInput; i++) {
			if(i % 8 == 0){
				System.out.println(i);
			}
		}
		
	}
	
	

}
