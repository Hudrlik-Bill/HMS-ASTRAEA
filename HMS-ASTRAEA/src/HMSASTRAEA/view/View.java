/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA_MAIN.HMS_ASTRAEA_MAIN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teancum
 */
public abstract class View implements ViewInterface
{
    protected String displayMenu;
    
    protected final BufferedReader keyboard = HMS_ASTRAEA_MAIN.getInFile();
    protected final PrintWriter console = HMS_ASTRAEA_MAIN.getOutFile();
    
    public View(String message)
    {
        this.displayMenu = message;
    }
    
    @Override
    public void displayMenu()
    {
        boolean check = false;
            do 
            {
                System.out.println(displayMenu);
                String userChoice = this.getUserChoice();
                if (userChoice.toUpperCase().equals("Q"))
                {
                    return;
                }
                check = this.doChoice(userChoice);
            }
            while (!check);
    }
    
    @Override
    public String getUserChoice()
    {
        System.out.println("\nPlease enter your choice: ");
            String userChoice = null;
        try {
            userChoice = this.keyboard.readLine();
            userChoice = userChoice.trim();
            userChoice = userChoice.toUpperCase();
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return userChoice;
    }
    public void getDoubleNumber(){
        Double number = null;
        
        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
            //parse and convert number from text to a double
            try {
                number = Double.parseDouble(value);
                
            }catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number. "
                                    +"Try again or enter Q to quit.");
            }
            
        }
       
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
