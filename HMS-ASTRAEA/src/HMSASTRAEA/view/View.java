/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import java.util.Scanner;

/**
 *
 * @author Teancum
 */
public abstract class View implements ViewInterface
{
    protected String displayMenu;
    
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
            Scanner userInput = new Scanner(System.in);
            String userChoice = userInput.nextLine();
            userChoice = userChoice.trim();
            userChoice = userChoice.toUpperCase();
            return userChoice;
    }
}
