/*
 * Created by Joe Comiskey
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {
  
  public static void main (String [] args) {
    System.out.println ("You are the pilot of a commerical jet holding hundreds of people and the engines start to fail. Would you like to crash it into the ocean near an island or try to reach the closest airport by gliding? Enter 'island' or 'airport'");
    
    Scanner plane = new Scanner(System.in);
      String answer1 = plane.nextLine();
      
      if (answer1.equals("airport")) {
        System.out.println("You do not make it to the runway and crash into a neighborhood. The end");
    } 
      if (answer1.equals("island")){
          System.out.println ("You have chose to try to crash into the water to make a safe landing.");
          
          System.out.println("Would you like to close far away from the island or closeby? Enter 'close' or 'far'");
          Scanner choice2 = new Scanner(System.in);
          String answer2 = choice2.nextLine(); 
            if(answer2.equals("far")){
            		System.out.println("You have been eaten by a shark trying to swim to shore. The end.");
            }
            
            		
            if (answer2.equals("close")) {
          	  System.out.println("You have successfully landed the plane to the best of your ability and 12/16 passengers survive. ");
          	 
          	 System.out.println("Do you want to look for food, start looking for materials for housing, or both? Enter 'food' or 'house' or 'both'");
             
          	  Scanner choice4 = new Scanner(System.in);
              String answer4 = choice4.nextLine();
              
             
              if(answer4.equals("food")) {
            	  System.out.println("You and your crew have been attacked by a landshark and have been eaten alive in the middle of the night. The End. ");
              }
              if(answer4.equals("house")){
            	  System.out.println("You and your crew have been eaten alive by crazy monkeys while gathering supplies. The end");
              }
              if(answer4.equals("both")) {
            	  System.out.println("You have gathered enough food and materials to eat and shelter for the night.");
            	  
            
                 
                  System.out.println("You have woken up the next morning. Would you like to go explore the island by yourself or talk to the rest of the crew? Enter 'explore' or 'talk'");
                  
                  Scanner choice5 = new Scanner(System.in);
                  String answer5 = choice5.nextLine();
                
                  if(answer5.equals("explore")) {
                	  System.out.println("You have found others on the island and you have been slain. The end");
                  }
                  if(answer5.equals("talk")){
                	  System.out.println("You talk about what you should do next as a group.");
                	 
                	  
                	  System.out.println("You see another group of people living on the island. Do you want to fight them or just observe? Enter 'fight' or 'observe'");
                     
                	  Scanner choice6 = new Scanner(System.in);
                      String answer6 = choice6.nextLine();
                      
                      if(answer6.equals("fight")) {
                		  System.out.println("They have much better technology and weapons and they kill you and all of your crew. The end.");
                  }
                      
                      
                    	  if(answer6.equals("observe")){
                    		  System.out.println("You see they are very advanced and you return back to your base to prepare. There are 12 people that survived including you. How many weapons would you like to make? Enter a number between 1 and 12.");

                           
                              Scanner choice8 = new Scanner(System.in);
                              int answer8 = choice8.nextInt();
                              
                              if(answer8 < 8 && answer8 >= 0) {
                            	  System.out.println("You did not have enough weaponry to take on the rival tribe and all of you have died. The end.");
                              }
                              if(answer8 >= 8) {
                            	  System.out.println("You have enough weaponry to take on the rival tribe and you end up killing them all");
                            	  System.out.println("Do you want to check the cave in their camp to see if there are valuables? Enter 'check' or 'no'");
                            	  Scanner choice10 = new Scanner(System.in);
                                  String answer10 = choice10.nextLine();
                                  
                                  if(answer10.equals("no")) {
                                	  System.out.println("You are stuck with very limited supplies and some men die of starvation." );
                                  }
                            	  if(answer10.equals("check")) {
                            		  System.out.println("You find a flare gun that can be used to help you escape the island!");
                            		  
                            		  System.out.println("Do you want to stay on the shore of the island or go back to shelter in the middle? Enter 'shore' or 'home'");

                                	  Scanner choice9 = new Scanner(System.in);
                                      String answer9 = choice9.nextLine();
                                   
                                      
                                      if(answer9.equals("home")) {
                                    	  System.out.println("You end up dying due to no one coming to your rescue and running out of supplies");
                                      }
                                      if(answer9.equals("shore")){
                                    	  System.out.println("You see a boat coming in the distance!");
                                    	  
                                    	  System.out.println("Do you want to shoot the flare gun now or wait for the boat to get closer? Enter 'now' or 'wait'" );
                                    	  Scanner choice11 = new Scanner(System.in);
                                          String answer11 = choice11.nextLine();
                                    	  
                                          if(answer11.equals("wait")){
                                          		System.out.println("The boat turns around due to a storm brewing and you starve to death.The end" );
                                          }
                                          
                                          if(answer11.equals("now")) {
                                        	  System.out.println("The boat sees the flare shot from far away and comes towards the island. Everyone is rescued and returned home!");
                                          }
                                          		
                                      }
                            	  }
                                
                              }
                    	  
                
                              }
                              
                              
                    	  }
                    	 
                    	  
                    
                  }
                  
                 
            }
              }
              	
             
          	  }
  }
