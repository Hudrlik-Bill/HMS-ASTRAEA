/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.GameControl;
import HMSASTRAEA.model.Profile;

import java.util.Scanner;

/*
 * @author Teancum
 */

public class StartProgramView 
{
    private String promptMessage;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StartProgramView() 
    {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }
    
    public void displayBanner()
    {
        System.out.println(
                  "\n********************************************************************************"
                + "\n****************************Welcome to HMS ASTRAEA!*****************************"
                + "\n**\tIn this game, you will need to survive until you can figure out how   **"
                + "\n** to get off the island. Do you have what it takes?                          **"
                + "\n**\tYou can try to go solo, but it may be better to team up with          **"
                + "\n** others. You'll need water, food, and somewhere to sleep. And watch out!    **"
                + "\n** There may be hidden dangers as you explore. Good luck! See you at the end! **"
                + "\n********************************************************************************"
                + "\n********************************************************************************"
        );
    }
    
    public void displayStartProgramView()
    {
        
        boolean done = false;
            do
            {
                String playerName = this.getPlayerName();
                if (playerName.toUpperCase().equals("Q"))
                        return;
                
                done = this.doAction(playerName);
            }
            while (!done);
    }

    private String getPlayerName() 
    {
       Scanner nameInput = new Scanner(System.in);
       String playerName = "";
       boolean validateMe = false; 
            
       while (!validateMe)
       {
           System.out.println("\n" + this.promptMessage);
           playerName = nameInput.nextLine();
           playerName = playerName.trim(); 
           
           if (playerName.length() < 1)
           {
               System.out.println("\nInvalid input. Name cannot be blank.");
               continue;
           }
           
           break;
       }
       
       return playerName;
    }

    private boolean doAction(String playerName) 
    {
       if (playerName.length() < 2)
       {
           System.out.println("Invalid. Name must be more than one character.");
           return false;
       }

    
       Profile profileInstance = GameControl.createProfile(playerName);
       
       if (profileInstance == null)
       {
           System.out.println("\nError creating profile.");
           return false;
       }
       
       this.displayWelcome(profileInstance);
       
       return true;
    }

    private void displayWelcome(Profile profileInstance) 
    {
        System.out.println("\n/////////////////////////"
                         + "\n     Welcome, " + profileInstance.getName()
                         + "\n     Enjoy the Game!"
                         + "\n/////////////////////////");
        
        MainMenuView gameMenuObject = new MainMenuView();
        
        gameMenuObject.displayMenu();
    }

}
