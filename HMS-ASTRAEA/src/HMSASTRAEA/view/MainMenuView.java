/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.GameControl;
import HMSASTRAEA.model.Game;


/**
 *
 * @author Teancum
 */
public class MainMenuView extends View
{
    public MainMenuView()
    {
        super ("\nMAIN MENU"
                      + "\nN - NEW GAME"
                      + "\nR - RESUME GAME"
                      + "\nO - OPTIONS"
                      + "\nH - HELP"
                      + "\nQ - QUIT");
    }

    @Override
    public boolean doChoice(String userChoice) 
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
                    default: 
                        {   
                            System.out.println("Invalid selection. Please enter 'N', 'R', 'O', 'H', or 'Q'");
                            //System.out.println(gameMenu);
                        }
                }
        return false;
    }

    private void startNewGame() 
    {
        System.out.println("*** startNewGame() called***");
        GameControl.createNewGame(Game.getUserProfile());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void resumeSavedGame() 
    {
        System.out.println("*** resumeSavedGame() called ***");
    }

    private void displayOptionsMenu() 
    {
        System.out.println("*** displayOptionsMenu() called ***");
        
        OptionsMenuView optionsMenu = new OptionsMenuView();
        optionsMenu.displayMenu();
    }

    private void displayHelpMenu() 
    {
        System.out.println("*** displayHelpMenu() called ***");
        
        HelpMenuView helpMenu = new HelpMenuView(); 
        helpMenu.displayMenu();
    }

}
