import greenfoot.*;

/**
 * Write a description of class Pause_SaveWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause_SaveWorld extends World
{

    /**
     * Constructor for objects of class Pause_SaveWorld.
     * 
     */
    public Pause_SaveWorld()
    {    
       
        super(600, 600, 1); 
        TextField about = new TextField("Saved File Cannot Be Found Or Corrupted");//message displayed on the scceen when there is no text
        addObject(about, 300,300);
       MenuButton button2 = new MenuButton();  //to go back to the menu
        addObject(button2, 70, 550);
    }
}
