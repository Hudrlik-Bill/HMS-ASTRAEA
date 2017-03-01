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
class GameMenuView 
{        
    private String gameMenu;

    public void displayMenu() 
    {
<<<<<<< HEAD
        System.out.println("\n*** displayMenu() called ***");
=======
        this.gameMenu = "\nGAME MENU"
                      + "\nA - Action"
                      + "\nI - View Inventory"
                      + "\nH - View Health"
                      + "\nM - View Map"
                      + "\nQ - QUIT";
        
        boolean check = false;
        do 
        {
            System.out.println(gameMenu);
            String userChoice = this.getUserChoice();
            if (userChoice.toUpperCase().equals("Q"))
            {
                return;
            }
            
            check = this.doChoice(userChoice);
        }
        while (!check);
    }

    private String getUserChoice() {
        System.out.println("\nPlease enter your choice: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        userChoice = userChoice.trim();
        userChoice = userChoice.toUpperCase();
        return userChoice;
    }

    private boolean doChoice(String userChoice) {
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
    }

    private void displayIventory() {
        System.out.println("\n*** displayInventory() called ***");
    }

    private void displayHealth() {
        System.out.println("\n*** displayHealth() called ***");
    }

    private void displayMap() {
        System.out.println("\n*** displayMap() called ***");
>>>>>>> origin/master
    }
}
