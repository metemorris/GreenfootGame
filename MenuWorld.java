import greenfoot.*;

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{

    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        
        super(600, 600, 1); 
        prepare();
    }
    private void prepare(){//adds ll the button and text
        StartButton button = new StartButton();  
        addObject(button, 200, 240);
        ResumeButton button2 = new ResumeButton();  
        addObject(button2, 400, 240);
        
        HighscoreButton button3 = new HighscoreButton();  
        addObject(button3, 300, 300);
        
        TextField about = new TextField("Keys: Space = Shoot     Right-Left Arrow = Move \n Points:   Eat Fruit=  + 1 \n Shoot Skull = + 1 Fire Bullet = - 1 Shoot Fruit = - 1");
        addObject(about, 300,500);
    }
}
