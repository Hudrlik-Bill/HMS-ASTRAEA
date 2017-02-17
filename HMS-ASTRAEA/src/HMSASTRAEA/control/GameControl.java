/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMSASTRAEA.control;

import HMSASTRAEA.model.Profile;

/**
 *
 * @author Teancum
 */
public class GameControl 
{

    public GameControl() {
    }

    public static Profile createProfile(String playerName)
    {
        if (playerName == null)
        {
            return null;
        }
        System.out.println("\n*** createProfile() called ***");
        
        Profile profileInstance = new Profile();
        profileInstance.setName(playerName);
        
        return profileInstance;
    }
}
