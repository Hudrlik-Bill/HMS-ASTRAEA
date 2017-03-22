/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA_MAIN;

import HMSASTRAEA.view.StartProgramView;
import HMSASTRAEA.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Teancum
 */
public class HMS_ASTRAEA_MAIN 
{
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HMS_ASTRAEA_MAIN.logFile = logFile;
    }
    
        public static void main (String[] args)
    {
        try{
            // open charcter stream files for end user input and output
            HMS_ASTRAEA_MAIN.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            HMS_ASTRAEA_MAIN.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            HMS_ASTRAEA_MAIN.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
        }catch (Throwable te){
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
            te.printStackTrace();;
    }
    
        finally {
            try {
                if (HMS_ASTRAEA_MAIN.inFile != null)
                    HMS_ASTRAEA_MAIN.inFile.close();
            
                if (HMS_ASTRAEA_MAIN.outFile != null)
                    HMS_ASTRAEA_MAIN.outFile.close();  
                
                if (HMS_ASTRAEA_MAIN.logFile != null)
                    HMS_ASTRAEA_MAIN.logFile.close(); 
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
}
        public static PrintWriter getOutFile() {
        return outFile;
    }
    
        public static void setOutFile(PrintWriter outFile) {
        HMS_ASTRAEA_MAIN.outFile = outFile;
    }
    
        public static BufferedReader getInFile() {
        return inFile;
    }
    
        public static void setInFile(BufferedReader InFile) {
        HMS_ASTRAEA_MAIN.inFile = inFile;
    }
}