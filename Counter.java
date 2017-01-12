import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Counter extends Actor
{
     //this was copied from the TurtleWorld That was provided to us in class
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    protected int value;
    
    public Counter()
    {
        background = getImage();  // get image from class
        value = 0;
        updateImage();
    }
    
    public void act() 
    {
        updateImage();
    }    
    public int getValue(){
        return value;
    }
    private void updateImage()
    {
    
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("" + value, 22, Color.BLACK, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    
    }
    
}
