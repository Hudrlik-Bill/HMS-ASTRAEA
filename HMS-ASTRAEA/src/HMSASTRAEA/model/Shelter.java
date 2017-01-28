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
public class Shelter implements Serializable {
    private String shelterInventory;

    public String getShelterInventory() {
        return shelterInventory;
    }

    public void setShelterInventory(String shelterInventory) {
        this.shelterInventory = shelterInventory;
    }

    public Shelter() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.shelterInventory);
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
        final Shelter other = (Shelter) obj;
        if (!Objects.equals(this.shelterInventory, other.shelterInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shelter{" + "shelterInventory=" + shelterInventory + '}';
    }
    
}
