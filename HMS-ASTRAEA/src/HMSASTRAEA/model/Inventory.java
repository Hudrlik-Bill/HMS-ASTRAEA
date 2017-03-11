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

import HMSASTRAEA.control.GameControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Inventory implements Serializable
{
    private ArrayList<Container>containerList;
    private ArrayList<Container>defaultList;


    public Inventory() 
    {
        
    }

    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }

    public ArrayList<Container> getDefaultList() {
        return defaultList;
    }

    public void setDefaultList(ArrayList<Container> defaultList) {
        this.defaultList = defaultList;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.containerList);
        hash = 53 * hash + Objects.hashCode(this.defaultList);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "containerList=" + containerList + ", defaultList=" + defaultList + '}';
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.containerList, other.containerList)) {
            return false;
        }
        if (!Objects.equals(this.defaultList, other.defaultList)) {
            return false;
        }
        return true;
    }

    public void add(Container mapInventory) 
    {
        GameControl.createInventoryList();
    }
}
