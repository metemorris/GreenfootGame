import greenfoot.*;
import java.util.*;
import java.io.*;

/**
 * Write a description of class HighscoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighscoreWorld extends World
{

    /**
     * Constructor for objects of class HighscoreWorld.
     * 
     */
    public HighscoreWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
      MenuButton button = new MenuButton();  //to go back to the menu
      addObject(button, 70, 550);
      try{
      prepare();
    }
    catch(IOException ex){//this is empty because it is not needed. It is just here so that the file compiles
        
    }
    }
    public void prepare() throws IOException{//this part is mainly for printing out the highscores
           FileInputStream ifile =  new FileInputStream("highscores.txt");
           Scanner scan = new Scanner(ifile);
           int yCoordinate=0;
           int i =1;
           while(scan.hasNextInt()){//this part prints out the highscores to the screen
           int score=scan.nextInt();
           String name = scan.next();
           yCoordinate= yCoordinate+50;
           TextField about = new TextField(i+") "+name+" --- "+score);
           addObject(about, 300,(yCoordinate));
           i++;
           }
    }
}
