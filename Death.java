import greenfoot.*;

/**
 * Write a description of class Death here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Death extends Characters
{
    /**
     * Act - do whatever the Death wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ScoreCounter score;
        public Death (ScoreCounter sCounter)
    {
        score = sCounter;
    }
    
    public void act() 
    {
        setLocation(getX(),getY()+7);//to move down
         tryToEatPlayer();
         endOfRoad();
    }    
    
    
    private void tryToEatPlayer()
    {
      if(canSee(Player.class))
      {
      eat(Player.class);
       Greenfoot.setWorld(new DeadWorld(score.getValue()));
      }
    }

}
