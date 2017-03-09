/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Teancum
 */
public class Container implements Serializable
{
    private int containerType;
    private int containerQuantity;
    private int containerWeight;
    private int containerID;
    
    private Inventory inventory;
    
    private ArrayList<ArrayList<String>> itemList = new ArrayList<>();
    
    public Container() {
    }

    public int getItemType() {
        return containerType;
    }

    public void setItemType(int containerType) {
        this.containerType = containerType;
    }

    public int getItemQuantity() {
        return containerQuantity;
    }

    public void setItemQuantity(int containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    public int getItemWeight() {
        return containerWeight;
    }

    public void setItemWeight(int containerWeight) {
        this.containerWeight = containerWeight;
    }
    
    public int getContainerID() {
        return containerID;
    }

    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ArrayList<ArrayList<String>> getItemList() 
    {
        return itemList;
    }

    public void setItemList(ArrayList<ArrayList<String>> itemList) 
    {
        this.itemList = itemList;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.containerType;
        hash = 53 * hash + this.containerQuantity;
        hash = 53 * hash + this.containerWeight;
        hash = 53 * hash + this.containerID;
        return hash;
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
        final Container other = (Container) obj;
        if (this.containerType != other.containerType) {
            return false;
        }
        if (this.containerQuantity != other.containerQuantity) {
            return false;
        }
        if (this.containerWeight != other.containerWeight) {
            return false;
        }
        if (this.containerID != other.containerID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "containerType=" + containerType + ", containerQuantity=" + containerQuantity + ", containerWeight=" + containerWeight + ", containerID=" + containerID + '}';
    }

}
