import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Actor
{
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GasPumpState gpState = GasPumpState.getInstance();
        World world = getWorld();
        if(gpState.getState() == State.isPrintReceipt){
            
            DisplayScreen ds1 = new DisplayScreen("Do you want to print Receipt ?");
            world.addObject(ds1,400,100);
           
        }
    }    
}
