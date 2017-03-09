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
public class Location implements Serializable {
    private boolean visited;
    private Inventory resource;
    private Map map;
    private Scene[] scene;
    
    public Location() 
    {
        
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Inventory getResource() {
        return resource;
    }

    public void setResource(Inventory resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.visited ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.resource);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", resource=" + resource + '}';
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
        final Location other = (Location) obj;
        
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.resource, other.resource)) {
            return false;
        }
        return true;
    }


}
