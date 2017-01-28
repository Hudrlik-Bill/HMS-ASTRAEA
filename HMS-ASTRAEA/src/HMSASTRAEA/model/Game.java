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
public class Game implements Serializable {
    private double totalTime;
    private String userProfile;
    
    public Game()
    {}

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.userProfile);
        return hash;
    }

     @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", userProfile=" + userProfile + '}';
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
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.userProfile, other.userProfile)) {
            return false;
        }
        return true;
    }

    
}
