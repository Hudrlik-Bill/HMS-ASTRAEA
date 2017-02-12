/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teancum
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calculateItemWeight method, of class InventoryControl.
     */
    @Test
    public void testCalculateItemWeight() {
        System.out.println("calculateItemWeight");
        int itemID = 0;
        int itemQuantity = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 10.0;
        double result = instance.calculateItemWeight(itemID, itemQuantity);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateLoadedContainerWeight method, of class InventoryControl.
     */
    @Test
    public void testCalculateLoadedContainerWeight() {
        System.out.println("calculateLoadedContainerWeight");
        int containerID = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 140.0;
        double result = instance.calculateLoadedContainerWeight(containerID);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareWeight method, of class InventoryControl.
     */
    @Test
    public void testCompareWeight() {
        System.out.println("compareWeight");
        int itemID = 0;
        int itemQuantity = 0;
        int containerID = 0;
        InventoryControl instance = new InventoryControl();
        boolean expResult = false;
        boolean result = instance.compareWeight(itemID, itemQuantity, containerID);
        assertEquals(expResult, result);
    }
    
}
