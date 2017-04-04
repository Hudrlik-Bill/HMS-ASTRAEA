/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

/**
 *
 * @author Teancum
 */
public class InventoryControl 
{
    //How do I know when my container is full?
        //Shed - weight doesn't matter; volume is limiting factor
        //Individual |OR| Crate |OR| Cart - weight matter (figure out how to offset light weight high volume objects)
public static String[] inventoryAddress  = {
        "lumber",     //0
        "water",      //1
        "hammer",     //2
        "chisel",     //3
        "saw",        //4
        "nail",       //5
        "food",       //6
        "clothes",    //7
        "crate",      //8
        "sail",       //9
        "lantern",    //10
        "fuelBlivot", //11
        "powderKeg",  //12
        "pistol",     //13
        "rifle"      //14
    };
}
