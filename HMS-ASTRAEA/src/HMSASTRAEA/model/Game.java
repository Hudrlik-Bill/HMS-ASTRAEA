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
 * @author famil
 */
public class Game implements Serializable 
{
    private int totalTime;
    private static Profile userProfile;
    private int milestone;
    private int health;
    private int inventory;
    private String optionSettings;

    public Game() {
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public static Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(Profile userProfile) {
        this.userProfile = userProfile;
    }

    public int getMilestone() {
        return milestone;
    }

    public void setMilestone(int milestone) {
        this.milestone = milestone;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getOptionSettings() {
        return optionSettings;
    }

    public void setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.totalTime;
        hash = 79 * hash + Objects.hashCode(this.userProfile);
        hash = 79 * hash + this.milestone;
        hash = 79 * hash + this.health;
        hash = 79 * hash + this.inventory;
        hash = 79 * hash + Objects.hashCode(this.optionSettings);
        return hash;
    }
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", userProfile=" + userProfile + ", milestone=" + milestone + ", health=" + health + ", inventory=" + inventory + ", optionSettings=" + optionSettings + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.milestone != other.milestone) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.inventory != other.inventory) {
            return false;
        }
        if (!Objects.equals(this.optionSettings, other.optionSettings)) {
            return false;
        }
        if (!Objects.equals(this.userProfile, other.userProfile)) {
            return false;
        }
        return true;
    }
 

}