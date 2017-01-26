/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.astraea;

import HMSASTRAEA.model.InventoryClass;

/**
 *
 * @author Teancum
 */
public class HMSASTRAEA 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        InventoryClass wood = new InventoryClass();
        
        wood.setItemType("ship plank");
        wood.setItemNumber(1);
        wood.setRequiredAmount(1);
        
        String itemDescription = wood.toString();
        System.out.println(wood);
    }
    
}
