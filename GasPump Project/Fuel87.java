import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diesel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel87 extends FuelType
{
    /**
     * Act - do whatever the Diesel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void displayMessage(){
           World world = getWorld();
           world.removeObjects(getWorld().getObjects(DisplayScreen.class));
           DisplayScreen ds = new DisplayScreen("You have selected Unleaded Fuel \n\t\tType");
           DisplayScreen ds2 = new DisplayScreen("Please start filling your tank");
           
           world.addObject(ds,330,120);
           world.addObject(ds2,320,180);
    }
    
    public void act() 
    {
        GasPumpState gpState = GasPumpState.getInstance();
        if (isWorking){
            // Add your action code here.
            if(gpState.getState() == State.isValidatedButUnfueled && Greenfoot.mousePressed(this)){
            this.displayMessage();
            System.out.println("Inside Fuel87 - Setting the state to isFuelSelectedButUnfueled");
            gpState.setState(State.isFuelSelectedButUnfueled);
        
            }
        
        }
        
         else if(Greenfoot.mousePressed(this)){
            System.out.println("Fuel87 Status: "+isWorking);
        GreenfootSound gSound = new GreenfootSound("beepSound.wav");
        gSound.play();
        }
    }     
}
