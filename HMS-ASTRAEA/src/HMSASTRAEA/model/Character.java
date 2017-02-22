/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Teancum
 */
public class Character implements Serializable
{
    private String name;
    private String coordinates;
    private String description;

    public Character() 
    {
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCoordinates() 
    {
        return coordinates;
    }

    public void setCoordinates(String coordinates) 
    {
        this.coordinates = coordinates;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.coordinates);
        hash = 79 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() 
    {
        return "Character{" + "name=" + name + ", coordinates=" + coordinates + ", description=" + description + '}';
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) 
        {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) 
        {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) 
        {
            return false;
        }
        return true;
    }
    
    
}
