/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import HMSASTRAEA.model.Player;
import HMSASTREA.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author Teancum
 */
public class ActionControl
{
    
    public double buildContainer(int container, double width, double length, double height)
    {
        if (1 > container || container > 3)
            {return 0;}
        
        if (container == 1)
            {
                if (width < 1 || width > 2)
                {return -1;}
                
                if (length < 1 || length > 2)
                {return -2;}
                
                if (height < 1 || height > 2)
                {return -3;}
            }
        
        if (container == 2)
            {
                if (width < 1 || width > 12)
                {return -1;}
                
                if (length < 1 || length > 12)
                {return -2;}
                
                if (height < 1 || height > 8)
                {return -3;}
            }
        
        if (container == 3)
            {
                if (width < 1 || width > 4)
                {return -1;}
                
                if (length < 1 || length > 6)
                {return -2;}
                
                if (height < 1 || height > 2)
                {return -3;}
            }
        
        double volume = width * length * height;
        
            System.out.println("Volume: " + volume);
            
        return volume;
    }
}
