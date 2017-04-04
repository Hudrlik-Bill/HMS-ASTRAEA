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
import HMSASTRAEA.model.Scene;
import HMSASTREA.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        System.out.println("\n*** createNewGame() called ***");
                
        Game game = new Game();
        GameControl.setCurrentGame(game);
        
        Game.setUserProfile(profile);
        
        Inventory inventory = GameControl.createInventoryList();//create inventory here in game control
        game.setInventory(inventory);                       //save the inventory into the new game
        
        game.setTotalTime(0);
        
        Health health = GameControl.createHealthStatus(); //The overallHealth variable in Health is a double
        game.setHealth(health);                        //Everywhere else, it is a Health class
        
        Map map = GameControl.initializeMap();
        game.setMap(map);
        
        game.setCharacter(HMSASTRAEA.model.Player.Teancum);
        setCurrentGame(game);
    }

    public static Inventory createInventoryList() 
    {
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
    /**
     *
     */
        Inventory containerList = new Inventory();        
        
        Container mapInventory = new Container();
        mapInventory.setContainerType(0);
        mapInventory.setContainerQuantity(1);
        mapInventory.setContainerWeight(1000000000);
        mapInventory.setContainerID(0);
        mapInventory.setContainerDescription("Map has it all");
        containerList.add(new Container(mapInventory));
        
        Container crate01Inventory = new Container();
        mapInventory.setContainerType(1);
        mapInventory.setContainerQuantity(0);
        mapInventory.setContainerWeight(0);
        mapInventory.setContainerID(1);
        crate01Inventory.setContainerDescription("Initialize crate list at 1");
        containerList.add(new Container(crate01Inventory));
        
        Container shedInventory = new Container();
        mapInventory.setContainerType(2);
        mapInventory.setContainerQuantity(0);
        mapInventory.setContainerWeight(0);
        mapInventory.setContainerID(2);
        shedInventory.setContainerDescription("Initialize shed list at 2");
        containerList.add(new Container(shedInventory));
        
        Container cartInventory = new Container();
        mapInventory.setContainerType(3);
        mapInventory.setContainerQuantity(0);
        mapInventory.setContainerWeight(0);
        mapInventory.setContainerID(3);
        cartInventory.setContainerDescription("Initialize cart list at 3");
        containerList.add(new Container(cartInventory));
        
        Container teancumInventory = new Container();
        mapInventory.setContainerType(4);
        mapInventory.setContainerQuantity(1);
        mapInventory.setContainerWeight(185);
        mapInventory.setContainerID(4);
        teancumInventory.setContainerDescription("Whatever is on the Teancum's person");
        containerList.add(new Container(teancumInventory));
        
        Container gidgidoniInventory = new Container();
        mapInventory.setContainerType(5);
        mapInventory.setContainerQuantity(1);
        mapInventory.setContainerWeight(165);
        mapInventory.setContainerID(5);
        gidgidoniInventory.setContainerDescription("Whatever is on Gidgidoni's person");
        containerList.add(new Container(gidgidoniInventory));
        
        Container estherInventory = new Container();
        mapInventory.setContainerType(6);
        mapInventory.setContainerQuantity(1);
        mapInventory.setContainerWeight(120);
        mapInventory.setContainerID(6);
        estherInventory.setContainerDescription("Whatever is on Esther's person");
        containerList.add(new Container(estherInventory));
        int[] carriedItems = {0,2,0,0,0,0,3,1,0,0,0,0,0,0,0};
        containerList.setCarriedItems(carriedItems);
        return containerList;
    }
    
        public static Health createHealthStatus() 
    {
        int[] initialHealth = {100,100,100,100};
        Health currentHealth = new Health();
        currentHealth.setOverallHealth(initialHealth);
        System.out.println("***Health status set at 50%***");
        return currentHealth;
    }

    private static Map initializeMap() 
    {
        Map map = new Map();            //Hopefully this made a new map...
        Scene[] scenes = createScenes();//This makes a list of scenes to add to the map....maybe
        GameControl.assignScenestoLocation(map, scenes);
        return map;
    }
    
    private static Scene[] createScenes() 
    {
        System.out.println("***Scene[] createScenes() called***");
        return null;
    }

    private static void assignScenestoLocation(Map map, Scene[] scenes) 
    {
        System.out.println("***assignScenestoLocation called***");
    }
    
    public static Game getCurrentGame() 
    {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) 
    {
        GameControl.currentGame = currentGame;
    }

    public static Game getSavedGame1() 
    {
        return savedGame1;
    }

    public static void setSavedGame1(Game savedGame1) 
    {
        GameControl.savedGame1 = savedGame1;
    }

    public static Game getSavedGame2() 
    {
        return savedGame2;
    }

    public static void setSavedGame2(Game savedGame2) 
    {
        GameControl.savedGame2 = savedGame2;
    }

    public static Game getSavedGame3() 
    {
        return savedGame3;
    }

    public static void setSavedGame3(Game savedGame3) 
    {
        GameControl.savedGame3 = savedGame3;
    }

    public static Game getSavedGame4() 
    {
        return savedGame4;
    }

    public static void setSavedGame4(Game savedGame4) 
    {
        GameControl.savedGame4 = savedGame4;
    }

    public static Game getSavedGame5() 
    {
        return savedGame5;
    }

    public static void setSavedGame5(Game savedGame5) 
    {
        GameControl.savedGame5 = savedGame5;
    }

    public static Game getSavedGame6() 
    {
        return savedGame6;
    }

    public static void setSavedGame6(Game savedGame6) 
    {
        GameControl.savedGame6 = savedGame6;
    }

    public static Game getSavedGame7() 
    {
        return savedGame7;
    }

    public static void setSavedGame7(Game savedGame7) 
    {
        GameControl.savedGame7 = savedGame7;
    }

    public static Game getSavedGame8() 
    {
        return savedGame8;
    }

    public static void setSavedGame8(Game savedGame8) 
    {
        GameControl.savedGame8 = savedGame8;
    }
    public static void saveGame(String filePath) throws GameControlException{
        
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(currentGame);
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }
    public static void getSavedGame(String filePath)
                            throws GameControlException {
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        setCurrentGame(game);
    }
    
}
