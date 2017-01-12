import greenfoot.*;

/**
 * Write a description of class HighscoreButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighscoreButton extends Button
{
    /**
     * Act - do whatever the HighscoreButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateImage("Highscores");
        if (Greenfoot.mouseClicked(this))  
        {  
             Greenfoot.setWorld(new HighscoreWorld());  
        } 
    }    
}
