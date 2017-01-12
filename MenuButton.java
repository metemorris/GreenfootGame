import greenfoot.*;

/**
 * Write a description of class MenuButton1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Button
{
    public void act() 
    {
        updateImage("Menu");//to change the name
        if (Greenfoot.mouseClicked(this))  
        {  
             Greenfoot.setWorld(new MenuWorld());  
        } 
    }    
}
