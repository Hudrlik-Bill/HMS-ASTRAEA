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
 * @author Marina
 */
public class SaveMenuView extends View
{     
    public SaveMenuView()
    {
                super(  "\nSAVE MENU: Choose a save slot"
                      + "\n1 - "+GameControl.getSavedGames()[0].getSaveName()
                      + "\n2-  "+GameControl.getSavedGames()[1].getSaveName()
                      + "\n3 - "+GameControl.getSavedGames()[2].getSaveName()
                      + "\n4 - "+GameControl.getSavedGames()[3].getSaveName()
                      + "\n5 - "+GameControl.getSavedGames()[4].getSaveName()
                      + "\n6 - "+GameControl.getSavedGames()[5].getSaveName()
                      + "\n7 - "+GameControl.getSavedGames()[6].getSaveName()
                      + "\n8 - "+GameControl.getSavedGames()[7].getSaveName()
                      + "\nR - Return to Game without Saving");
    }
    @Override
    public boolean doChoice(String userChoice) {
        
    
    int choice = 0;
    boolean badFormat = false;
    if(userChoice.equals("R")){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        return false;
    }
    try {
        choice = Integer.parseInt(userChoice);
        
    } catch (NumberFormatException e) {
        choice = -1;
        badFormat = true;
    }
    if(choice>0 && choice <9){
        choice--;
        System.out.println("\nPlease enter the name of your saved Game: ");
        Scanner userInput = new Scanner(System.in);
        String newSaveName = userInput.nextLine();
        newSaveName = newSaveName.trim();
        newSaveName = newSaveName.toUpperCase();
        //GameControl.getCurrentGame().setSaveName(newSaveName);
        //System.out.println(saveName);
        //System.out.println(GameControl.getCurrentGame().getSaveName());
        //currentSavedGames[choice-1] = GameControl.getCurrentGame();
        //System.out.println(currentSavedGames[choice-1].getSaveName());
        //System.out.println(currentSavedGames[choice-2].getSaveName());
        GameControl.saveSingleGame(GameControl.getCurrentGame(),choice);
        GameControl.getSingleSavedGame(choice).setSaveName(newSaveName);
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    else{
        System.out.println("Invalid selection. Please enter 1-8 or 'R'");
    }
        
        return false;
    }
    
}
