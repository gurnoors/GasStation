import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Keypad extends Actor
{
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public static int count=0;
            List<String> keysPressed=new ArrayList<String>();
    public void act() 
    {
        // Add your action code here.
        World world = getWorld();
        GasPumpState gpState = GasPumpState.getInstance();
        int inputX=361; // 378
        if (gpState.getState() == State.isUnValidated){
            System.out.println("Current state is isUnvalidated.");
            System.out.println("Inside Keypad act");
            DisplayScreen ds1 = new DisplayScreen("Please Enter Zip Code.");
            world.addObject(ds1,400,100);
             DisplayScreen ds2 = new DisplayScreen("_ _ _ _ _");
            world.addObject(ds2,400,150);
                                    System.out.println("Added DS2");
            MouseInfo mouse = Greenfoot.getMouseInfo();
            for(String key:keysPressed){
                            DisplayScreen ds3 = new DisplayScreen(key);
                            world.addObject(ds3,inputX,145);
                            inputX=inputX+20;
            }
           if(mouse != null){
               int x= Greenfoot.getMouseInfo().getX();
               int y =Greenfoot.getMouseInfo().getY();
               System.out.println("x:"+x);
                                        System.out.println("y:"+y);
               if(Greenfoot.mousePressed(this)){
                            System.out.println("x:"+x);
                                        System.out.println("y:"+y);
                }
               if((x>=367 && x<=394) && (y>=394 && y<=470) && Greenfoot.mouseClicked(this)){
                System.out.println("1 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("1");
                count++;
                }
                if((x>=396 && x<=425) && (y>=394 && y<=470) && Greenfoot.mouseClicked(this)){
                System.out.println("2 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("2");
                count++;
                }
                if((x>=431 && x<=457) && (y>=394 && y<=470) && Greenfoot.mouseClicked(this)){
                System.out.println("3 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("3");
                }
                if((x>=367 && x<=394) && (y>=474 && y<=502) && Greenfoot.mouseClicked(this)){
                System.out.println("4 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("4");
                }
                 if((x>=396 && x<=425) && (y>=474 && y<=502) && Greenfoot.mouseClicked(this)){
                System.out.println("5 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("5");
                }
                if((x>=431 && x<=457) && (y>=474 && y<=502) && Greenfoot.mouseClicked(this)){
                System.out.println("6 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("6");
                }
                if((x>=367 && x<=394) && (y>=506 && y<=520) && Greenfoot.mouseClicked(this)){
                System.out.println("7 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("7");
                }
                 if((x>=396 && x<=425) && (y>=506 && y<=520) && Greenfoot.mouseClicked(this)){
                System.out.println("8 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("8");
                }
                if((x>=431 && x<=457) && (y>=506 && y<=520) && Greenfoot.mouseClicked(this)){
                System.out.println("9 Pressed!!!!");
                if(keysPressed.size()<5)
                    keysPressed.add("9");
                }
                if((x>=396 && x<=425) && (y>=535 && y<=563) && Greenfoot.mouseClicked(this)){
                if(keysPressed.size()<5)
                    keysPressed.add("0");
                }
                 if((x>=462 && x<=497) && ((y>=474 && y<=502)) && Greenfoot.mouseClicked(this)){
                System.out.println("clear Pressed!!!!");
                if(keysPressed.size()>0)
                    keysPressed.remove(keysPressed.size()-1);
                }
                if(keysPressed.size()==5 && (x>=462 && x<=497) && (y>=506 && y<=520) && Greenfoot.mouseClicked(this)){
                String finalString="";
                    System.out.println("3 Pressed!!!!");
                for(String str: keysPressed){
                    finalString=finalString+str;
                }
                if(finalString.equals("12312")){
                     gpState.setState(State.isValidatedButUnfueled);
                }
              }
            }                       
            if(gpState.getState()==State.isValidatedButUnfueled){
            
                System.out.println("Setting new State isValidatedButUnfueled");
                gpState.setState(State.isValidatedButUnfueled);
             }
        }
    }
}
