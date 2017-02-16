/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

/*
 * @author Teancum
 */

public class StartProgramView 
{
    private String promptMessage;
    
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
    
    public static void main (String[] args)
    {
        StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
    }

    public void displayStartProgramView() 
    {
        boolean done = false;
            do
            {
                String playerName = this.getPlayerName();
                if (playerName.toUpperCase().equals(Q))
                        return;
                
                done = this.doAction(playerName);
            }
            while (!done);
    }

    private String getPlayerName() 
    {
        System.out.println("\n*** getPlayerName() function called ***");
                return "Doughnut";
    }

    private boolean doAction(String playerName) 
    {
       System.out.println("\n*** doAction() function called, return boolean ***");
                return true;
    }
}
