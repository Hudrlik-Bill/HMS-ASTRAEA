/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

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
           + "\nB - Build Item"
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

    private void buildItem() {
        System.out.println("*** buildItem() called ***");
    }

    private void moveTravel() {
        System.out.println("*** moveTravel() called ***");
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
}
