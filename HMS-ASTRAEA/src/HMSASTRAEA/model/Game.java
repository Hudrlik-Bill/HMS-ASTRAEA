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
    private Health health;
    private String optionSettings;
    private boolean started = false;
    private String saveName = "empty";
    
    private Map map;
    private Inventory inventory;
    private Player character;

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

    public static void setUserProfile(Profile userProfile) {
        Game.userProfile = userProfile;
    }

    public int getMilestone() {
        return milestone;
    }

    public void setMilestone(int milestone) {
        this.milestone = milestone;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public String getOptionSettings() {
        return optionSettings;
    }

    public void setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player getCharacter() {
        return character;
    }

    public void setCharacter(Player character) {
        this.character = character;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.totalTime;
        hash = 59 * hash + this.milestone;
        hash = 59 * hash + Objects.hashCode(this.health);
        hash = 59 * hash + Objects.hashCode(this.optionSettings);
        hash = 59 * hash + (this.started ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.saveName);
        hash = 59 * hash + Objects.hashCode(this.map);
        hash = 59 * hash + Objects.hashCode(this.inventory);
        hash = 59 * hash + Objects.hashCode(this.character);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", milestone=" + milestone + ", health=" + health + ", optionSettings=" + optionSettings + ", started=" + started + ", saveName=" + saveName + ", map=" + map + ", inventory=" + inventory + ", character=" + character + '}';
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
        if (this.started != other.started) {
            return false;
        }
        if (!Objects.equals(this.optionSettings, other.optionSettings)) {
            return false;
        }
        if (!Objects.equals(this.saveName, other.saveName)) {
            return false;
        }
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (this.character != other.character) {
            return false;
        }
        return true;
    }
    


}