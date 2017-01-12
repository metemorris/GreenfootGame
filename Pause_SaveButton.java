import greenfoot.*;
import java.io.*;

/**
 * Write a description of class Pause_SaveButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause_SaveButton extends Button
{
    /**
     * Act - do whatever the Pause_SaveButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment
     */
    ScoreCounter score;
    Player gamer;
    
    public Pause_SaveButton(ScoreCounter counter, Player p1){
        score=counter;//gets the required variables for saving
        gamer=p1;
    }
    public void act() 
    {
         updateImage("Pause/Save");
         //this part is for saving it into a text file
        if (Greenfoot.mouseClicked(this))  
        {  
            
            try{
            FileOutputStream ofile = new FileOutputStream("savedgame.txt",false);
            PrintWriter pw = new PrintWriter(ofile);
            pw.println(score.getValue());
            pw.println(gamer.getX());
            pw.close();
            Greenfoot.setWorld(new MenuWorld());  }
            catch(IOException ex){
                System.out.println("Save File Corrupted");
            }
        } 
        
    }    
}
