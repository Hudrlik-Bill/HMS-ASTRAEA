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
public class GameMenuView extends View
{        
    public GameMenuView()
    {
                super(  "\nGAME MENU"
                      + "\nA - Action"
                      + "\nI - View Inventory"
                      + "\nH - View Health"
                      + "\nM - View Map"
                      + "\nQ - QUIT");
    }
    @Override
    public boolean doChoice(String userChoice) {
        switch (userChoice)
                {
                    case "A": this.actionMenu();
                        break;
                    case "I": this.displayIventory();
                        break;
                    case "H": this.displayHealth();
                        break;
                    case "M": this.displayMap();
                        break;    
                    default: 
                    {
                        System.out.println("Invalid selection. Please enter 'A', 'I', 'H', 'M', or 'Q'");
                    }
                }
        return false;
    }

    private void actionMenu() {
        System.out.println("\n*** actionMenu() called ***");
        ActionView actionMenu = new ActionView(); 
        actionMenu.displayMenu();
    }

    private void displayIventory() {
        System.out.println("\n*** displayInventory() called ***");
    }

    private void displayHealth() {
        System.out.println("\n*** displayHealth() called ***");
    }

    private void displayMap() {
        System.out.println("\n*** displayMap() called ***");
    }
}
