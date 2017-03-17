/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

import HMSASTRAEA.control.GameControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

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
    private String containerDescription;
    private Inventory inventory;
    private ArrayList<Item> itemList = new ArrayList<>();
        
    public Container() 
    {
        
    }

    public Container(Container mapInventory) 
    {
        
        
    }

    public int getContainerType() {
        return containerType;
    }

    public void setContainerType(int containerType) {
        this.containerType = containerType;
    }

    public int getContainerQuantity() {
        return containerQuantity;
    }

    public void setContainerQuantity(int containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    public int getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight(int containerWeight) {
        this.containerWeight = containerWeight;
    }

    public int getContainerID() {
        return containerID;
    }

    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    public String getContainerDescription() {
        return containerDescription;
    }

    public void setContainerDescription(String containerDescription) {
        this.containerDescription = containerDescription;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.containerType;
        hash = 59 * hash + this.containerQuantity;
        hash = 59 * hash + this.containerWeight;
        hash = 59 * hash + this.containerID;
        hash = 59 * hash + Objects.hashCode(this.containerDescription);
        hash = 59 * hash + Objects.hashCode(this.inventory);
        hash = 59 * hash + Objects.hashCode(this.itemList);
        return hash;
    }

    @Override
    public String toString() {
        return "Container{" + "containerType=" + containerType + ", containerQuantity=" + containerQuantity + ", containerWeight=" + containerWeight + ", containerID=" + containerID + ", containerDescription=" + containerDescription + ", inventory=" + inventory + ", itemList=" + itemList + '}';
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
        if (!Objects.equals(this.containerDescription, other.containerDescription)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.itemList, other.itemList)) {
            return false;
        }
        return true;
    }

  
}
