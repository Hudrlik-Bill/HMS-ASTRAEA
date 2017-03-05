/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import HMSASTRAEA.model.Game;
import HMSASTRAEA.model.Profile;

/**
 *
 * @author Teancum
 */
public class GameControl 
{
    private static Game currentGame;
    private static Game [] savedGames = {new Game(), new Game(), new Game(), new Game(), new Game(), new Game(), new Game(), new Game()};
    
    
    public GameControl() {
    }

    public static Profile createProfile(String playerName)
    {
        if (playerName == null)
        {
            return null;
        }
        System.out.println("\n*** createProfile() called ***");
        
        Profile profileInstance = new Profile();
        profileInstance.setName(playerName);
        
        return profileInstance;
    }
    
    public static void createNewGame(Profile profile)
    {
        
        Game newGame = new Game();
        newGame.setTotalTime(0);
        newGame.setMilestone(0);
        newGame.setHealth(100);
        newGame.setInventory(0);
        newGame.setOptionSettings("none");
        newGame.setStarted(true);
        setCurrentGame(newGame);
    //System.out.println("\n*** createNewGame() called ***");
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        GameControl.currentGame = currentGame;
    }

    public static Game[] getSavedGames() {
        return savedGames;
    }

    public static void setSavedGames(Game[] savedGames) {
        GameControl.savedGames = savedGames;
    }
    
    public static void saveSingleGame (Game savedGame, int index){
        savedGames[index] = savedGame;
    }
    public static Game getSingleSavedGame (int index){
        return savedGames[index];
    }

    
    
}
