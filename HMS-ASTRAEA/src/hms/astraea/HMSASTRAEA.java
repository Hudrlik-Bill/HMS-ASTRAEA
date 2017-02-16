/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.astraea;

import HMSASTRAEA.model.Inventory;
import HMSASTRAEA.model.WaterCraft;
import HMSASTRAEA.model.Backpack;
import HMSASTRAEA.model.Shelter;
import HMSASTRAEA.model.Location;
import HMSASTRAEA.model.Map;
import HMSASTRAEA.model.Game;

/**
 *
 * @author Teancum
 */
public class HMSASTRAEA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventory wood = new Inventory();

        wood.setItemType(1);
        wood.setItemQuantity(1);
        wood.setRequiredQuantity(1);

        String itemDescription = wood.toString();
        System.out.println(wood);

        WaterCraft raft = new WaterCraft();

        raft.setCraftLength(10);
        raft.setCraftWidth(5);
        raft.setCraftType("flat");
        raft.setItemNumber(1);
        raft.setItemType("bucket");
        raft.setItemWeight(10);
        raft.setLoadedWeight(20);
        raft.setMaxWeight(100);

        String craft = raft.toString();
        System.out.println(craft);

        Backpack brown = new Backpack();
        
        brown.setItemType("food");
        brown.setItemWeight(10);
        brown.setItemNumber(1);
        brown.setLoadedWeight(15);
        brown.setMaxWeight(50);
        
        String bag = brown.toString();
        System.out.println(bag);
        
        Shelter hut = new Shelter();
        
        hut.setShelterInventory("water");
        
        String home = hut.toString();
        System.out.println(home);
        
        Location beach = new Location();
        
        beach.setColumn(1);
        beach.setRow(1);
        beach.setResource("fish");
        beach.setVisited(true);
        
        String place = beach.toString();
        System.out.println(place);
        
        Map firstmap = new Map();
        
        firstmap.setColumn(1);
        firstmap.setRow(1);
        
        String start = firstmap.toString();
        System.out.println(start);
        
        Game playerOne = new Game();
        
        playerOne.setTotalTime(10);
        playerOne.setUserProfile("strong");
        
        String player = playerOne.toString();
        System.out.println(player);
    }

}
