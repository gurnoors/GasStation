import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   

    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        GasPumpState gpState = GasPumpState.getInstance();
        if (gpState.getState() == State.isUnValidated){
            System.out.println("Current state is isUnvalidated.");
            System.out.println("Inside Keypad act");
            DisplayScreen ds1 = new DisplayScreen("Please Enter Zip Code.");
            world.addObject(ds1,400,100);
            DisplayScreen ds2 = new DisplayScreen("Zip code Validated");
            world.addObject(ds2,400,150);  
            System.out.println("Setting new State isValidatedButUnfueled");
            gpState.setState(State.isValidatedButUnfueled);
            
        }
    }    
}
