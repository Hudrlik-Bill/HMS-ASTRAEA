/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

import HMSASTRAEA.control.GameControl;
import static HMSASTRAEA.control.InventoryControl.inventoryAddress;
import HMSASTRAEA.control.MapControl;
import static HMSASTRAEA.model.Health.healthAddress;
import HMSASTRAEA.model.Player;
import HMSASTREA.exceptions.MapControlException;
import HMSASTRAEA.model.Item;
import HMSASTRAEA.model.Item.gameItemList;
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
        
        GameControl.getCurrentGame().getHealth().passTime();
        GameControl.getCurrentGame().getHealth().fatigue(5);
        int[] currentItems = GameControl.getCurrentGame().getInventory().getCarriedItems();
        
        currentItems[1]+=5;//gather water
        
        GameControl.getCurrentGame().getInventory().setCarriedItems(currentItems);
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
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
        GameControl.getCurrentGame().getHealth().rest();
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
        
    }

    private void eat() {
        this.console.println("*** eat() called ***");
        int[] currentItems = GameControl.getCurrentGame().getInventory().getCarriedItems();
        if(currentItems[6]<1){
            this.console.println("You have no food");
            return;
        }
        currentItems[6]--;
        GameControl.getCurrentGame().getInventory().setCarriedItems(currentItems);
        GameControl.getCurrentGame().getHealth().eat(10);
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
    }

    private void drink() {
        this.console.println("*** drink() called ***");
        int[] currentItems = GameControl.getCurrentGame().getInventory().getCarriedItems();
        if(currentItems[1]<1){
            this.console.println("You have no water");
            return;
        }
        currentItems[1]--;
        GameControl.getCurrentGame().getInventory().setCarriedItems(currentItems);
        GameControl.getCurrentGame().getHealth().drink(10);
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
    }

    private void hunt() {
        this.console.println("*** hunt() called ***");
        GameControl.getCurrentGame().getHealth().passTime();
        GameControl.getCurrentGame().getHealth().fatigue(10);
        int[] currentItems = GameControl.getCurrentGame().getInventory().getCarriedItems();
        
        currentItems[6]+=3;//get some food
  
        GameControl.getCurrentGame().getInventory().setCarriedItems(currentItems);
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
    }

    private void fish() {
        this.console.println("*** fish() called ***");
        GameControl.getCurrentGame().getHealth().passTime();
        GameControl.getCurrentGame().getHealth().fatigue(5);
        int[] currentItems = GameControl.getCurrentGame().getInventory().getCarriedItems();
        
        currentItems[6]+=2;//get some food
  
        
        GameControl.getCurrentGame().getInventory().setCarriedItems(currentItems);
        for(int i= 0;i<4;i++){
            this.console.println(healthAddress[i]);
            this.console.println(GameControl.getCurrentGame().getHealth().getOverallHealth()[i]);
        }
        for(int j = 0;j<15;j++){
            this.console.println(inventoryAddress[j]);
            this.console.println(GameControl.getCurrentGame().getInventory().getCarriedItems()[j]);
        }
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
