import greenfoot.*;

/**
 * Write a description of class TextField here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextField extends Button
{
    /**
     * Act - do whatever the TextField wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text;
    public TextField(String newText){
        text=newText;
    }
    
    public void act() 
    {
        updateImage(text);
    }    
}
