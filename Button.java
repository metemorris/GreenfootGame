import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
       protected void updateImage(String function)
    {
       Color transparent = new Color(0,0,0,0);
        GreenfootImage image = new GreenfootImage(getImage());
        GreenfootImage text = new GreenfootImage(function, 22, Color.BLACK, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
