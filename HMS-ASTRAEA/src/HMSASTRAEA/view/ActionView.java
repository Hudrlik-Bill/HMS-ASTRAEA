/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.MapControl;
import HMSASTRAEA.model.Player;
import HMSASTREA.exceptions.MapControlException;
import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author famil
 */
public class ActionView extends View
{
  public ActionView()
  {
    super ( "\nACTION MENU"
           + "\nS - Search"
           + "\nB - Build/manufacture Item"
           + "\nM - Move/Travel"
           + "\nC - Collect Object"
           + "\nZ - Sleep"
           + "\nE - Eat" 
           + "\nD - Drink"
           + "\nH - Hunt" 
           + "\nF - Fish" 
           + "\nQ - QUIT");
  }
  
  @Override
  public boolean doChoice(String userChoice)
  {
        switch (userChoice)
                {
                    case "S": this.search();
                        break;
                    case "B": this.buildItem();
                        break;
                    case "M": this.moveTravel();
                        break;
                    case "C": this.collectObject();
                        break;
                    case "Z": this.sleep();
                        break;
                    case "E": this.eat();
                        break;
                    case "D": this.drink();
                        break;
                    case "H": this.hunt();
                        break;
                    case "F": this.fish();
                        break;
                    default: 
                        {   
                            ErrorView.display(this.getClass().getName(),
                                    "Invalid selection. Please enter 'S', 'B', 'M', 'C', 'Z', 'D', 'H', 'F' or 'Q'");
                        }
                }
        return false; 
  }

    private void search() {
        this.console.println("*** search() called ***");
    }

    private void buildItem() 
    {        
        this.console.println("\nWhich item would you like to build?"
                         + "\nT - Tool"
                         + "\nC - Container"
                         + "\nD - Device"
                         + "\nW - Weapon"
                         + "\nG - Garment (clothes)"
                         + "\nQ - Quit this menu");
        
        String userBuildChoice = null;
      try {
          userBuildChoice = this.keyboard.readLine();
          userBuildChoice = userBuildChoice.trim();
          userBuildChoice = userBuildChoice.toUpperCase();
      } catch (IOException ex) {
          Logger.getLogger(ActionView.class.getName()).log(Level.SEVERE, null, ex);
      }
        

        switch (userBuildChoice)
      { 
            case "T": this.makeTool();
            break;
            case "C": this.makeContainer();
            break;
            case "D": this.makeDevice();
            break;
            case "W": this.makeWeapon();
            break;
            case "G": this.makeGarment();
            break;
            case "Q": return;
            default:
            {
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection. Please enter 'T', 'C', 'D', 'W', 'G' or 'Q'.");
            }
      }
    }

    private void moveTravel(Point coordinates) {
       Player player = null;
        //move actor to specified location
        try{
            MapControl.movePlayerToLocation(player, coordinates);
        }catch (MapControlException me){
            ErrorView.display(this.getClass().getName(),
                    me.getMessage());
        }
    }

    private void collectObject() {
        this.console.println("*** collectObject() called ***");
    }

    private void sleep() {
        this.console.println("*** sleep() called ***");
    }

    private void eat() {
        this.console.println("*** eat() called ***");
    }

    private void drink() {
        this.console.println("*** drink() called ***");
    }

    private void hunt() {
        this.console.println("*** hunt() called ***");
    }

    private void fish() {
        this.console.println("*** fish() called ***");
    }

    private void moveTravel() {
        this.console.println("******");
    }

    private void makeTool() {
        this.console.println("***makeTool() called***");
    }

    private void makeContainer() {
        this.console.println("***makeContainer() called***");
    }

    private void makeDevice() {
        this.console.println("***makeDevice() called***");
    }

    private void makeWeapon() {
        this.console.println("***makeWeapon() called***");
    }

    private void makeGarment() {
        this.console.println("***makeGarment() called***");
    }
}
