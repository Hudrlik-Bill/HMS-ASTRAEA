/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import HMSASTRAEA.model.Map;
import HMSASTRAEA.model.Player;
import HMSASTREA.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author Teancum
 */
public class MapControl {
    
    public static void movePlayerToLocation(Player player, Point coordinates)
    throws MapControlException{
        
        Map map = GameControl.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >=map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException ("Can not move player to location "
                                           + coordinates.x +"," + coordinates.y
                                           + " because that location is outside "
                                           + "the bounds of the map.");
        }
   
    }
    
    public static void movePlayerToStringLocation(Map map)
                      throws MapControlException{
        // for every character
        Player[] players = Player.values();
               
        for (Player player : players){
            Point coordinates = player.getCoordinates();
            MapControl.movePlayerToLocation(player, coordinates);
            
        }
   
    }
    
}
