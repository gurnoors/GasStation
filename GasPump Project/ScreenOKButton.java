import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenOKButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenOKButton extends ScreenButtons
{
    /**
     * Act - do whatever the ScreenOKButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world = getWorld(); 
    ReceiptPrinter rp=world.getObjects(ReceiptPrinter.class).get(0);
  //  rp.setPrintApproval();
     GasPumpState gpState = GasPumpState.getInstance();
    public void act() 
    {
        if(gpState.getState() == State.isCarWashSelected && Greenfoot.mousePressed(this)){
            gpState.setState(State.isValidatedButUnfueled);
            rp.setPrintApproval();
        }
        // Add your action code here.
    }    
}