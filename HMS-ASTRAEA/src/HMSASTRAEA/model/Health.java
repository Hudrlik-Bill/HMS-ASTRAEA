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
public class Health implements Serializable
{
    private int[] overallHealth = new int[4];
    /* overallHealth[0] : injury
       overallHealth[1] : hunger
       overallHealth[2] : thirst
       overallHealth[3] : fatigue
    if any type of health reaches 0, the character dies
    Full health for all types is 100.
    
    */
    
    private Game game;

    public Health() 
    {
    }

    public void eat(int amount){//eating reduces hunger
        overallHealth[1]+=amount;
        if(overallHealth[1]>100) overallHealth[1]=100;
    }
    public void drink(int amount){//drinking reduces thirst
        overallHealth[2]+=amount;
        if(overallHealth[2]>100) overallHealth[2]=100;
    }
    public void passTime(){//when time passes, the character becomes more hungry and thirsty
        overallHealth[1]-=5;
        overallHealth[2]-=5;  
    }
    public void rest(){//resting reduces fatigue, but slightly increases hunger and thirst
        overallHealth[1]-=5;
        overallHealth[2]-=5;
        overallHealth[3]+=20;
        if(overallHealth[3]>100) overallHealth[3]=100;
    }
    public void injure(int amount){//injures a character
        overallHealth[0]-=amount;
    }
    /*Strength represents the general ability of a character to do actions based on health
    It is the average of the different types of health, but cannot exceed the lowest health
    type by more than 20.  This represents that all types of health are important, but 
    often the performance of a character is simply limited by whatever the weakest point is.
    */
    public int getStrength(){
        int strength = 0;
        int minimum = 100;
        for(int health : overallHealth){
            strength+=health;
            if(minimum>health) minimum=health;
        }
        strength = strength/4;
        minimum+=20;
        if(minimum<strength) strength = minimum;
        return strength;
    }
    
    public boolean isAlive(){
        for(int health : overallHealth){
            if(health<1){
                return false;
            }
        }
        return true;
    }
    
    public int[] getOverallHealth() {
        return overallHealth;
    }

    /**
     *
     * @param overallhealth
     * @return 
     */
    public static int[] setOverallHealth(int overallhealth)
    {
        
        return null;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = (int) (53 * hash + this.overallHealth[0]);
        hash = 53 * hash + this.overallHealth[1];
        hash = 53 * hash + this.overallHealth[2];
        hash = 53 * hash + this.overallHealth[3];
        hash = 53 * hash + Objects.hashCode(this.game);
        return hash;
    }

    @Override
    public String toString() {
        return "Health{" + "Injury=" + overallHealth[0] + ", hunger=" + overallHealth[1] + ", thirst=" + overallHealth[2] + ", fatigue=" + overallHealth[3] + ", game=" + game + '}';
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
        final Health other = (Health) obj;
        if (this.overallHealth != other.overallHealth) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }
}
