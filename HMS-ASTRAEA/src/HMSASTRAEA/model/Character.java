/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Teancum
 */
public enum Character implements Serializable
{
    Gidgidoni("Is a middle-aged /(40s or 50s/) gentleman with very good carpenter skills."),
    Teancum("Is in his 30s and worked as a blacksmith."),
    Esther("Is in her 20s or 30s and was a teacher and nurse.");
    private final Point coordinates;
    private final String description;
    
    private Game game;
    private Health health;
    private Location location;

    Character(String description) 
    {
         this.description = description;
         coordinates = new Point(1, 1);
    }

    public Point getCoordinates() 
    {
        return coordinates;
    }

    public String getDescription() 
    {
        return description;
    }
    
    public Game getGame()
    {
        return game;
    }
    
    public Health getHealth() 
    {
        return health;
    }
    
    public Location getLocation()
    {
        return location;
    }
    
    @Override
    public String toString() 
    {
        return "Character{," + "coordinates=" + coordinates + ", description=" + description + '}';
    }
    
}
