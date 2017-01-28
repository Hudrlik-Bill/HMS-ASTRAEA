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
public class Backpack implements Serializable {
    private String itemType;
    private int itemNumber;
    private int maxWeight;
    private int itemWeight;
    private int loadedWeight;
    
    public Backpack() {
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(int loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.itemType);
        hash = 97 * hash + this.itemNumber;
        hash = 97 * hash + this.maxWeight;
        hash = 97 * hash + this.itemWeight;
        hash = 97 * hash + this.loadedWeight;
        return hash;
    }

    @Override
    public String toString() {
        return "Backpack{" + "itemType=" + itemType + ", itemNumber=" + itemNumber + ", maxWeight=" + maxWeight + ", itemWeight=" + itemWeight + ", loadedWeight=" + loadedWeight + '}';
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
        final Backpack other = (Backpack) obj;
        if (this.itemNumber != other.itemNumber) {
            return false;
        }
        if (this.maxWeight != other.maxWeight) {
            return false;
        }
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (this.loadedWeight != other.loadedWeight) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    
    
}
