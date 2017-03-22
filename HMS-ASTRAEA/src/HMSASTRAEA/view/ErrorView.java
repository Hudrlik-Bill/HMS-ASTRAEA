/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA_MAIN.HMS_ASTRAEA_MAIN;
import java.io.PrintWriter;

/**
 *
 * @author famil
 */
public class ErrorView {
   
    private static final PrintWriter errorFile = HMS_ASTRAEA_MAIN.getOutFile();
    private static final PrintWriter logFile = HMS_ASTRAEA_MAIN.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                +   "\n- ERROR - " + errorMessage
                +   "\n--------------------------------------------------");          
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
