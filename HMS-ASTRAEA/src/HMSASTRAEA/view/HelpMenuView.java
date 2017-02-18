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
public class HelpMenuView 
{
    private String helpMenu;

    public void displayGameMenu() 
    {
        this.helpMenu = "\nHELP MENU"
                      + "\nG - GAME PLAY"
                      + "\nC - COMMAND KEYS"
                      + "\nP - PRODUCT INFORMATION & FAQ"
                      + "\nQ - QUIT";
        
        System.out.println(helpMenu);
        
        boolean check = false;
        do 
        {
            String userChoice = this.getUserChoice();
            if (userChoice.toUpperCase().equals("Q"))
            {
                return;
            }
            
            check = this.doChoice(userChoice);
        }
        while (!check);
    }

    private String getUserChoice() 
    {
        System.out.println("\nPlease enter your choice: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        userChoice = userChoice.trim();
        userChoice = userChoice.toUpperCase();
        return userChoice;
    }

    private boolean doChoice(String userChoice) 
    {
        switch (userChoice)
                {
                    case "G": this.displayGamePlay();
                        break;
                    case "C": this.displayCommandKeys();
                        break;
                    case "P": this.displayProduct_FAQ();
                        break;
                    default: 
                    {
                        System.out.println("Invalid selection. Please enter 'G', 'C', 'P', or 'Q'");
                        System.out.println(helpMenu);
                    }
                }
        return false;
    }

    private void displayGamePlay() 
    {
        System.out.println("\n*** displayGamePlay() called ***");
    }

    private void displayCommandKeys() 
    {
        System.out.println("\n*** displaycommandKeys() called ***");
    }

    private void displayProduct_FAQ() 
    {
        System.out.println("\n*** displayProduct_FAQ() called ***");
    }
}
