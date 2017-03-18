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
import java.util.Scanner;

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
                            System.out.println("Invalid selection. Please enter 'S', 'B', 'M', 'C', 'Z', 'D', 'H', 'F' or 'Q'");
                        }
                }
        return false; 
  }

    private void search() {
        System.out.println("*** search() called ***");
    }

    private void buildItem() 
    {        
        System.out.println("\nWhich item would you like to build?"
                         + "\nT - Tool"
                         + "\nC - Container"
                         + "\nD - Device"
                         + "\nW - Weapon"
                         + "\nG - Garment (clothes)"
                         + "\nQ - Quit this menu");
        
        Scanner userInput = new Scanner(System.in);
        String userBuildChoice = userInput.nextLine();
        userBuildChoice = userBuildChoice.trim();
        userBuildChoice = userBuildChoice.toUpperCase();

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
                System.out.println("Invalid selection. Please enter 'T', 'C', 'D', 'W', 'G' or 'Q'.");
            }
      }
    }

    private void moveTravel(Point coordinates) {
       Player player = null;
        //move actor to specified location
        try{
            MapControl.movePlayerToLocation(player, coordinates);
        }catch (MapControlException me){
            System.out.println(me.getMessage());
        }
    }

    private void collectObject() {
        System.out.println("*** collectObject() called ***");
    }

    private void sleep() {
        System.out.println("*** sleep() called ***");
    }

    private void eat() {
        System.out.println("*** eat() called ***");
    }

    private void drink() {
        System.out.println("*** drink() called ***");
    }

    private void hunt() {
        System.out.println("*** hunt() called ***");
    }

    private void fish() {
        System.out.println("*** fish() called ***");
    }

    private void moveTravel() {
        System.out.println("******");
    }

    private void makeTool() {
        System.out.println("***makeTool() called***");
    }

    private void makeContainer() {
        System.out.println("***makeContainer() called***");
    }

    private void makeDevice() {
        System.out.println("***makeDevice() called***");
    }

    private void makeWeapon() {
        System.out.println("***makeWeapon() called***");
    }

    private void makeGarment() {
        System.out.println("***makeGarment() called***");
    }
}
