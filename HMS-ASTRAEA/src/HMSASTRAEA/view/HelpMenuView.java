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
public class HelpMenuView extends View
{
    public HelpMenuView()
    {
        super   (       "\nHELP MENU"
                      + "\nG - GAME PLAY"
                      + "\nC - COMMAND KEYS"
                      + "\nP - PRODUCT INFORMATION & FAQ"
                      + "\nQ - QUIT");
    }

    @Override
    public boolean doChoice(String userChoice) 
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
