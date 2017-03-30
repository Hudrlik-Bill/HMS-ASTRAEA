/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.GameControl;
import HMSASTRAEA.model.Game;
import java.util.Scanner;


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
                      + "\nS - SAVE GAME"
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
                    case "S": this.SavedGame();
                        break;    
                    case "O": this.displayOptionsMenu();
                        break;
                    case "H": this.displayHelpMenu();
                        break;
                    default: 
                        {   
                            ErrorView.display(this.getClass().getName(),
                                    "Invalid selection. Please enter 'N', 'R', 'O', 'H', or 'Q'");
                        }
                }
        return false;
    }

    private void startNewGame() 
    {
        this.console.println("*** startNewGame() called***");
        GameControl.createNewGame(Game.getUserProfile());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void resumeSavedGame() 
    {
        this.console.println("*** resumeSavedGame() called ***");
        this.console.println("\n\nEnter the file path for the file where the "
                            +"game was saved.");
        Scanner userInput = new Scanner(System.in);
        String filePath = userInput.nextLine();
        filePath = filePath.trim();
        filePath = filePath.toUpperCase();
        try{
            GameControl.getSavedGame(filePath);
            
        }
        catch(Exception e){
            MainMenuView gameMenuObject = new MainMenuView();
            gameMenuObject.displayMenu();
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayOptionsMenu() 
    {
        this.console.println("*** displayOptionsMenu() called ***");
        
        OptionsMenuView optionsMenu = new OptionsMenuView();
        optionsMenu.displayMenu();
    }

    private void displayHelpMenu() 
    {
        this.console.println("*** displayHelpMenu() called ***");
        
        HelpMenuView helpMenu = new HelpMenuView(); 
        helpMenu.displayMenu();
    }

    private void SavedGame() {
        this.console.println("*** saveGame() called***");
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where "
                           + "the game is to be saved.");
        String filePath = this.getInput();
    }

}
