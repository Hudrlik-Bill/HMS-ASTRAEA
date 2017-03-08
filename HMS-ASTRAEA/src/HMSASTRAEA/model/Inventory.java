/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

/**
 *
 * @author Teancum
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Inventory implements Serializable
{
    private ArrayList<Container>containerList;

    public Inventory() 
    {
        
    }
    
    public ArrayList getContainerList() 
    {
        return containerList;
    }
    
    public void setContainerList(ArrayList containerList)
    {
        this.containerList = containerList;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.containerList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.containerList, other.containerList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Inventory{" + "containerList=" + containerList + '}';
    }
    
    
}
