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
                this.console.println(displayMenu);
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
        this.console.println("\nPlease enter your choice: ");
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
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number. "
                                    +"Try again or enter Q to quit.");
            }
            
        }
       
    }

    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            // While a valid name has not been retrieved
            while (!valid) {
                // get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim();
            
                if (selection.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid entry *** Try again");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return selection;
    }
}
