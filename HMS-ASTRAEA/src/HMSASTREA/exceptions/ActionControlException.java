/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTREA.exceptions;

/**
 *
 * @author Marina
 */
public class ActionControlException extends Exception
{

    public ActionControlException() 
    {
        
    }

    public ActionControlException(String string) 
    {
        super(string);
    }

    public ActionControlException(String string, Throwable thrwbl) 
    {
        super(string, thrwbl);
    }

    public ActionControlException(Throwable thrwbl) 
    {
        super(thrwbl);
    }

    public ActionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) 
    {
        super(string, thrwbl, bln, bln1);
    }
    
}
