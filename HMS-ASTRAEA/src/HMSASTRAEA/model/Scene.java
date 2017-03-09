/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import java.util.Arrays;

/**
 *
 * @author Teancum
 */
public class Scene 
{
    private Location[] location;

    public Scene() 
    {
        
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "location=" + location + '}';
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
        final Scene other = (Scene) obj;
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
}
