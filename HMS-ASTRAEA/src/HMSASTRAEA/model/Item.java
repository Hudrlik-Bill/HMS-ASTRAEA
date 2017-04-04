/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.model;

/**
 *
 * @author Teancum
 */
public class Item 
{
    private int itemType;
    private double itemWeight;
    private int itemQuantity;
    private Container containerID;
    
    public enum gameItemList
    {
        lumber,     //0
        water,      //1
        hammer,     //2
        chisel,     //3
        saw,        //4
        nail,       //5
        food,       //6
        clothes,    //7
        crate,      //8
        sail,       //9
        lantern,    //10
        fuelBlivot, //11
        powderKeg,  //12
        pistol,     //13
        rifle;      //14
    }
    
}
