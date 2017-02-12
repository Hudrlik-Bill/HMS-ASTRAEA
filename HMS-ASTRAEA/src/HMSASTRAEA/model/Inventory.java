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
import java.util.Objects;

public class Inventory implements Serializable
{
    
    private int itemType;
    private int itemQuantity;
    private int itemWeight;
    private int requiredQuantity;
    
    public Inventory() {
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.itemType;
        hash = 53 * hash + this.itemQuantity;
        hash = 53 * hash + this.itemWeight;
        hash = 53 * hash + this.requiredQuantity;
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
        final Inventory other = (Inventory) obj;
        if (this.itemType != other.itemType) {
            return false;
        }
        if (this.itemQuantity != other.itemQuantity) {
            return false;
        }
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (this.requiredQuantity != other.requiredQuantity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemType=" + itemType + ", itemQuantity=" + itemQuantity + ", itemWeight=" + itemWeight + ", requiredQuantity=" + requiredQuantity + '}';
    }

    
}
