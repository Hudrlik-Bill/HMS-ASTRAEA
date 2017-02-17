/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import java.util.Scanner;


/**
 *
 * @author Teancum
 */
public class GameMenu 
{
    private String gameMenu;

    public void displayGameMenu() 
    {
        this.gameMenu = "\nMAIN MENU"
                      + "\nN - NEW GAME"
                      + "\nR - RESUME GAME"
                      + "\nO - OPTIONS"
                      + "\nH - HELP"
                      + "\nQ - QUIT";
        
        boolean check = false;
        do 
        {
            String userChoice = this.getUserChoice();
            if (userChoice.toUpperCase().equals("Q"))
            {
                return;
            }
            
            check = this.doChoice(userChoice);
        }
        while (!check);
    }

    private String getUserChoice() 
    {
        System.out.println("\nPlease enter your choice: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        userChoice = userChoice.trim();
        userChoice = userChoice.toUpperCase();
        return userChoice;
    }

    private boolean doChoice(String userChoice) 
    {
        switch (userChoice)
                {
                    case "N": this.startNewGame();
                        break;
                    case "R": this.resumeSavedGame();
                        break;
                    case "O": this.displayOptionsMenu();
                        break;
                    case "H": this.displayHelpMenu();
                        break;
                    default: System.out.println("Invalid selection. Please enter 'N', 'R', 'O', 'H', or 'Q'");
                }
        return false;
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void resumeSavedGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayOptionsMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
