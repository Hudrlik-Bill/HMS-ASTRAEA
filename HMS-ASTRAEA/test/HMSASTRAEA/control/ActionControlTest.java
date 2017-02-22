/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;



/**
 *
 * @author Teancum
 */
public class ActionControlTest {
    
    public ActionControlTest() {
    }
    


    /**
     * Test of buildContainer method, of class ActionControl.
     */
   
    public void testBuildContainer() 
    {
        System.out.println("Build container 01");
        int container = 2;
        double width = 6.0;
        double length = 8.0;
        double height = 7.0;
        ActionControl instance = new ActionControl();
        double expResult = 336.0;
        double result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Object built");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Build container 02");
        container = 4;
        width = 1.0;
        length = 5.0;
        height = 5.0;
        expResult = 0.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Invalid container");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Build container 03");
        container = 1;
        width = 0.0;
        length = 3.0;
        height = 2.0;
        expResult = -1.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Invalid width");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Build container 04");
        container = 3;
        width = 4.0;
        length = 0.0;
        height = 6.0;
        expResult = -2.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Invalid length");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Build container 05");
        container = 2;
        width = 2.0;
        length = 1.0;
        height = 0.0;
        expResult = -3.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Invalid height");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Bound container 01");
        container = 1;
        width = 2.0;
        length = 2.0;
        height = 2.0;
        expResult = 8.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Crate bound");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Bound container 02");
        container = 2;
        width = 12.0;
        length = 12.0;
        height = 8.0;
        expResult = 1152.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Shelter bound");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Bound container 03");
        container = 3;
        width = 4.0;
        length = 6.0;
        height = 2.0;
        expResult = 48.0;
        result = instance.buildContainer(container, width, length, height);
        System.out.println("Expected Result " + expResult + " Cart bound");
        System.out.println("Actual Result " + result + "\n");
        assertEquals(expResult, result, 0.0);
    }

    private void assertEquals(double expResult, double result, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
