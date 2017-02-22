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
public class WaterCraft implements Serializable {
    private int craftLength;
    private String craftType;
    private int maxWeight;
    private int craftWidth;
    private int itemNumber;
    private String itemType;
    private int itemWeight;
    private int loadedWeight;
    
     public WaterCraft() {
    }

    public int getCraftLength() {
        return craftLength;
    }

    public void setCraftLength(int craftLength) {
        this.craftLength = craftLength;
    }

    public String getCraftType() {
        return craftType;
    }

    public void setCraftType(String craftType) {
        this.craftType = craftType;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCraftWidth() {
        return craftWidth;
    }

    public void setCraftWidth(int craftWidth) {
        this.craftWidth = craftWidth;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
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
        int hash = 3;
        hash = 83 * hash + this.craftLength;
        hash = 83 * hash + Objects.hashCode(this.craftType);
        hash = 83 * hash + this.maxWeight;
        hash = 83 * hash + this.craftWidth;
        hash = 83 * hash + this.itemNumber;
        hash = 83 * hash + Objects.hashCode(this.itemType);
        hash = 83 * hash + this.itemWeight;
        hash = 83 * hash + this.loadedWeight;
        return hash;
    }
    
    @Override
    public String toString() {
        return "WaterCraft{" + "craftLength=" + craftLength + ", craftType=" + craftType + ", maxWeight=" + maxWeight + ", craftWidth=" + craftWidth + ", itemNumber=" + itemNumber + ", itemType=" + itemType + ", itemWeight=" + itemWeight + ", loadedWeight=" + loadedWeight + '}';
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
        final WaterCraft other = (WaterCraft) obj;
        if (this.craftLength != other.craftLength) {
            return false;
        }
        if (this.maxWeight != other.maxWeight) {
            return false;
        }
        if (this.craftWidth != other.craftWidth) {
            return false;
        }
        if (this.itemNumber != other.itemNumber) {
            return false;
        }
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (this.loadedWeight != other.loadedWeight) {
            return false;
        }
        if (!Objects.equals(this.craftType, other.craftType)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
}
