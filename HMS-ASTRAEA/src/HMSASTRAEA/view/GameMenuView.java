/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import java.util.Scanner;
import HMSASTRAEA.control.GameControl;
import HMSASTRAEA.model.Health;

/**
 *
 * @author Teancum
 */
public class GameMenuView extends View
{        
    public GameMenuView()
    {
                super(  "\nGAME MENU"
                      + "\nA - Action"
                      + "\nI - View Inventory"
                      + "\nH - View Health"
                      + "\nM - View Map"
                      + "\nS - Save Game"
                      + "\nQ - QUIT");
    }
    @Override
    public boolean doChoice(String userChoice) {
        switch (userChoice)
                {
                    case "A": this.actionMenu();
                        break;
                    case "I": this.displayIventory();
                        break;
                    case "H": this.displayHealth();
                        break;
                    case "M": this.displayMap();
                        break;    
                    case "S": this.saveGame();
                        break; 
                    default: 
                    {
                        ErrorView.display(this.getClass().getName(),
                                "Invalid selection. Please enter 'A', 'I', 'H', 'M', 'S', or 'Q'");
                    }
                }
        return false;
    }

    private void actionMenu() {
        this.console.println("\n*** actionMenu() called ***");
        ActionView actionMenu = new ActionView(); 
        actionMenu.displayMenu();
    }

    private void displayIventory() {
        this.console.println("\n*** displayInventory() called ***");
    }

    private void displayHealth() {
        
        Health currentHealth = GameControl.getCurrentGame().getHealth();
        
        this.console.println("\n Health Report"
                + "\nInjury:  "+ currentHealth.getOverallHealth()[0]
                + "\nHunger:  "+ currentHealth.getOverallHealth()[1]
                + "\nThirst:  "+ currentHealth.getOverallHealth()[2]
                + "\nFatigue: "+ currentHealth.getOverallHealth()[3]
                + "\nStrength:"+ currentHealth.getStrength());
    }

    private void displayMap() {
        this.console.println("\n*** displayMap() called ***");
    }
    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the "
                            +"game is to be saved");
        Scanner userInput = new Scanner(System.in);
        String filePath = userInput.nextLine();
        filePath = filePath.trim();
        filePath = filePath.toUpperCase();
        try{
            GameControl.saveGame(filePath);
        }
        catch(Exception e){
            this.displayMenu();
        }
        SaveMenuView saveMenu = new SaveMenuView();
        saveMenu.displayMenu();
        //this.console.println("\n*** saveGame() called ***");
    }
}
