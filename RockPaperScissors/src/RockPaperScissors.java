
import java.util.Scanner;
import java.util.Random;
/**
 * 
 * Created by Joe Comiskey
 *
 */
public class RockPaperScissors {

    public static void main(String[] args) {
      
        while(true){
        int wins = 0;
        int losses = 0;
        int round = 0;
        int USER = 0;

        System.out.println("Rock Paper Scissors Game! Best 2 out of 3!");
        System.out.println("Enter \"Rock\", \"Paper\" or \"Scissors\"");

        while(round<3) {

            Random GAME = new Random();
            int player = 1+GAME.nextInt(3);

            Scanner keyboard = new Scanner (System.in);
            int SCISSOR, ROCK, PAPER;
            ROCK = 1;
            PAPER = 2;
            SCISSOR= 3;

            String input =  keyboard.next();
            if(input.equals("Rock"))  {
                   USER = 1;
            }
            if(input.equals("Paper")) {
                   USER = 2;
            }
            if(input.equals("Scissors")) {
                   USER = 3;
            }



            while (USER > 3 || USER < 1) {
                System.out.println("Incorrect value entered.");
                System.exit(0);
                break;
            }

            if(USER == player){
                if(USER == SCISSOR){
                    System.out.println("Scissors v Scissors! Tie!");

            }
                if(USER == ROCK){
                    System.out.println("Rock v Rock! Tie!");
            }
                if(USER == PAPER){
                    System.out.println("Paper v Paper! Tie!");
            }
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }
           

            if(USER == SCISSOR)
                if(player == PAPER){
                System.out.println("Scissors v Paper! Player Wins!");
                wins++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }
                        else if(player == ROCK){
                System.out.println("Scissors v Rock! Computer Wins!");
                losses++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }
            
            if(USER == ROCK)
                if(player == SCISSOR ){
                System.out.println("Rock v Scissor! Player Wins!");
                wins++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }   
            else if (player == PAPER){
                System.out.println("Rock v Paper! Computer Wins!");
                losses++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }

            if(USER == PAPER)
                if(player == ROCK){
                System.out.println("Paper v Rock! Player Wins!");
                wins++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
                }
            else if (player == SCISSOR){
                System.out.println("Paper v Scissors! Computer Wins!");
                losses++;
                round++;
                System.out.println("Player has won " + wins + " times and the computer has won " + losses + " times");
                System.out.print("Enter \"Rock\", \"Paper\" or \"Scissors\" \n");
            }

            }

            if(wins>losses){
                System.out.println("The Player Wins!");
            }if(losses>wins){
                System.out.println("The Computer Wins!");
            }
            System.out.println("Play again? \"Yes\" or \"No\"");
            Scanner YN = new Scanner(System.in);

            String YN_String = YN.next();
            if(YN_String.equals("Yes") || YN_String.equals("yes")){
            }if(YN_String.equals("No") || YN_String.equals("no")) {
                System.out.println ("Goodbye!");
                break;
            }

        }
    }

}