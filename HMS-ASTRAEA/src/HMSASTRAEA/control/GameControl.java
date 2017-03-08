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
    private static Game savedGame1;
    private static Game savedGame2;
    private static Game savedGame3;
    private static Game savedGame4;
    private static Game savedGame5;
    private static Game savedGame6;
    private static Game savedGame7;
    private static Game savedGame8;
    
    
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
        newGame.setInventory(null);
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

    public static Game getSavedGame1() {
        return savedGame1;
    }

    public static void setSavedGame1(Game savedGame1) {
        GameControl.savedGame1 = savedGame1;
    }

    public static Game getSavedGame2() {
        return savedGame2;
    }

    public static void setSavedGame2(Game savedGame2) {
        GameControl.savedGame2 = savedGame2;
    }

    public static Game getSavedGame3() {
        return savedGame3;
    }

    public static void setSavedGame3(Game savedGame3) {
        GameControl.savedGame3 = savedGame3;
    }

    public static Game getSavedGame4() {
        return savedGame4;
    }

    public static void setSavedGame4(Game savedGame4) {
        GameControl.savedGame4 = savedGame4;
    }

    public static Game getSavedGame5() {
        return savedGame5;
    }

    public static void setSavedGame5(Game savedGame5) {
        GameControl.savedGame5 = savedGame5;
    }

    public static Game getSavedGame6() {
        return savedGame6;
    }

    public static void setSavedGame6(Game savedGame6) {
        GameControl.savedGame6 = savedGame6;
    }

    public static Game getSavedGame7() {
        return savedGame7;
    }

    public static void setSavedGame7(Game savedGame7) {
        GameControl.savedGame7 = savedGame7;
    }

    public static Game getSavedGame8() {
        return savedGame8;
    }

    public static void setSavedGame8(Game savedGame8) {
        GameControl.savedGame8 = savedGame8;
    }

    

    
    
}
