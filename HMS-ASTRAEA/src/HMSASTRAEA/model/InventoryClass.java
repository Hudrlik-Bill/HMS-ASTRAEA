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
 * @author Teancum
 */
public class InventoryClass implements Serializable
    {
        private String itemType;
        private Integer itemNumber;
        private Integer requiredAmount;

        public InventoryClass() 
        {
            
        }
        
        public String getItemType() 
        {
            return itemType;
        }

        public void setItemType(String itemType) 
        {
            this.itemType = itemType;
        }

        public Integer getItemNumber() 
        {
            return itemNumber;
        }

        public void setItemNumber(Integer itemNumber) 
        {
            this.itemNumber = itemNumber;
        }

        public Integer getRequiredAmount() 
        {
            return requiredAmount;
        }

        public void setRequiredAmount(Integer requiredAmount) 
        {
            this.requiredAmount = requiredAmount;
        }

        @Override
            public int hashCode() 
            {
                int hash = 5;
                hash = 23 * hash + Objects.hashCode(this.itemType);
                hash = 23 * hash + Objects.hashCode(this.itemNumber);
                hash = 23 * hash + Objects.hashCode(this.requiredAmount);
                return hash;
            }

    @Override
        public String toString() 
        {
            return "InventoryClass{" + "itemType=" + itemType + ", itemNumber=" + itemNumber + ", requiredAmount=" + requiredAmount + '}';
        }
        
            

        @Override
            public boolean equals(Object obj) 
            {
                if (this == obj) 
                {
                    return true;
                }
                if (obj == null) 
                {
                    return false;
                }
                if (getClass() != obj.getClass()) 
                {
                    return false;
                }
                final InventoryClass other = (InventoryClass) obj;
                
                if (!Objects.equals(this.itemType, other.itemType)) 
                {
                    return false;
                }
                if (!Objects.equals(this.itemNumber, other.itemNumber)) 
                {
                    return false;
                }
                if (!Objects.equals(this.requiredAmount, other.requiredAmount)) 
                {
                    return false;
                }
                return true;
            }
        
        
    }
