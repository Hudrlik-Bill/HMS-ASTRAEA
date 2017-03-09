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
    private double overallHealth;
    private int hunger;
    private int thirst;
    private int fatigue;
    private Game game;

    public Health() 
    {
    }

    public double getOverallHealth() {
        return overallHealth;
    }

    public void setOverallHealth(double overallHealth) {
        this.overallHealth = overallHealth;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
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
        hash = (int) (53 * hash + this.overallHealth);
        hash = 53 * hash + this.hunger;
        hash = 53 * hash + this.thirst;
        hash = 53 * hash + this.fatigue;
        hash = 53 * hash + Objects.hashCode(this.game);
        return hash;
    }

    @Override
    public String toString() {
        return "Health{" + "overallHealth=" + overallHealth + ", hunger=" + hunger + ", thirst=" + thirst + ", fatigue=" + fatigue + ", game=" + game + '}';
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
        if (this.hunger != other.hunger) {
            return false;
        }
        if (this.thirst != other.thirst) {
            return false;
        }
        if (this.fatigue != other.fatigue) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }
}
