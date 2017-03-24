/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.GameControl;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marina
 */
public class SaveMenuView extends View
{     
    public SaveMenuView()
    {
                super(  "\nSAVE MENU: Choose a save slot"
                      + "\n1 - "+GameControl.getSavedGame1().getSaveName()
                      + "\n2-  "+GameControl.getSavedGame2().getSaveName()
                      + "\n3 - "+GameControl.getSavedGame3().getSaveName()
                      + "\n4 - "+GameControl.getSavedGame4().getSaveName()
                      + "\n5 - "+GameControl.getSavedGame5().getSaveName()
                      + "\n6 - "+GameControl.getSavedGame6().getSaveName()
                      + "\n7 - "+GameControl.getSavedGame7().getSaveName()
                      + "\n8 - "+GameControl.getSavedGame8().getSaveName()
                      + "\nR - Return to Game without Saving");
    }
    @Override
    public boolean doChoice(String userChoice) {
        
    
    
    if(userChoice.equals("R")){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        return false;
    }
    int choice;
    boolean badFormat = false;
    try {
        choice = Integer.parseInt(userChoice);
        
    } catch (NumberFormatException e) {
        choice = -1;
        badFormat = true;
    }
    if(choice>0 && choice <9){
        System.out.println("\nPlease enter the name of your saved Game: ");
        String newSaveName = null;
        try {
            newSaveName = this.keyboard.readLine();
            newSaveName = newSaveName.trim();
            newSaveName = newSaveName.toUpperCase();
        } catch (IOException ex) {
            Logger.getLogger(SaveMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        GameControl.getCurrentGame().setSaveName(newSaveName);
        
        switch(choice){
            case 1: GameControl.setSavedGame1(GameControl.getCurrentGame());
            break;
            case 2: GameControl.setSavedGame2(GameControl.getCurrentGame());
            break;
            case 3: GameControl.setSavedGame3(GameControl.getCurrentGame());
            break;
            case 4: GameControl.setSavedGame4(GameControl.getCurrentGame());
            break;
            case 5: GameControl.setSavedGame5(GameControl.getCurrentGame());
            break;
            case 6: GameControl.setSavedGame6(GameControl.getCurrentGame());
            break;
            case 7: GameControl.setSavedGame7(GameControl.getCurrentGame());
            break;
            case 8: GameControl.setSavedGame8(GameControl.getCurrentGame());
            break;
            default:
            break;
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
        
        
    
    else{
        System.out.println("Invalid selection. Please enter 1-8 or 'R'");
    }
        
        return false;
    }
    
}
