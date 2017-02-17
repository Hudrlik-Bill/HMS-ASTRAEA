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
public class Profile implements Serializable
    {
        private String totalTime;
        private Integer milestone;
        private String name;
        private double health;
        private String inventory;
        private String optionSettings;



    public Profile() 
    {    }

    public String getTotalTime() 
    {
        return totalTime;
    }

    public void setTotalTime(String totalTime) 
    {
        this.totalTime = totalTime;
    }

    public Integer getMilestone() 
    {
        return milestone;
    }

    public void setMilestone(Integer milestone) 
    {
        this.milestone = milestone;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getHealth() 
    {
        return health;
    }

    public void setHealth(double health) 
    {
        this.health = health;
    }

    public String getInventory() 
    {
        return inventory;
    }

    public void setInventory(String inventory) 
    {
        this.inventory = inventory;
    }

    public String getOptionSettings() 
    {
        return optionSettings;
    }

    public void setOptionSettings(String optionSettings) 
    {
        this.optionSettings = optionSettings;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.totalTime);
        hash = 17 * hash + Objects.hashCode(this.milestone);
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.inventory);
        hash = 17 * hash + Objects.hashCode(this.optionSettings);
        return hash;
    }

    @Override
    public String toString() 
    {
        return "Profile{" + "totalTime=" + totalTime + ", milestone=" + milestone + ", name=" + name + ", health=" + health + ", inventory=" + inventory + ", optionSettings=" + optionSettings + '}';
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
        final Profile other = (Profile) obj;
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) 
        {
            return false;
        }
        if (!Objects.equals(this.totalTime, other.totalTime)) 
        {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) 
        {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) 
        {
            return false;
        }
        if (!Objects.equals(this.optionSettings, other.optionSettings)) 
        {
            return false;
        }
        if (!Objects.equals(this.milestone, other.milestone)) 
        {
            return false;
        }
        
        return true;
    }
        
    
    }
