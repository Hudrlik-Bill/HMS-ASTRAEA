/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.view;

/**
 *
 * @author Teancum
 */
public interface ViewInterface 
{
    public abstract void displayMenu();
    public String getUserChoice();
    public boolean doChoice(String userChoice);
}