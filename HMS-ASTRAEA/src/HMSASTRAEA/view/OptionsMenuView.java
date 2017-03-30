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
public class OptionsMenuView extends View
{
    public OptionsMenuView()
    {
        super("\nOptions Menu"
                + "\nV - Volume"
                + "\nM - Music"
                + "\nE - Effects"
                + "\nC - Contrast"
                + "\nD - Display"
                + "\nQ - Quit");
    }
    
    @Override
    public boolean doChoice(String userChoice) 
    {
        switch (userChoice)
                {
                    case "V": this.changeMainVolume();
                        break;
                    case "M": this.changeMusicVolume();
                        break;
                    case "E": this.changeEffectsVolume();
                        break;
                    case "C": this.changeContrast();
                        break;
                    case "D": this.changeDisplay();
                        break;
                    default: 
                        {   
                            ErrorView.display(this.getClass().getName(),
                                    "Invalid selection. Please enter 'V', 'M', 'E', 'C', 'D', or 'Q'");
                        }
                }
        return false;
    }

    private void changeMainVolume() 
    {
        this.console.println("***changeMainVolume() called***");
    }

    private void changeMusicVolume() 
    {
        this.console.println("***changeMusicVolume() called***");
    }

    private void changeEffectsVolume() 
    {
        this.console.println("***changeEffectsVolume() called***");
    }

    private void changeContrast() 
    {
        this.console.println("***changeContrast() called***");
    }

    private void changeDisplay() 
    {
       this.console.println("***changeDisplay() called***");
    }
}
