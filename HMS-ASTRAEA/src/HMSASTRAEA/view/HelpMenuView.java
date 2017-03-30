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
                        ErrorView.display(this.getClass().getName(),
                                "Invalid selection. Please enter 'G', 'C', 'P', or 'Q'");
                    }
                }
        return false;
    }

    private void displayGamePlay() 
    {
        this.console.println("\n*** displayGamePlay() called ***");
            /* When we get to this point, we can put instructions similar to what I have below as game instructions.
            **Purpose of Play: The purpose of this game is to survive. You must determine what it takes to stay alive and then do it!
            **Storyline: The HMS ASTRAEA is a ship crossing the ocean into a new world that has recently been discovered. 
            **           En route, they encounter a storm which causes the ship to crash into unseen rocks or reef and sink. There are
            **           at least three survivors: a woman (the only onboard) and two men, who were passengers on board. Though 
            **           initially unknown to each other, they eventually must depend on one another to survive. 
            **How to Play: You must decide what to do. What character will you be? How will you survive? You must find food, water, and
            **              shelter; the very basics. Then you have to determine how to collect survival items; you need to search, 
            **              discover, collect, transport, and store what you need. Remember, you aren't the only one in the group! Use
            **              the skills, abilities, and health of other survivors to get things done.
            **How to Win: You have to stay alive and find a way off the island! But before you can escape, you must discover as much as
            **              you can!
            */
    }

    private void displayCommandKeys() 
    {
        this.console.println("\n*** displaycommandKeys() called ***");
    }
    /* This will just list the different menus with their associated option keys
    ** We could display every menu, or just choose particular menus to display. Perhaps just game action menus will be sufficient.
    */

    private void displayProduct_FAQ() 
    {
        this.console.println("\n*** displayProduct_FAQ() called ***");
    }
    /*
    ** H.E.R. Enterprises (Hudrlik, Enkey, Russell Enterprises) (c) All rights reserved
    ** We can also show version information, update information, et cetera.
    ** It would probably be good to display credits here |OR| at the end of the game.
    ** During testing, the main questions that come up can be addressed here and as automatic helps in the game.
    ** As the game matures, we can update the FAQ with customer FAQs.
    ** Let's also put our website down here. www.HMSASTRAEA.com |OR| www.here.com |OR| whichever.
    */
}
