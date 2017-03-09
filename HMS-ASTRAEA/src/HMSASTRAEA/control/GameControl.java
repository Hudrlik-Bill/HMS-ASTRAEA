/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import HMSASTRAEA.model.Container;
import HMSASTRAEA.model.Game;
import HMSASTRAEA.model.Inventory;
import HMSASTRAEA.model.Profile;
import HMSASTRAEA.model.Health;
import HMSASTRAEA.model.Map;
import java.util.ArrayList;

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

    
    private static Inventory createInventoryList() 
    {
        ArrayList<Container> containerList = new ArrayList<>();
        
        /*
        **I think the right way to do this is to initialize a few default inventories. Setting the map inventory to 0
        **may or may not be the best idea; but I went back to the matrix we made weeks ago and wanted to make sure that
        **the first few ArrayList slots matched the numbers for the different containers. 
        **0 = Map (not on the matrix)
        **1 = Crate ; here, I've created a crate but we won't put anything in it. It's just a default null setting. 
        **             why? Left field. I don't know. Third base!
        **2 = Shed
        **3 = Cart
        **4 = Self (Teancum)
        **5 = Gidgidoni
        **6 = Esther
        **Additional containers will likely be crates, as there can only be 1 of each of the other container types. 
        **Even though most of the containers do not yet exist, we need to have a spot for them in the game so that
        **when they do exist there is somewhere to put them and the stuff in them.
        */
        
        Container mapInventory = new Container();
        mapInventory.setContainerDescription("Map has it all");
        containerList.add(mapInventory);
        
        Container crate01Inventory = new Container();
        crate01Inventory.setContainerDescription("Initialize crate list at 1");
        containerList.add(crate01Inventory);
        
        Container shedInventory = new Container();
        shedInventory.setContainerDescription("Initialize shed list at 2");
        containerList.add(shedInventory);
        
        Container cartInventory = new Container();
        cartInventory.setContainerDescription("Initialize cart list at 3");
        containerList.add(cartInventory);
        
        Container teancumInventory = new Container();
        teancumInventory.setContainerDescription("Whatever is on the character's person");
        containerList.add(teancumInventory);
        
        Container gidgidoniInventory = new Container();
        gidgidoniInventory.setContainerDescription("Whatever is on the character's person");
        containerList.add(gidgidoniInventory);
        
        Container estherInventory = new Container();
        estherInventory.setContainerDescription("Whatever is on the character's person");
        containerList.add(estherInventory);
        
        return null;
    }
    
    private static Health createHealthStatus() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Map initializeMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
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
        System.out.println("\n*** createNewGame() called ***");
                
        Game newGame = new Game();
        GameControl.setCurrentGame(newGame);
        
        Game.setUserProfile(profile);
        Inventory inventory = GameControl.createInventoryList();
        newGame.setInventory(inventory);
        
        newGame.setTotalTime(0);
        //newGame.setMilestone(0); **for simplicity, consider removing from assignment
        
        Health health = GameControl.createHealthStatus(); //The overallHealth variable in Health is a double
        newGame.setHealth(health);                        //Everywhere else, it is a Health class
        
        newGame.setOptionSettings("default"); //We won't be doing anything with this; just stubs
        newGame.setStarted(true); //Why did we have this? ...
        
        Map map = GameControl.initializeMap();
        newGame.setMap(map);
        
        newGame.setCharacter(HMSASTRAEA.model.Character.Teancum);
        setCurrentGame(newGame);
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
